/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import models.Castracao;

/**
 *
 * @author Felipe
 */
public interface ICastracaoDAO {
    Castracao create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, String tipoCastracao, int idadeNaCastracao, double pesoNaCastracao);
    Castracao retrieveById(int id);
    List<Castracao> retrieveAll();
    Castracao retrieveByAnimalId(int animalId);
    Castracao retrieveByVeterinarioId(int veterinarioId);
    List<Castracao> retrieveByAnimalAndVeterinarioAndDateRange(Integer animalId, Integer veterinarioId, LocalDate dataApartir, LocalDate dataAntes);
    void update(Castracao castracao);
    void delete(Castracao castracao);
}
