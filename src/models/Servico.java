/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author felipe
 */
public class Servico {
    private int id;
    private LocalDate data;
    private LocalTime hora;
    private double valor;
    private double gasto;
    private int animalId;
    private int veterinarioId;
    private int tipo; // 0 = Vacinacao, 1 - ConsultaGeral, 2 - Castracao, 3 - Exame

    public Servico(int id, LocalDate data, LocalTime hora, double valor, double gasto, int animalId, int veterinarioId, int tipo) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.valor = valor;
        this.gasto = gasto;
        this.animalId = animalId;
        this.veterinarioId = veterinarioId;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public int getAnimalId() {
        return animalId;
    }

    public int getVeterinarioId() {
        return veterinarioId;
    }

    public LocalDate getData() {
        return data;
    }
    
    public LocalTime getHora() {
        return hora;
    }

    public double getValor() {
        return valor;
    }

    public double getGasto() {
        return gasto;
    }
    
    public int getTipo() {
        return tipo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    @Override
    public String toString() {
        return "Servico{" + "id=" + id + ", data=" + data + ", valor=" + valor + ", gasto=" + gasto + ", animalId=" + animalId + ", veterinarioId=" + veterinarioId + ", tipo=" + tipo + '}';
    }
    
    
}
