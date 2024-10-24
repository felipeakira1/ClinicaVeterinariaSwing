/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Tutor;

/**
 *
 * @author felipe
 */
public class DbTutorDAO extends DAO implements ITutorDAO {
    private static DbTutorDAO instance;
    
    private DbTutorDAO() {
        getConnection();
        createTable();
    }
    
    // Singleton
    public static DbTutorDAO getInstance() {
        return (instance == null ? (instance = new DbTutorDAO()) : instance);
    }
    
    public Tutor create(String nome, String endereco, String cpf) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO Tutor (nome, endereco, cpf) VALUES (?, ?, ?)");
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setString(3, cpf);
            executeUpdate(stmt);
        }  catch(SQLException e) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return this.retrieveById(lastId("Tutor", "id"));
    }
    
    public Tutor buildObject(ResultSet rs) {
        Tutor tutor = null;
        try {
            tutor = new Tutor(rs.getInt("id"), rs.getString("nome"), rs.getString("endereco"), rs.getString("cpf"));
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return tutor;
    }
    
    // Generic retriever
    public List<Tutor> retrieve(String query) {
        Tutor tutor;
        List<Tutor> tutores = new ArrayList<>();
        ResultSet rs = getResultSet(query);
        try {
            while(rs.next()) {
                tutor = buildObject(rs);
                tutor.setAnimais(DbAnimalDAO.getInstance().retrieveByTutorId(tutor.getId()));
                tutores.add(tutor);
                
            }
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return tutores;
    }
    
    public List<Tutor> retrieveAll() {
        return this.retrieve("SELECT * FROM Tutor");
    }
    
    public List<Tutor> retrieveLast() {
        return this.retrieve("SELECT * FROM Tutor WHERE id = " + lastId("Tutor", "id"));
    }
    
    public Tutor retrieveById(int id) {
        List<Tutor> tutores = this.retrieve("SELECT * FROM Tutor WHERE id = " + id);
        return (tutores.isEmpty() ? null : tutores.get(0));
    }
    
    public List<Tutor> retrieveBySimilarName(String nome) {
        return this.retrieve("SELECT * FROM Tutor WHERE nome LIKE '%" + nome + "%'");
    }
    
    public void update(Tutor tutor) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("UPDATE Tutor SET nome=?, endereco=?, cpf=? WHERE id=?");
            stmt.setString(1,  tutor.getNome());
            stmt.setString(2, tutor.getEndereco());
            stmt.setString(3, tutor.getCpf());
            stmt.setInt(4, tutor.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    
    public void delete(Tutor tutor) {
        PreparedStatement stmt;
        try {
            stmt = DAO.getConnection().prepareStatement("DELETE FROM Tutor WHERE id = ?");
            stmt.setInt(1, tutor.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
