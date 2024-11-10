/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import models.Exame;

/**
 *
 * @author Felipe
 */
public interface IExameDAO {
    Exame create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, String tipoExame, String resultados);
    Exame retrieveById(int id);
    List<Exame> retrieveAll();
    List<Exame> retrieveByAnimalId(int animalId);
    List<Exame> retrieveByVeterinarioId(int veterinarioId);
    List<Exame> retrieveByAnimalAndVeterinarioAndDateRange(Integer animalId, Integer veterinarioId, LocalDate dataApartir, LocalDate dataAntes);
    void update(Exame exame);
    void delete(Exame exame);
}
