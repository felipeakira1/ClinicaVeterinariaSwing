package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Animal;

/**
 *
 * @author felipe
 */

public class DbAnimalDAO extends DAO implements IAnimalDAO{
    private static DbAnimalDAO instance;
    
    private DbAnimalDAO() {
        getConnection();
        createTable();
    }
    
    // Singleton
    public static DbAnimalDAO getInstance() {
        return (instance == null ? (instance = new DbAnimalDAO()) : instance);
    }
    
    public Animal create(String nome, String especie, String raca, int idade, String sexo, int tutorId) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO Animal (nome, especie, raca, idade, sexo, tutor_id) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, nome);
            stmt.setString(2, especie);
            stmt.setString(3, raca);
            stmt.setInt(4, idade);
            stmt.setString(5, sexo);
            stmt.setInt(6, tutorId);
            executeUpdate(stmt);
        }  catch(SQLException e) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return this.retrieveById(lastId("Animal", "id"));
    }
    
    public Animal buildObject(ResultSet rs) {
        Animal animal = null;
        try {
            animal = new Animal(rs.getInt("id"), rs.getString("nome"), rs.getString("especie"), rs.getString("raca"), rs.getInt("idade"), rs.getString("sexo"), rs.getInt("tutor_id"));
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return animal;
    }
    
    // Generic retriever
    public List<Animal> retrieve(String query) {
        Animal animal;
        List<Animal> animais = new ArrayList<>();
        ResultSet rs = getResultSet(query);
        try {
            while(rs.next()) {
                animal = buildObject(rs);
                animal.setConsultas(DbConsultaGeralDAO.getInstance().retrieveByAnimalId(animal.getId()));
                animal.setVacinacoes(DbVacinacaoDAO.getInstance().retrieveByAnimalId(animal.getId()));
                animal.setCastracao(DbCastracaoDAO.getInstance().retrieveByAnimalId(animal.getId()));
                animal.setExames(DbExameDAO.getInstance().retrieveByAnimalId(animal.getId()));
                animais.add(animal);
            }
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return animais;
    }
    
    public List<Animal> retrieveAll() {
        return this.retrieve("SELECT * FROM Animal");
    }
    
    public List<Animal> retrieveLast() {
        return this.retrieve("SELECT * FROM Animal WHERE id = " + lastId("Animal", "id"));
    }
    
    public Animal retrieveById(int id) {
        List<Animal> animais = this.retrieve("SELECT * FROM Animal WHERE id = " + id);
        return (animais.isEmpty() ? null : animais.get(0));
    }
    
    public List<Animal> retrieveBySimilarName(String nome) {
        return this.retrieve("SELECT * FROM Animal WHERE nome LIKE '%" + nome + "%'");
    }

    public List<Animal> retrieveByTutorId(int tutorId) {
        return this.retrieve("SELECT * FROM Animal WHERE tutor_id = " + tutorId);
    }
    
    public void update(Animal animal) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("UPDATE Animal SET nome=?, especie=?, raca=?, idade=?, sexo=?, tutor_id=? WHERE id=?");
            stmt.setString(1,  animal.getNome());
            stmt.setString(2, animal.getEspecie());
            stmt.setString(3, animal.getRaca());
            stmt.setInt(4, animal.getIdade());
            stmt.setString(5, animal.getSexo());
            stmt.setInt(6, animal.getTutorId());
            stmt.setInt(7, animal.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    
    public void delete(Animal animal) {
        PreparedStatement stmt;
        try {
            stmt = DAO.getConnection().prepareStatement("DELETE FROM Animal WHERE id = ?");
            stmt.setInt(1, animal.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
