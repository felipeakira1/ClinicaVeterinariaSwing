package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Vacina;

public class DbVacinaDAO extends DAO implements IVacinaDAO {
    private static DbVacinaDAO instance;
    
    private DbVacinaDAO() {
        getConnection();
        createTable();
    }
    
    // Singleton
    public static DbVacinaDAO getInstance() {
        return (instance == null ? (instance = new DbVacinaDAO()) : instance);
    }
    
    public Vacina create(String nome, String descricao, String marca, int quantidade_estoque) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO Vacina (nome, descricao, marca, quantidade_estoque) VALUES (?, ?, ?, ?)");
            stmt.setString(1, nome);
            stmt.setString(2, descricao);
            stmt.setString(3, marca);
            stmt.setInt(4, quantidade_estoque);
            executeUpdate(stmt);
        }  catch(SQLException e) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return this.retrieveById(lastId("Vacina", "id"));
    }
    
    public Vacina buildObject(ResultSet rs) {
        Vacina vacina = null;
        try {
            vacina = new Vacina(rs.getInt("id"), rs.getString("nome"), rs.getString("descricao"), rs.getString("marca"), rs.getInt("quantidade_estoque"));
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return vacina;
    }
    
    // Generic retriever
    public List<Vacina> retrieve(String query) {
        List<Vacina> vacinas = new ArrayList<>();
        ResultSet rs = getResultSet(query);
        try {
            while(rs.next()) {
                vacinas.add(buildObject(rs));
            }
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return vacinas;
    }
    
    public List<Vacina> retrieveAll() {
        return this.retrieve("SELECT * FROM Vacina");
    }
    
    public List<Vacina> retrieveLast() {
        return this.retrieve("SELECT * FROM Vacina WHERE id = " + lastId("Vacina", "id"));
    }
    
    public Vacina retrieveById(int id) {
        List<Vacina> vacinas = this.retrieve("SELECT * FROM Vacina WHERE id = " + id);
        return (vacinas.isEmpty() ? null : vacinas.get(0));
    }
    
    public List<Vacina> retrieveBySimilarName(String nome) {
        return this.retrieve("SELECT * FROM Vacina WHERE nome LIKE '%" + nome + "%'");
    }
    
    public void update(Vacina vacina) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("UPDATE Vacina SET nome=?, descricao=?, marca=?, quantidade_estoque=? WHERE id=?");
            stmt.setString(1,  vacina.getNome());
            stmt.setString(2, vacina.getDescricao());
            stmt.setString(3, vacina.getMarca());
            stmt.setInt(4, vacina.getQuantidadeEstoque());
            stmt.setInt(5, vacina.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    
    public void delete(Vacina vacina) {
        PreparedStatement stmt;
        try {
            stmt = DAO.getConnection().prepareStatement("DELETE FROM Vacina WHERE id = ?");
            stmt.setInt(1, vacina.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
