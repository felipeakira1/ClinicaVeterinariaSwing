/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.IExameDAO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import models.Exame;

/**
 *
 * @author felipe
 */
public class ExameController {
    private IExameDAO exameDAO;

    public ExameController(IExameDAO exameDAO) {
        this.exameDAO = exameDAO;
    }

    public Exame createExame(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, String tipoExame, String resultados) {
        return exameDAO.create(data, hora, valor, gasto, animal_id, veterinario_id, tipoExame, resultados);
    }

    public List<Exame> getAllExames() {
        return this.exameDAO.retrieveAll();
    }

    public Exame getExameById(int id) {
        return exameDAO.retrieveById(id);
    }

    public List<Exame> getExamesByAnimalId(int animalId) {
        return exameDAO.retrieveByAnimalId(animalId);
    }

    public List<Exame> getExamesByVeterinarioId(int veterinarioId) {
        return exameDAO.retrieveByVeterinarioId(veterinarioId);
    }
    
    public List<Exame> filterExamesByAnimalVeterinarioAndData(Integer animalId, Integer veterinarioId, LocalDate dataApartir, LocalDate dataAntes) {
        return exameDAO.retrieveByAnimalAndVeterinarioAndDateRange(animalId, veterinarioId, dataApartir, dataAntes);
    }

    public void updateExame(Exame exame) {
        exameDAO.update(exame);
    }

    public void deleteExame(Exame exame) {
        exameDAO.delete(exame);
    }
}
