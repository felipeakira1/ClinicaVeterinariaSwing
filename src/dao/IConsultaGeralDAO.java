/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import models.ConsultaGeral;

/**
 *
 * @author felipe
 */
public interface IConsultaGeralDAO {
    ConsultaGeral create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, int tipo, String motivo, String diagnostico, String prescricoes);
    ConsultaGeral retrieveById(int id);
    List<ConsultaGeral> retrieveAll();
    List<ConsultaGeral> retrieveLast();
    List<ConsultaGeral> retrieveByAnimalId(int animalId);
    List<ConsultaGeral> retrieveByVeterinarioId(int veterinarioId);
    void update(ConsultaGeral consultaGeral);
    void delete(ConsultaGeral consultaGeral);
}
