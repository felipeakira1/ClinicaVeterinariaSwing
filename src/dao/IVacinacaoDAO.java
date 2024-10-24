/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import models.Vacinacao;

/**
 *
 * @author Felipe
 */
public interface IVacinacaoDAO {
    Vacinacao create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, int vacina_id, LocalDate data_proxima_dose);
    Vacinacao retrieveById(int id);
    List<Vacinacao> retrieveAll();
    List<Vacinacao> retrieveByAnimalId(int animalId);
    List<Vacinacao> retrieveByVeterinarioId(int veterinarioId);
    void update(Vacinacao vacinacao);
    void delete(Vacinacao vacinacao);
}
