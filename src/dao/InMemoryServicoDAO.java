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
import models.Servico;

/**
 *
 * @author felipe
 */
public class InMemoryServicoDAO extends DAO implements IServicoDAO {
    private List<Servico> servicos;
    private static InMemoryServicoDAO instance;
    private int currentId = 1;
    
    private InMemoryServicoDAO() {
        this.servicos = new ArrayList<>();
        
    }
    
    public static InMemoryServicoDAO getInstance() {
        if(instance == null) {
            instance = new InMemoryServicoDAO();
        }
        return instance;
    }
    
    @Override
    public Servico create(LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, int tipo) {
        Servico servico = new Servico(currentId++, data, hora, valor, gasto, animal_id, veterinario_id, tipo);
        servicos.add(servico);
        return servico;
    }

    @Override
    public Servico retrieveById(int id) {
        Optional<Servico> servico = servicos.stream().filter(s -> s.getId() == id).findFirst();
        return servico.orElse(null);
    }

    @Override
    public List<Servico> retrieveAll() {
        return new ArrayList<>(servicos); // Returning a copy to avoid external modifications
    }

    @Override
    public List<Servico> retrieveLast() {
        if (servicos.isEmpty()) {
            return new ArrayList<>();
        }
        return servicos.stream()
                       .filter(s -> s.getId() == (currentId - 1))
                       .collect(Collectors.toList());
    }

    @Override
    public void update(Servico servico) {
        Optional<Servico> existingServico = servicos.stream().filter(s -> s.getId() == servico.getId()).findFirst();
        if (existingServico.isPresent()) {
            servicos.remove(existingServico.get());
            servicos.add(servico);
        }
    }

    @Override
    public void delete(Servico servico) {
        servicos.removeIf(s -> s.getId() == servico.getId());
    }
}
