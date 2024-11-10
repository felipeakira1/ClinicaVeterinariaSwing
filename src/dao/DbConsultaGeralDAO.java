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
import models.ConsultaGeral;
import models.Servico;

public class DbConsultaGeralDAO extends DAO implements IConsultaGeralDAO {
    private static DbConsultaGeralDAO instance;
    
    private DbConsultaGeralDAO() {
        getConnection();
        createTable();
    }
    
    // Singleton
    public static DbConsultaGeralDAO getInstance() {
        return (instance == null ? (instance = new DbConsultaGeralDAO()) : instance);
    }
    
    public ConsultaGeral create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, int tipo, String motivo, String diagnostico, String prescricoes) {
        try {
            Servico servico = DbServicoDAO.getInstance().create(data, hora, valor, gasto, animal_id, veterinario_id, tipo);
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO ConsultaGeral (servico_id, motivo, diagnostico, prescricoes) VALUES (?, ?, ?, ?)");
            stmt.setInt(1, servico.getId());
            stmt.setString(2, motivo);
            stmt.setString(3, diagnostico);
            stmt.setString(4, prescricoes);
            executeUpdate(stmt);
        }  catch(SQLException e) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return this.retrieveById(lastId("ConsultaGeral", "servico_id"));
    }
    
    public ConsultaGeral buildObject(ResultSet rs) {
        ConsultaGeral consultaGeral = null;
        try {
            consultaGeral = new ConsultaGeral(rs.getInt("id"), rs.getDate("data").toLocalDate(),rs.getTime("hora").toLocalTime(), rs.getDouble("valor"), rs.getDouble("gasto"), rs.getInt("animal_id"), rs.getInt("veterinario_id"), rs.getInt("tipo"), rs.getString("motivo"), rs.getString("diagnostico"), rs.getString("prescricoes"));
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return consultaGeral;
    }
    
    // Generic retriever
    public List<ConsultaGeral> retrieve(String query) {
        List<ConsultaGeral> consultasGerais = new ArrayList<>();
        ResultSet rs = getResultSet(query);
        try {
            while(rs.next()) {
                consultasGerais.add(buildObject(rs));
            }
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return consultasGerais;
    }
    
    public List<ConsultaGeral> retrieveAll() {
        return this.retrieve("SELECT * FROM Servico JOIN ConsultaGeral ON Servico.id = ConsultaGeral.servico_id");
    }
    
    public List<ConsultaGeral> retrieveLast() {
        return this.retrieve("SELECT * FROM Servico JOIN ConsultaGeral ON Servico.id = ConsultaGeral.servico_id WHERE id = " + lastId("ConsultaGeral", "servico_id"));
    }
    
    public ConsultaGeral retrieveById(int id) {
        List<ConsultaGeral> consultaGeral = this.retrieve("SELECT * FROM Servico JOIN ConsultaGeral ON Servico.id = ConsultaGeral.servico_id WHERE id = " + id);
        return (consultaGeral.isEmpty() ? null : consultaGeral.get(0));
    }

    public List<ConsultaGeral> retrieveByAnimalId(int animalId) {
        return this.retrieve("SELECT * FROM Servico JOIN ConsultaGeral ON Servico.id = ConsultaGeral.servico_id WHERE animal_id = " + animalId);
    }

    public List<ConsultaGeral> retrieveByVeterinarioId(int veterinarioId) {
        return this.retrieve("SELECT * FROM Servico JOIN ConsultaGeral ON Servico.id = ConsultaGeral.servico_id WHERE veterinario_id = " + veterinarioId);
    }
    
    public List<ConsultaGeral> retrieveByAnimalAndVeterinarioAndDateRange(Integer animalId, Integer veterinarioId, LocalDate dataApartir, LocalDate dataAntes) {
        System.out.println(dataApartir);
        System.out.println(dataAntes);
        StringBuilder query = new StringBuilder("SELECT * FROM Servico JOIN ConsultaGeral ON Servico.id = ConsultaGeral.servico_id WHERE 1=1");
        
        if (animalId != null) {
            query.append(" AND animal_id = ").append(animalId);
        }
        if (veterinarioId != null) {
            query.append(" AND veterinario_id = ").append(veterinarioId);
        }
        if (dataApartir != null) {
            query.append(" AND datetime(data / 1000, 'unixepoch') >= '").append(dataApartir.toString()).append("'");
        }
        if (dataAntes != null) {
            query.append(" AND datetime(data / 1000, 'unixepoch') <= '").append(dataAntes.toString()).append("'");
        }

        return this.retrieve(query.toString());
    }
    
    public void update(ConsultaGeral consultaGeral) {
        try {
            DbServicoDAO.getInstance().update(consultaGeral);
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("UPDATE ConsultaGeral SET motivo=?, diagnostico=?, prescricoes=? WHERE servico_id=?");
            stmt.setString(1, consultaGeral.getMotivo());
            stmt.setString(2, consultaGeral.getDiagnostico());
            stmt.setString(3, consultaGeral.getPrescricoes());
            stmt.setInt(4, consultaGeral.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    
    public void delete(ConsultaGeral consultaGeral) {
        DbServicoDAO.getInstance().delete(consultaGeral);
    }
}
