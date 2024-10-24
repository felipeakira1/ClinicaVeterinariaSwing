/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import models.Servico;

/**
 *
 * @author felipe
 */
public interface IServicoDAO {
    Servico create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, int tipo);
    Servico retrieveById(int id);
    List<Servico> retrieveAll();
    List<Servico> retrieveLast();
    void update(Servico servico);
    void delete(Servico servico);
}
