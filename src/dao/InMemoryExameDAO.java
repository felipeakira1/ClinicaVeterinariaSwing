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
import models.Exame;

/**
 *
 * @author Felipe
 */
public class InMemoryExameDAO extends DAO implements IExameDAO {
     private List<Exame> exames;
    private int currentId;

    private static InMemoryExameDAO instance;

    private InMemoryExameDAO() {
        this.exames = new ArrayList<>();
        this.currentId = 1; // Simulação de auto-incremento de IDs
    }

    // Singleton
    public static InMemoryExameDAO getInstance() {
        if (instance == null) {
            instance = new InMemoryExameDAO();
        }
        return instance;
    }

    @Override
    public Exame create(LocalDate data, LocalTime hora,  double valor, double gasto, int animal_id, int veterinario_id, String tipoExame, String resultados) {
        Exame exame = new Exame(currentId++, data, hora, valor, gasto, animal_id, veterinario_id, 3, tipoExame, resultados);
        exames.add(exame);
        return exame;
    }

    @Override
    public Exame retrieveById(int id) {
        Optional<Exame> exame = exames.stream().filter(e -> e.getId() == id).findFirst();
        return exame.orElse(null);
    }

    @Override
    public List<Exame> retrieveAll() {
        return new ArrayList<>(exames); // Retorna uma cópia da lista para evitar modificações externas
    }

    @Override
    public List<Exame> retrieveByAnimalId(int animalId) {
        return exames.stream()
                .filter(e -> e.getAnimalId() == animalId)
                .collect(Collectors.toList());
    }

    @Override
    public List<Exame> retrieveByVeterinarioId(int veterinarioId) {
        return exames.stream()
                .filter(e -> e.getVeterinarioId() == veterinarioId)
                .collect(Collectors.toList());
    }
    
    @Override
    public List<Exame> retrieveByAnimalAndVeterinarioAndDateRange(Integer animalId, Integer veterinarioId, LocalDate dataApartir, LocalDate dataAntes) {
        return exames.stream()
                              .filter(cg -> cg.getAnimalId() == animalId)
                              .filter(cg -> cg.getVeterinarioId() == veterinarioId)
                              .filter(cg -> (cg.getData().isEqual(dataApartir) || cg.getData().isAfter(dataApartir)) &&
                                            (cg.getData().isEqual(dataAntes) || cg.getData().isBefore(dataAntes)))
                              .collect(Collectors.toList());
    }

    @Override
    public void update(Exame exame) {
        Optional<Exame> existingExame = exames.stream().filter(e -> e.getId() == exame.getId()).findFirst();
        if (existingExame.isPresent()) {
            exames.remove(existingExame.get());
            exames.add(exame);
        }
    }

    @Override
    public void delete(Exame exame) {
        exames.removeIf(e -> e.getId() == exame.getId());
    }
}
