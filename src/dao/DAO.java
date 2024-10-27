/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;


/**
 *
 * @author felipe
 */
public abstract class DAO {
    public static final String DBURL = "jdbc:sqlite:tt001.db";
    private static Connection con;

    public static Connection getConnection() {
        if(con == null) {
            try {
                con = DriverManager.getConnection(DBURL);
                if(con != null) {
                    // DatabaseMetaData meta = con.getMetaData();
                }
            } catch(SQLException e) {
                System.err.println("Exception: " + e.getMessage());
            }
        }
        return con;
    }
    
    protected ResultSet getResultSet(String query) {
        Statement s;
        ResultSet rs = null;
        try {
            s = (Statement) con.createStatement();
            rs = s.executeQuery(query);
        }  catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return rs;
    }
    
    protected int executeUpdate(PreparedStatement queryStatement) throws SQLException {
        int update;
        update = queryStatement.executeUpdate();
        return update;
    }
    
    protected int lastId(String tableName, String primaryKey) {
        Statement s;
        int lastId = -1;
        try {
            s = (Statement) con.createStatement();
            ResultSet rs = s.executeQuery("SELECT MAX(" + primaryKey + ") AS id FROM " + tableName);
            if(rs.next()) {
                lastId = rs.getInt("id");
            } 
        } catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return lastId;
    }
    
    public static void terminar() {
        try {
            (DAO.getConnection()).close();
        }  catch(SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    
    protected final boolean createTable() {
        try {
            PreparedStatement stmt;
            // Tabela Tutor
            stmt = DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS Tutor (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome TEXT NOT NULL, " +
                "endereco TEXT, " +
                "cpf TEXT NOT NULL UNIQUE);");
            executeUpdate(stmt);

            // Tabela Veterinario
            stmt = DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS Veterinario (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome TEXT NOT NULL, " +
                "endereco TEXT, " +
                "cpf TEXT NOT NULL UNIQUE, " +
                "crmv TEXT NOT NULL UNIQUE);");
            executeUpdate(stmt);

            // Tabela Animal
            stmt = DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS Animal (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome TEXT NOT NULL, " +
                "especie TEXT NOT NULL, " +
                "raca TEXT, " +
                "idade INTEGER, " +
                "sexo TEXT, " +
                "tutor_id INTEGER NOT NULL, " +
                "FOREIGN KEY (tutor_id) REFERENCES Tutor(id) ON DELETE CASCADE);");
            executeUpdate(stmt);

            // Tabela Servico
            stmt = DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS Servico (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "data DATE NOT NULL, " +
                "hora TIME NOT NULL, " +
                "valor REAL NOT NULL, " +
                "gasto REAL, " +
                "animal_id INTEGER NOT NULL, " +
                "veterinario_id INTEGER NOT NULL, " +
                "tipo INTEGER NOT NULL, " +
                "FOREIGN KEY (animal_id) REFERENCES Animal(id) ON DELETE CASCADE, " +
                "FOREIGN KEY (veterinario_id) REFERENCES Veterinario(id) ON DELETE CASCADE);");
            executeUpdate(stmt);

            // Tabela Vacina
            stmt = DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS Vacina (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome TEXT NOT NULL, " +
                "descricao TEXT, " +
                "marca TEXT, " +
                "quantidade_estoque INTEGER NOT NULL);");
            executeUpdate(stmt);

            // Tabela Vacinacao
            stmt = DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS Vacinacao (" +
                "servico_id INTEGER PRIMARY KEY, " +
                "vacina_id INTEGER NOT NULL, " +
                "data_proxima_dose STRING, " +
                "FOREIGN KEY (servico_id) REFERENCES Servico(id) ON DELETE CASCADE, " +
                "FOREIGN KEY (vacina_id) REFERENCES Vacina(id) ON DELETE CASCADE);");
            executeUpdate(stmt);

            // Tabela ConsultaGeral
            stmt = DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS ConsultaGeral (" +
                "servico_id INTEGER PRIMARY KEY, " +
                "motivo TEXT, " +
                "diagnostico TEXT, " +
                "prescricoes TEXT, " +
                "FOREIGN KEY (servico_id) REFERENCES Servico(id) ON DELETE CASCADE);");
            executeUpdate(stmt);

            // Tabela Castracao
            stmt = DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS Castracao (" +
                "servico_id INTEGER PRIMARY KEY, " +
                "tipo_castracao TEXT, " +
                "idade_animal INTEGER, " +
                "peso_animal REAL, " +
                "FOREIGN KEY (servico_id) REFERENCES Servico(id) ON DELETE CASCADE);");
            executeUpdate(stmt);

            // Tabela Exame
            stmt = DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS Exame (" +
                "servico_id INTEGER PRIMARY KEY, " +
                "tipo_exame TEXT, " +
                "resultados TEXT, " +
                "FOREIGN KEY (servico_id) REFERENCES Servico(id) ON DELETE CASCADE);");
            executeUpdate(stmt);
            return true;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
