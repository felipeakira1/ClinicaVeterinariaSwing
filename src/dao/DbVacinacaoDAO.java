package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Servico;
import models.Vacinacao;

public class DbVacinacaoDAO extends DAO implements IVacinacaoDAO {
    private static DbVacinacaoDAO instance;
    
    private DbVacinacaoDAO() {
        getConnection();
        createTable();
    }
    
    // Singleton
    public static DbVacinacaoDAO getInstance() {
        return (instance == null ? (instance = new DbVacinacaoDAO()) : instance);
    }
    
    @Override
    public Vacinacao create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, int vacina_id, LocalDate data_proxima_dose) {
        try {
            Servico servico = DbServicoDAO.getInstance().create(data, hora, valor, gasto, animal_id, veterinario_id, 0);
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO Vacinacao (servico_id, vacina_id, data_proxima_dose) VALUES (?, ?, ?)");
            stmt.setInt(1, servico.getId());
            stmt.setInt(2, vacina_id);
            Date dataSQL = Date.valueOf(data_proxima_dose);
            stmt.setDate(3, dataSQL);
            executeUpdate(stmt);
        }  catch(SQLException e) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return this.retrieveById(lastId("Vacinacao", "servico_id"));
    }
    
    public Vacinacao buildObject(ResultSet rs) {
        Vacinacao vacinacao = null;
        try {
            vacinacao = new Vacinacao(rs.getInt("id"), rs.getDate("data").toLocalDate(),rs.getTime("hora").toLocalTime(), rs.getDouble("valor"), rs.getDouble("gasto"), rs.getInt("animal_id"), rs.getInt("veterinario_id"), rs.getInt("tipo"), rs.getInt("vacina_id"), rs.getDate("data_proxima_dose").toLocalDate());
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return vacinacao;
    }
    
    // Generic retriever
    public List<Vacinacao> retrieve(String query) {
        List<Vacinacao> vacinacoes = new ArrayList<>();
        ResultSet rs = getResultSet(query);
        try {
            while(rs.next()) {
                vacinacoes.add(buildObject(rs));
            }
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return vacinacoes;
    }
    
    @Override
    public List<Vacinacao> retrieveAll() {
        return this.retrieve("SELECT * FROM Servico JOIN Vacinacao ON Servico.id = Vacinacao.servico_id");
    }
    
    public List<Vacinacao> retrieveLast() {
        return this.retrieve("SELECT * FROM Servico JOIN Vacinacao ON Servico.id = Vacinacao.servico_id WHERE id = " + lastId("Vacinacao", "id"));
    }
    
    @Override
    public Vacinacao retrieveById(int id) {
        List<Vacinacao> vacinacao = this.retrieve("SELECT * FROM Servico JOIN Vacinacao ON Servico.id = Vacinacao.servico_id WHERE id = " + id);
        return (vacinacao.isEmpty() ? null : vacinacao.get(0));
    }
    
    @Override
    public List<Vacinacao> retrieveByAnimalId(int animalId) {
        return this.retrieve("SELECT * FROM Servico JOIN Vacinacao ON Servico.id = Vacinacao.servico_id WHERE animal_id = " + animalId);
    }

    @Override
    public List<Vacinacao> retrieveByVeterinarioId(int veterinarioId) {
        return this.retrieve("SELECT * FROM Servico JOIN Vacinacao ON Servico.id = Vacinacao.servico_id WHERE veterinario_id = " + veterinarioId);
    }
    
    @Override
    public List<Vacinacao> retrieveByAnimalAndVeterinarioAndDateRange(Integer animalId, Integer veterinarioId, LocalDate dataApartir, LocalDate dataAntes) {
        StringBuilder query = new StringBuilder("SELECT * FROM Servico JOIN Vacinacao ON Servico.id = Vacinacao.servico_id WHERE 1=1");
        
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

    @Override
    public void update(Vacinacao vacinacao) {
        try {
            DbServicoDAO.getInstance().update(vacinacao);
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("UPDATE Vacinacao SET vacina_id=?, data_proxima_dose=? WHERE servico_id=?");
            stmt.setInt(1, vacinacao.getVacinaId());
            Date dataSQL = Date.valueOf(vacinacao.getDataProximaDose());
            stmt.setDate(2, dataSQL);
            stmt.setInt(3, vacinacao.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    
    @Override
    public void delete(Vacinacao vacinacao) {
        DbServicoDAO.getInstance().delete(vacinacao);
    }
}
