/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import models.Animal;
import dao.IAnimalDAO;

/**
 *
 * @author Felipe
 */
public class AnimalController {
    private IAnimalDAO animalDAO;
    
    public AnimalController(IAnimalDAO animalDAO) {
        this.animalDAO = animalDAO;
    }
    
    public Animal createAnimal(String nome, String especie, String raca, int idade, String sexo, int tutorId) {
        return animalDAO.create(nome, especie, raca, idade, sexo, tutorId);
    }
    
    public List<Animal> getAllAnimais() {
        return animalDAO.retrieveAll();
    }
    
    public Animal getAnimalById(int id) {
        return animalDAO.retrieveById(id);
    }
    
    public List<Animal> searchAnimalByName(String name) {
        return animalDAO.retrieveBySimilarName(name);
    }
    
    public List<Animal> getAnimalByTutorId(int id) {
        return animalDAO.retrieveByTutorId(id);
    }
    
    public void updateAnimal(Animal animal) {
        animalDAO.update(animal);
    }
    
    public void deleteAnimal(Animal animal) {
        animalDAO.delete(animal);
    }
}
