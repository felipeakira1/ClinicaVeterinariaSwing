/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import models.Veterinario;

/**
 *
 * @author felipe
 */
public class InMemoryVeterinarioDAO extends DAO implements IVeterinarioDAO {
    private final List<Veterinario> veterinarios;
    private int currentId;
    private static InMemoryVeterinarioDAO instance;

    private InMemoryVeterinarioDAO() {
        this.veterinarios = new ArrayList<>();
        this.currentId = 1;
        veterinarios.add(new Veterinario(currentId++, "Gabriela", "Rua dos Veterinarios 123", "123.454.777-00", "12345/SP"));
    }
    
    public static InMemoryVeterinarioDAO getInstance() {
        if (instance == null) {
            instance = new InMemoryVeterinarioDAO();
        }
        return instance;
    }
    
    @Override
    public Veterinario create(String nome, String endereco, String cpf, String crmv) {
        Veterinario veterinario = new Veterinario(currentId++, nome, endereco, cpf, crmv);
        veterinarios.add(veterinario);
        return veterinario;
    }

    @Override
    public Veterinario retrieveById(int id) {
        Optional<Veterinario> veterinario = veterinarios.stream().filter(v -> v.getId() == id).findFirst();
        return veterinario.orElse(null);
    }

    @Override
    public List<Veterinario> retrieveAll() {
        return new ArrayList<>(veterinarios); // Retorna uma cópia da lista
    }

    @Override
    public List<Veterinario> retrieveLast() {
        if (veterinarios.isEmpty()) {
            return new ArrayList<>();
        }
        return veterinarios.stream()
                           .filter(v -> v.getId() == (currentId - 1))
                           .collect(Collectors.toList());
    }

    @Override
    public List<Veterinario> retrieveBySimilarName(String nome) {
        return veterinarios.stream()
                           .filter(v -> v.getNome().toLowerCase().contains(nome.toLowerCase()))
                           .collect(Collectors.toList());
    }

    @Override
    public void update(Veterinario veterinario) {
        Optional<Veterinario> existingVeterinario = veterinarios.stream().filter(v -> v.getId() == veterinario.getId()).findFirst();
        if (existingVeterinario.isPresent()) {
            veterinarios.remove(existingVeterinario.get());
            veterinarios.add(veterinario);
        }
    }

    @Override
    public void delete(Veterinario veterinario) {
        veterinarios.removeIf(v -> v.getId() == veterinario.getId());
    }
}
