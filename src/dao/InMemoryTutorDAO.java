/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Tutor;

/**
 *
 * @author Felipe
 */
public class InMemoryTutorDAO extends DAO implements ITutorDAO {
    private static InMemoryTutorDAO instance;
    private List<Tutor> tutores;
    private int currentId = 1;
    
    private InMemoryTutorDAO() {
        tutores = new ArrayList<>();
        tutores.add(new Tutor(currentId++, "Felipe", "Rua Estudante 578", "123.456.789-00"));
    }

    // Singleton
    public static InMemoryTutorDAO getInstance() {
        if (instance == null) {
            instance = new InMemoryTutorDAO();
        }
        return instance;
    }
    
    @Override
    public Tutor create(String nome, String endereco, String cpf) {
        Tutor tutor = new Tutor(currentId++, nome, endereco, cpf);
        tutores.add(tutor);
        return tutor;
    }

    @Override
    public List<Tutor> retrieveAll() {
        return new ArrayList<>(tutores);
    }

    @Override
    public Tutor retrieveById(int id) {
        for(Tutor tutor : tutores) {
            if(tutor.getId() == id) {
                return tutor;
            }
        }
        return null;
    }

    @Override
    public List<Tutor> retrieveBySimilarName(String nome) {
        List<Tutor> similarTutores = new ArrayList<>();
        for (Tutor tutor : tutores) {
            if (tutor.getNome().toLowerCase().contains(nome.toLowerCase())) {
                similarTutores.add(tutor);
            }
        }
        return similarTutores;
    }

    @Override
    public void update(Tutor tutor) {
        for (int i = 0; i < tutores.size(); i++) {
            if (tutores.get(i).getId() == tutor.getId()) {
                tutores.set(i, tutor);
                break;
            }
        }
    }

    @Override
    public void delete(Tutor tutor) {
        tutores.removeIf(t -> t.getId() == tutor.getId());
    }
}
