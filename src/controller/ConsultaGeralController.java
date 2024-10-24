/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.IConsultaGeralDAO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import models.ConsultaGeral;

/**
 *
 * @author felipe
 */
public class ConsultaGeralController {
    private IConsultaGeralDAO consultaGeralDAO;

    public ConsultaGeralController(IConsultaGeralDAO consultaGeralDAO) {
        this.consultaGeralDAO = consultaGeralDAO;
    }
    
    public ConsultaGeral createConsultaGeral(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, String motivo, String diagnostico, String prescricoes) {
        return consultaGeralDAO.create(data, hora, valor, gasto, animal_id, veterinario_id, 1, motivo, diagnostico, prescricoes);
    }

    public List<ConsultaGeral> getAllConsultasGerais() {
        return this.consultaGeralDAO.retrieveAll();
    }

    public ConsultaGeral getConsultaGeralById(int id) {
        return consultaGeralDAO.retrieveById(id);
    }

    public List<ConsultaGeral> getConsultasGeraisByAnimalId(int animalId) {
        return consultaGeralDAO.retrieveByAnimalId(animalId);
    }

    public List<ConsultaGeral> getConsultasGeraisByVeterinarioId(int veterinarioId) {
        return consultaGeralDAO.retrieveByVeterinarioId(veterinarioId);
    }

    public void updateConsultaGeral(ConsultaGeral consultaGeral) {
        consultaGeralDAO.update(consultaGeral);
    }

    public void deleteConsultaGeral(ConsultaGeral consultaGeral) {
        consultaGeralDAO.delete(consultaGeral);
    }
}
