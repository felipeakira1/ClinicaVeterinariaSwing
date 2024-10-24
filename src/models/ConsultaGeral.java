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
public class ConsultaGeral extends Servico {
    
    private String motivo;
    private String diagnostico;
    private String prescricoes;
    
    public ConsultaGeral(int id, LocalDate data, LocalTime hora, double valor, double gasto, int animalId, int veterinarioId, int tipo, String motivo, String diagnostico, String prescricoes) {
        super(id, data, hora, valor, gasto, animalId, veterinarioId, tipo);
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.prescricoes = prescricoes;    
    }

    public String getMotivo() {
        return motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getPrescricoes() {
        return prescricoes;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setPrescricoes(String prescricoes) {
        this.prescricoes = prescricoes;
    }
    
    
}
