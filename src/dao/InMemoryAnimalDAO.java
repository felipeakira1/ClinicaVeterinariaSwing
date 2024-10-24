/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import models.Animal;

/**
 *
 * @author Felipe
 */
public class InMemoryAnimalDAO extends DAO implements IAnimalDAO {
    private List<Animal> animais;
    private static InMemoryAnimalDAO instance;
    private int currentId = 1;

    private InMemoryAnimalDAO() {
        this.animais = new ArrayList<>();
        this.animais.add(new Animal(currentId++, "Ares", "Gato", "Normal", 4, "Masculino", 1));
    }

    // Singleton
    public static InMemoryAnimalDAO getInstance() {
        if (instance == null) {
            instance = new InMemoryAnimalDAO();
        }
        return instance;
    }

    @Override
    public Animal create(String nome, String especie, String raca, int idade, String sexo, int tutorId) {
        Animal animal = new Animal(currentId++, nome, especie, raca, idade, sexo, tutorId);
        animais.add(animal);
        return animal;
    }

    @Override
    public Animal retrieveById(int id) {
        return animais.stream()
                      .filter(animal -> animal.getId() == id)
                      .findFirst()
                      .orElse(null);
    }

    @Override
    public List<Animal> retrieveBySimilarName(String nome) {
        List<Animal> animaisComNomeSimilar = new ArrayList<>();
        for (Animal animal : animais) {
            if (animal.getNome().toLowerCase().contains(nome.toLowerCase())) {
                animaisComNomeSimilar.add(animal);
            }
        }
        return animaisComNomeSimilar;
    }

    @Override
    public List<Animal> retrieveByTutorId(int tutorId) {
        List<Animal> animaisDoTutor = new ArrayList<>();
        for (Animal animal : animais) {
            if (animal.getTutorId() == tutorId) {
                animaisDoTutor.add(animal);
            }
        }
        return animaisDoTutor;
    }

    @Override
    public List<Animal> retrieveAll() {
        return new ArrayList<>(animais); // Retorna uma nova lista para evitar modificações diretas
    }

    @Override
    public void update(Animal animal) {
        Optional<Animal> existingAnimal = animais.stream()
                                                 .filter(a -> a.getId() == animal.getId())
                                                 .findFirst();
        if (existingAnimal.isPresent()) {
            Animal updatedAnimal = existingAnimal.get();
            updatedAnimal.setNome(animal.getNome());
            updatedAnimal.setEspecie(animal.getEspecie());
            updatedAnimal.setRaca(animal.getRaca());
            updatedAnimal.setIdade(animal.getIdade());
            updatedAnimal.setSexo(animal.getSexo());
            updatedAnimal.setTutorId(animal.getTutorId());
        }
    }

    @Override
    public void delete(Animal animal) {
        animais.removeIf(a -> a.getId() == animal.getId());
    }
}
