/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.IVacinacaoDAO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import models.Vacinacao;

/**
 *
 * @author felipe
 */
public class VacinacaoController {
    private IVacinacaoDAO vacinacaoDAO;

    public VacinacaoController(IVacinacaoDAO vacinacaoDAO) {
        this.vacinacaoDAO = vacinacaoDAO;
    }

    public Vacinacao createVacinacao(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, int vacina_id, LocalDate proximaDose) {
        return vacinacaoDAO.create(data, hora, valor, gasto, animal_id, veterinario_id, vacina_id, proximaDose);
    }

    public List<Vacinacao> getAllVacinacoes() {
        return this.vacinacaoDAO.retrieveAll();
    }

    public Vacinacao getVacinacaoById(int id) {
        return vacinacaoDAO.retrieveById(id);
    }

    public List<Vacinacao> getVacinacoesByAnimalId(int animalId) {
        return vacinacaoDAO.retrieveByAnimalId(animalId);
    }

    public List<Vacinacao> getVacinacoesByVeterinarioId(int veterinarioId) {
        return vacinacaoDAO.retrieveByVeterinarioId(veterinarioId);
    }
    
    public List<Vacinacao> filterVacinacoesByAnimalVeterinarioAndData(Integer animalId, Integer veterinarioId, LocalDate dataApartir, LocalDate dataAntes) {
        return vacinacaoDAO.retrieveByAnimalAndVeterinarioAndDateRange(animalId, veterinarioId, dataApartir, dataAntes);
    }

    public void updateVacinacao(Vacinacao vacinacao) {
        vacinacaoDAO.update(vacinacao);
    }

    public void deleteVacinacao(Vacinacao vacinacao) {
        vacinacaoDAO.delete(vacinacao);
    }   
}
