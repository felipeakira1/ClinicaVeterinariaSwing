package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Servico;

/**
 *
 * @author felipe
 */
public class DbServicoDAO extends DAO implements IServicoDAO{
    private static DbServicoDAO instance;
    
    private DbServicoDAO() {
        getConnection();
        createTable();
    }
    
    // Singleton
    public static DbServicoDAO getInstance() {
        return (instance == null ? (instance = new DbServicoDAO()) : instance);
    }
    
    public Servico create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, int tipo) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO Servico (data, hora, valor, gasto, animal_id, veterinario_id, tipo) VALUES (?, ?, ?, ?, ?, ?)");
            Date dataSQL = Date.valueOf(data);
            Time horaSQL = Time.valueOf(hora);
            stmt.setDate(1, dataSQL);
            stmt.setTime(2, horaSQL);
            stmt.setDouble(3, valor);
            stmt.setDouble(4, gasto);
            stmt.setInt(5, animal_id);
            stmt.setInt(6, veterinario_id);
            stmt.setInt(7, tipo);
            executeUpdate(stmt);
        }  catch(SQLException e) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return this.retrieveById(lastId("Servico", "id"));
    }
    
    public Servico buildObject(ResultSet rs) {
        Servico servico = null;
        try {
            servico = new Servico(rs.getInt("id"), rs.getDate("data").toLocalDate(), rs.getTime("hora").toLocalTime(), rs.getDouble("valor"), rs.getDouble("gasto"), rs.getInt("animal_id"), rs.getInt("veterinario_id"), rs.getInt("tipo"));
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return servico;
    }
    
    // Generic retriever
    public List<Servico> retrieve(String query) {
        List<Servico> servicos = new ArrayList<>();
        ResultSet rs = getResultSet(query);
        try {
            while(rs.next()) {
                servicos.add(buildObject(rs));
            }
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return servicos;
    }
    
    public List<Servico> retrieveAll() {
        return this.retrieve("SELECT * FROM Servico");
    }
    
    public List<Servico> retrieveLast() {
        return this.retrieve("SELECT * FROM Servico WHERE id = " + lastId("Servico", "id"));
    }
    
    public Servico retrieveById(int id) {
        List<Servico> servico = this.retrieve("SELECT * FROM Servico WHERE id = " + id);
        return (servico.isEmpty() ? null : servico.get(0));
    }
    
    public void update(Servico servico) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("UPDATE Servico SET data=?, hora=?, valor=?, gasto=?, animalId=?, veterinarioId=?, tipo=? WHERE id=?");
            Date dataSQL = Date.valueOf(servico.getData());
            Time horaSQL = Time.valueOf(servico.getHora());
            stmt.setDate(1, dataSQL);
            stmt.setTime(2, horaSQL);
            stmt.setDouble(3, servico.getValor());
            stmt.setDouble(4, servico.getGasto());
            stmt.setInt(5, servico.getAnimalId());
            stmt.setInt(6, servico.getVeterinarioId());
            stmt.setInt(7, servico.getTipo());
            stmt.setInt(8, servico.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    
    public void delete(Servico servico) {
        PreparedStatement stmt;
        try {
            stmt = DAO.getConnection().prepareStatement("DELETE FROM Servico WHERE id = ?");
            stmt.setInt(1, servico.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
