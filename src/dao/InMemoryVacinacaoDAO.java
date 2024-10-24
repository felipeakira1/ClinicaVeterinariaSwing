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
import models.Vacinacao;

/**
 *
 * @author Felipe
 */
public class InMemoryVacinacaoDAO extends DAO implements IVacinacaoDAO {
    private List<Vacinacao> vacinacoes;
    private int currentId;

    private static InMemoryVacinacaoDAO instance;

    private InMemoryVacinacaoDAO() {
        this.vacinacoes = new ArrayList<>();
        this.currentId = 1;
        this.vacinacoes.add(new Vacinacao(currentId++, LocalDate.now(), LocalTime.now(), 100, 50, 1, 1, 0, 1, LocalDate.now().plusMonths(1)));
    }

    // Singleton
    public static InMemoryVacinacaoDAO getInstance() {
        if (instance == null) {
            instance = new InMemoryVacinacaoDAO();
        }
        return instance;
    }

    @Override
    public Vacinacao create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, int vacina_id, LocalDate data_proxima_dose) {
        Vacinacao vacinacao = new Vacinacao(currentId++, data, hora, valor, gasto, animal_id, veterinario_id, 0, vacina_id, data_proxima_dose);
        vacinacoes.add(vacinacao);
        return vacinacao;
    }

    @Override
    public Vacinacao retrieveById(int id) {
        Optional<Vacinacao> vacinacao = vacinacoes.stream().filter(v -> v.getId() == id).findFirst();
        return vacinacao.orElse(null);
    }

    @Override
    public List<Vacinacao> retrieveAll() {
        return new ArrayList<>(vacinacoes); // Retorna uma cópia da lista para evitar modificações externas
    }

    @Override
    public List<Vacinacao> retrieveByAnimalId(int animalId) {
        return vacinacoes.stream()
                .filter(v -> v.getAnimalId() == animalId)
                .collect(Collectors.toList());
    }

    @Override
    public List<Vacinacao> retrieveByVeterinarioId(int veterinarioId) {
        return vacinacoes.stream()
                .filter(v -> v.getVeterinarioId() == veterinarioId)
                .collect(Collectors.toList());
    }

    @Override
    public void update(Vacinacao vacinacao) {
        Optional<Vacinacao> existingVacinacao = vacinacoes.stream().filter(v -> v.getId() == vacinacao.getId()).findFirst();
        if (existingVacinacao.isPresent()) {
            vacinacoes.remove(existingVacinacao.get());
            vacinacoes.add(vacinacao);
        }
    }

    @Override
    public void delete(Vacinacao vacinacao) {
        vacinacoes.removeIf(v -> v.getId() == vacinacao.getId());
    }
}
