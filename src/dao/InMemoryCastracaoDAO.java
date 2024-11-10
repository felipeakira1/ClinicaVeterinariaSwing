/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import models.Castracao;

/**
 *
 * @author Felipe
 */
public class InMemoryCastracaoDAO extends DAO implements ICastracaoDAO {
    private List<Castracao> castracoes;
    private int currentId;

    private static InMemoryCastracaoDAO instance;

    private InMemoryCastracaoDAO() {
        this.castracoes = new ArrayList<>();
        this.currentId = 1; // Simulação de auto-incremento de IDs
    }

    // Singleton
    public static InMemoryCastracaoDAO getInstance() {
        if (instance == null) {
            instance = new InMemoryCastracaoDAO();
        }
        return instance;
    }

    @Override
    public Castracao create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, String tipoCastracao, int idadeNaCastracao, double pesoNaCastracao) {
        Castracao castracao = new Castracao(currentId++, data, hora, valor, gasto, animal_id, veterinario_id, 2, tipoCastracao, idadeNaCastracao, pesoNaCastracao);
        castracoes.add(castracao);
        return castracao;
    }

    @Override
    public Castracao retrieveById(int id) {
        Optional<Castracao> castracao = castracoes.stream().filter(c -> c.getId() == id).findFirst();
        return castracao.orElse(null);
    }

    @Override
    public List<Castracao> retrieveAll() {
        return new ArrayList<>(castracoes); // Retorna uma cópia da lista para evitar modificações externas
    }

    @Override
    public Castracao retrieveByAnimalId(int animalId) {
        Optional<Castracao> castracao = castracoes.stream().filter(c -> c.getAnimalId() == animalId).findFirst();
        return castracao.orElse(null);
    }

    @Override
    public Castracao retrieveByVeterinarioId(int veterinarioId) {
        Optional<Castracao> castracao = castracoes.stream().filter(c -> c.getVeterinarioId() == veterinarioId).findFirst();
        return castracao.orElse(null);
    }

    @Override
    public List<Castracao> retrieveByAnimalAndVeterinarioAndDateRange(Integer animalId, Integer veterinarioId, LocalDate dataApartir, LocalDate dataAntes) {
        return castracoes.stream()
                              .filter(cg -> cg.getAnimalId() == animalId)
                              .filter(cg -> cg.getVeterinarioId() == veterinarioId)
                              .filter(cg -> (cg.getData().isEqual(dataApartir) || cg.getData().isAfter(dataApartir)) &&
                                            (cg.getData().isEqual(dataAntes) || cg.getData().isBefore(dataAntes)))
                              .collect(Collectors.toList());
    }
    @Override
    public void update(Castracao castracao) {
        Optional<Castracao> existingCastracao = castracoes.stream().filter(c -> c.getId() == castracao.getId()).findFirst();
        if (existingCastracao.isPresent()) {
            castracoes.remove(existingCastracao.get());
            castracoes.add(castracao);
        }
    }

    @Override
    public void delete(Castracao castracao) {
        castracoes.removeIf(c -> c.getId() == castracao.getId());
    }
}
