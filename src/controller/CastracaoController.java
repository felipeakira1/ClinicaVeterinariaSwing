/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ICastracaoDAO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import models.Castracao;

/**
 *
 * @author felipe
 */
public class CastracaoController {
    private ICastracaoDAO castracaoDAO;

    public CastracaoController(ICastracaoDAO castracaoDAO) {
        this.castracaoDAO = castracaoDAO;
    }

    public Castracao createCastracao(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, String tipoCastracao, int idade, double peso) {
        return castracaoDAO.create(data, hora, valor, gasto, animal_id, veterinario_id, tipoCastracao, idade, peso);
    }

    public List<Castracao> getAllCastracoes() {
        return this.castracaoDAO.retrieveAll();
    }

    public Castracao getCastracaoById(int id) {
        return castracaoDAO.retrieveById(id);
    }

    public List<Castracao> filterCastracaoByAnimalVeterinarioAndData(Integer animalId, Integer veterinarioId, LocalDate dataApartir, LocalDate dataAntes) {
        return castracaoDAO.retrieveByAnimalAndVeterinarioAndDateRange(animalId, veterinarioId, dataApartir, dataAntes);
    }

    public void updateCastracao(Castracao castracao) {
        castracaoDAO.update(castracao);
    }

    public void deleteCastracao(Castracao castracao) {
        castracaoDAO.delete(castracao);
    }
}
