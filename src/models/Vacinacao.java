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
public class Vacinacao extends Servico{
    private int servicoId;
    private int vacina_id;
    private LocalDate DataProximaDose;

    public Vacinacao(int id, LocalDate data, LocalTime hora, double valor, double gasto, int animalId, int veterinarioId, int tipo, int vacina_id, LocalDate DataProximaDose) {
        super(id, data, hora, valor, gasto, animalId, veterinarioId, tipo);
        this.servicoId = id;
        this.vacina_id = vacina_id;
        this.DataProximaDose = DataProximaDose;
    }

    public int getServicoId() {
        return servicoId;
    }

    public int getVacinaId() {
        return vacina_id;
    }

    public LocalDate getDataProximaDose() {
        return DataProximaDose;
    }
    
    public void setVacinaId(int id) {
        this.vacina_id = id;
    }

    public void setDataProximaDose(LocalDate DataProximaDose) {
        this.DataProximaDose = DataProximaDose;
    }
}
