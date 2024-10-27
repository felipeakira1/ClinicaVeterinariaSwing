/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Exame;
import models.Servico;

/**
 *
 * @author felipe
 */
public class DbExameDAO extends DAO implements IExameDAO {
    private static DbExameDAO instance;
    
    private DbExameDAO() {
        getConnection();
        createTable();
    }
    
    // Singleton
    public static DbExameDAO getInstance() {
        return (instance == null ? (instance = new DbExameDAO()) : instance);
    }
    
    public Exame create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, String tipoExame, String resultados) {
        try {
            Servico servico = DbServicoDAO.getInstance().create(data, hora, valor, gasto, animal_id, veterinario_id, 3);
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO Exame (servico_id, tipo_exame, resultados) VALUES (?, ?, ?)");
            stmt.setInt(1, servico.getId());
            stmt.setString(2, tipoExame);
            stmt.setString(3, resultados);
            executeUpdate(stmt);
        }  catch(SQLException e) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return this.retrieveById(lastId("Exame", "servico_id"));
    }
    
    public Exame buildObject(ResultSet rs) {
        Exame exame = null;
        try {
            exame = new Exame(rs.getInt("id"), rs.getDate("data").toLocalDate(),rs.getTime("hora").toLocalTime(), rs.getDouble("valor"), rs.getDouble("gasto"), rs.getInt("animal_id"), rs.getInt("veterinario_id"), rs.getInt("tipo"), rs.getString("tipo_exame"), rs.getString("resultados"));
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return exame;
    }
    
    // Generic retriever
    public List<Exame> retrieve(String query) {
        List<Exame> exames = new ArrayList<>();
        ResultSet rs = getResultSet(query);
        try {
            while(rs.next()) {
                exames.add(buildObject(rs));
            }
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return exames;
    }
    
    public List<Exame> retrieveAll() {
        return this.retrieve("SELECT * FROM Servico JOIN Exame ON Servico.id = Exame.servico_id");
    }
    
    public List<Exame> retrieveLast() {
        return this.retrieve("SELECT * FROM Servico JOIN Exame ON Servico.id = Exame.servico_id WHERE id = " + lastId("Exame", "id"));
    }
    
    public Exame retrieveById(int id) {
        List<Exame> exame = this.retrieve("SELECT * FROM Servico JOIN Exame ON Servico.id = Exame.servico_id WHERE id = " + id);
        return (exame.isEmpty() ? null : exame.get(0));
    }

    public List<Exame> retrieveByAnimalId(int animalId) {
        return this.retrieve("SELECT * FROM Servico JOIN Exame ON Servico.id = Exame.servico_id WHERE animal_id = " + animalId);
    }
    
    public List<Exame> retrieveByVeterinarioId(int veterinarioId) {
        return this.retrieve("SELECT * FROM Servico JOIN Exame ON Servico.id = Exame.servico_id WHERE veterinario_id = " + veterinarioId);
    }

    public void update(Exame exame) {
        try {
            DbServicoDAO.getInstance().update(exame);
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("UPDATE Exame SET tipo_exame=?, resultados=? WHERE servico_id=?");
            stmt.setString(1, exame.getTipoExame());
            stmt.setString(2, exame.getResultados());
            stmt.setInt(3, exame.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    
    public void delete(Exame exame) {
        DbServicoDAO.getInstance().delete(exame);
    }
}
