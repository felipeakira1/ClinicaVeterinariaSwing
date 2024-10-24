/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import models.Vacina;

/**
 *
 * @author Felipe
 */
public class InMemoryVacinaDAO extends DAO implements IVacinaDAO {
    private List<Vacina> vacinas;
    private int currentId;

    private static InMemoryVacinaDAO instance;

    private InMemoryVacinaDAO() {
        this.vacinas = new ArrayList<>();
        this.currentId = 1;
        this.vacinas.add(new Vacina(currentId++, "V10 Canina", "Protege cães contra 10 doenças", "Zoetis", 10));
    }

    // Singleton
    public static InMemoryVacinaDAO getInstance() {
        if (instance == null) {
            instance = new InMemoryVacinaDAO();
        }
        return instance;
    }

    @Override
    public Vacina create(String nome, String descricao, String marca, int quantidade_estoque) {
        Vacina vacina = new Vacina(currentId++, nome, descricao, marca, quantidade_estoque);
        vacinas.add(vacina);
        return vacina;
    }

    @Override
    public Vacina retrieveById(int id) {
        Optional<Vacina> vacina = vacinas.stream().filter(v -> v.getId() == id).findFirst();
        return vacina.orElse(null);
    }

    @Override
    public List<Vacina> retrieveAll() {
        return new ArrayList<>(vacinas); // Retorna uma cópia da lista para evitar modificações externas
    }

    @Override
    public List<Vacina> retrieveBySimilarName(String nome) {
        return vacinas.stream()
                      .filter(v -> v.getNome().toLowerCase().contains(nome.toLowerCase()))
                      .collect(Collectors.toList());
    }

    @Override
    public void update(Vacina vacina) {
        Optional<Vacina> existingVacina = vacinas.stream().filter(v -> v.getId() == vacina.getId()).findFirst();
        if (existingVacina.isPresent()) {
            vacinas.remove(existingVacina.get());
            vacinas.add(vacina);
        }
    }

    @Override
    public void delete(Vacina vacina) {
        vacinas.removeIf(v -> v.getId() == vacina.getId());
    }
}
