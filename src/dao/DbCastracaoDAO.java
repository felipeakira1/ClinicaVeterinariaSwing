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
import models.Castracao;
import models.Servico;

/**
 *
 * @author felipe
 */
public class DbCastracaoDAO extends DAO implements ICastracaoDAO {
    private static DbCastracaoDAO instance;
    
    private DbCastracaoDAO() {
        getConnection();
        createTable();
    }
    
    // Singleton
    public static DbCastracaoDAO getInstance() {
        return (instance == null ? (instance = new DbCastracaoDAO()) : instance);
    }
    
    @Override
    public Castracao create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, String tipoCastracao, int idadeNaCastracao, double pesoNaCastracao) {
        try {
            Servico servico = DbServicoDAO.getInstance().create(data, hora, valor, gasto, animal_id, veterinario_id, 2);
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO Castracao (servico_id, tipo_castracao, idade_animal, peso_animal) VALUES (?, ?, ?, ?)");
            stmt.setInt(1, servico.getId());
            stmt.setString(2, tipoCastracao);
            stmt.setInt(3, idadeNaCastracao);
            stmt.setDouble(4, pesoNaCastracao);
            executeUpdate(stmt);
        }  catch(SQLException e) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return this.retrieveById(lastId("Castracao", "servico_id"));
    }
    
    public Castracao buildObject(ResultSet rs) {
        Castracao castracao = null;
        try {
            castracao = new Castracao(rs.getInt("id"), rs.getDate("data").toLocalDate(),rs.getTime("hora").toLocalTime(), rs.getDouble("valor"), rs.getDouble("gasto"), rs.getInt("animal_id"), rs.getInt("veterinario_id"), rs.getInt("tipo"), rs.getString("tipo_castracao"), rs.getInt("idade_animal"), rs.getDouble("peso_animal"));
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return castracao;
    }
    
    // Generic retriever
    public List<Castracao> retrieve(String query) {
        List<Castracao> castracoes = new ArrayList<>();
        ResultSet rs = getResultSet(query);
        try {
            while(rs.next()) {
                castracoes.add(buildObject(rs));
            }
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return castracoes;
    }
    
    @Override
    public List<Castracao> retrieveAll() {
        return this.retrieve("SELECT * FROM Servico JOIN Castracao ON Servico.id = Castracao.servico_id");
    }
    
    public List<Castracao> retrieveLast() {
        return this.retrieve("SELECT * FROM Servico JOIN Castracao ON Servico.id = Castracao.servico_id WHERE id = " + lastId("Castracao", "id"));
    }
    
    @Override
    public Castracao retrieveById(int id) {
        List<Castracao> castracao = this.retrieve("SELECT * FROM Servico JOIN Castracao ON Servico.id = Castracao.servico_id WHERE id = " + id);
        return (castracao.isEmpty() ? null : castracao.get(0));
    }

    @Override
    public Castracao retrieveByAnimalId(int animalId) {
        List<Castracao> castracao = this.retrieve("SELECT * FROM Servico JOIN Castracao ON Servico.id = Castracao.servico_id WHERE animal_id = " + animalId);
        return (castracao.isEmpty() ? null : castracao.get(0));
    }

    @Override
    public Castracao retrieveByVeterinarioId(int veterinarioId) {
        List<Castracao> castracao = this.retrieve("SELECT * FROM Servico JOIN Castracao ON Servico.id = Castracao.servico_id WHERE veterinario_id = " + veterinarioId);
        return (castracao.isEmpty() ? null : castracao.get(0));
    }
    
    @Override
    public List<Castracao> retrieveByAnimalAndVeterinarioAndDateRange(Integer animalId, Integer veterinarioId, LocalDate dataApartir, LocalDate dataAntes) {
        StringBuilder query = new StringBuilder("SELECT * FROM Servico JOIN Castracao ON Servico.id = Castracao.servico_id WHERE 1=1");
        
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
    public void update(Castracao castracao) {
        try {
            DbServicoDAO.getInstance().update(castracao);
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("UPDATE Castracao SET tipo_castracao=?, idade_animal=?, peso_animal=? WHERE servico_id=?");
            stmt.setString(1, castracao.getTipoCastracao());
            stmt.setInt(2, castracao.getIdadeNaCastracao());
            stmt.setDouble(3, castracao.getPesoNaCastracao());
            stmt.setInt(4, castracao.getId());
            executeUpdate(stmt);
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    
    @Override
    public void delete(Castracao castracao) {
        DbServicoDAO.getInstance().delete(castracao);
    }
}
