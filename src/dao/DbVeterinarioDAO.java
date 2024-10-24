package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Veterinario;

public class DbVeterinarioDAO extends DAO implements IVeterinarioDAO {
    private static DbVeterinarioDAO instance;
    
    private DbVeterinarioDAO() {
        getConnection();
        createTable();
    }
    
    // Singleton
    public static DbVeterinarioDAO getInstance() {
        return (instance == null ? (instance = new DbVeterinarioDAO()) : instance);
    }
    
    @Override
    public Veterinario create(String nome, String endereco, String cpf, String crmv) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO Veterinario (nome, endereco, cpf, crmv) VALUES (?, ?, ?, ?)");
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setString(3, cpf);
            stmt.setString(4, crmv);
            executeUpdate(stmt);
        }  catch(SQLException e) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return this.retrieveById(lastId("Veterinario", "id"));
    }
    
    public Veterinario buildObject(ResultSet rs) {
        Veterinario veterinario = null;
        try {
            veterinario = new Veterinario(rs.getInt("id"), rs.getString("nome"), rs.getString("endereco"), rs.getString("cpf"), rs.getString("crmv"));
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return veterinario;
    }
    
    // Generic retriever
    public List<Veterinario> retrieve(String query) {
        Veterinario veterinario;
        List<Veterinario> veterinarios = new ArrayList<>();
        ResultSet rs = getResultSet(query);
        try {
            while(rs.next()) {
                veterinario = buildObject(rs);
                veterinario.setConsultas(DbConsultaGeralDAO.getInstance().retrieveByVeterinarioId(veterinario.getId()));
                veterinario.setVacinacoes(DbVacinacaoDAO.getInstance().retrieveByVeterinarioId(veterinario.getId()));
                veterinario.setCastracao(DbCastracaoDAO.getInstance().retrieveByVeterinarioId(veterinario.getId()));
                veterinario.setExames(DbExameDAO.getInstance().retrieveByVeterinarioId(veterinario.getId()));
                veterinarios.add(veterinario);
            }
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return veterinarios;
    }
    
    
    @Override
    public List<Veterinario> retrieveAll() {
        return this.retrieve("SELECT * FROM Veterinario");
    }
    
    @Override
    public List<Veterinario> retrieveLast() {
        return this.retrieve("SELECT * FROM Veterinario WHERE id = " + lastId("Veterinario", "id"));
    }
    
    @Override
    public Veterinario retrieveById(int id) {
        List<Veterinario> veterinarios = this.retrieve("SELECT * FROM Veterinario WHERE id = " + id);
        return (veterinarios.isEmpty() ? null : veterinarios.get(0));
    }
    
    @Override
    public List<Veterinario> retrieveBySimilarName(String nome) {
        return this.retrieve("SELECT * FROM Veterinario WHERE nome LIKE '%" + nome + "%'");
    }
    
    @Override
    public void update(Veterinario veterinario) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("UPDATE Veterinario SET nome=?, endereco=?, cpf=?, crmv=? WHERE id=?");
            stmt.setString(1,  veterinario.getNome());
            stmt.setString(2, veterinario.getEndereco());
            stmt.setString(3, veterinario.getCpf());
            stmt.setString(4, veterinario.getCrmv());
            stmt.setInt(5, veterinario.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    
    @Override
    public void delete(Veterinario veterinario) {
        PreparedStatement stmt;
        try {
            stmt = DAO.getConnection().prepareStatement("DELETE FROM Veterinario WHERE id = ?");
            stmt.setInt(1, veterinario.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
