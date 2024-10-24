/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author felipe
 */
public class Castracao extends Servico {
    private String tipoCastracao;
    private int idadeNaCastracao;
    private double pesoNaCastracao;

    public Castracao(int id, LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, int tipo, String tipoCastracao, int idadeNaCastracao, double pesoNaCastracao) {
        super(id, data, hora, valor, gasto, animal_id, veterinario_id, tipo);
        this.tipoCastracao = tipoCastracao;
        this.idadeNaCastracao = idadeNaCastracao;
        this.pesoNaCastracao = pesoNaCastracao;
    }

    public String getTipoCastracao() {
        return tipoCastracao;
    }

    public int getIdadeNaCastracao() {
        return idadeNaCastracao;
    }

    public double getPesoNaCastracao() {
        return pesoNaCastracao;
    }

    public void setTipoCastracao(String tipoCastracao) {
        this.tipoCastracao = tipoCastracao;
    }

    public void setIdadeNaCastracao(int idadeNaCastracao) {
        this.idadeNaCastracao = idadeNaCastracao;
    }

    public void setPesoNaCastracao(double pesoNaCastracao) {
        this.pesoNaCastracao = pesoNaCastracao;
    }
    
    
}
