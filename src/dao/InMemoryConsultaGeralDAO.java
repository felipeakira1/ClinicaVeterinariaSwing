/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import models.ConsultaGeral;

/**
 *
 * @author felipe
 */
public class InMemoryConsultaGeralDAO extends DAO implements IConsultaGeralDAO {
    private List<ConsultaGeral> consultasGerais;
    private static InMemoryConsultaGeralDAO instance;
    private int currentId;
    
    private InMemoryConsultaGeralDAO() {
        this.consultasGerais = new ArrayList<>();
        this.currentId = 1;
        consultasGerais.add(new ConsultaGeral(currentId++, LocalDate.of(2024, 10, 17), LocalTime.of(14, 30), 150.00, 50.00, 1, 1, 1, "Sujeira ", "Animal saudavel", "Nenhuma prescricao necessária"));
    }
    
    public static InMemoryConsultaGeralDAO getInstance() {
        if(instance == null) {
            instance = new InMemoryConsultaGeralDAO();
        }
        return instance;
    }
    
    @Override
    public ConsultaGeral create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, int tipo, String motivo, String diagnostico, String prescricoes) {
        ConsultaGeral consultaGeral = new ConsultaGeral(currentId++, data, hora, valor, gasto, animal_id, veterinario_id, tipo, motivo, diagnostico, prescricoes);
        consultasGerais.add(consultaGeral);
        return consultaGeral;
    }

    @Override
    public ConsultaGeral retrieveById(int id) {
        Optional<ConsultaGeral> consultaGeral = consultasGerais.stream().filter(cg -> cg.getId() == id).findFirst();
        return consultaGeral.orElse(null);
    }

    @Override
    public List<ConsultaGeral> retrieveAll() {
        return new ArrayList<>(consultasGerais); // Retorna uma cópia da lista para evitar modificações externas
    }

    @Override
    public List<ConsultaGeral> retrieveLast() {
        if (consultasGerais.isEmpty()) {
            return new ArrayList<>();
        }
        return consultasGerais.stream()
                              .filter(cg -> cg.getId() == (currentId - 1))
                              .collect(Collectors.toList());
    }

    @Override
    public List<ConsultaGeral> retrieveByAnimalId(int animalId) {
        return consultasGerais.stream()
                              .filter(cg -> cg.getAnimalId() == animalId)
                              .collect(Collectors.toList());
    }

    @Override
    public List<ConsultaGeral> retrieveByVeterinarioId(int veterinarioId) {
        return consultasGerais.stream()
                              .filter(cg -> cg.getVeterinarioId() == veterinarioId)
                              .collect(Collectors.toList());
    }
    
    @Override
    public List<ConsultaGeral> retrieveByAnimalAndVeterinarioAndDateRange(Integer animalId, Integer veterinarioId, LocalDate dataApartir, LocalDate dataAntes) {
        return consultasGerais.stream()
                              .filter(cg -> cg.getAnimalId() == animalId)
                              .filter(cg -> cg.getVeterinarioId() == veterinarioId)
                              .filter(cg -> (cg.getData().isEqual(dataApartir) || cg.getData().isAfter(dataApartir)) &&
                                            (cg.getData().isEqual(dataAntes) || cg.getData().isBefore(dataAntes)))
                              .collect(Collectors.toList());
    }

    @Override
    public void update(ConsultaGeral consultaGeral) {
        Optional<ConsultaGeral> existingConsultaGeral = consultasGerais.stream().filter(cg -> cg.getId() == consultaGeral.getId()).findFirst();
        if (existingConsultaGeral.isPresent()) {
            consultasGerais.remove(existingConsultaGeral.get());
            consultasGerais.add(consultaGeral);
        }
    }

    @Override
    public void delete(ConsultaGeral consultaGeral) {
        consultasGerais.removeIf(cg -> cg.getId() == consultaGeral.getId());
    }
}
