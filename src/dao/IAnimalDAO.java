/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.Animal;

/**
 *
 * @author Felipe
 */
public interface IAnimalDAO {
    Animal create(String nome, String especie, String raca, int idade, String sexo, int tutorId);
    Animal retrieveById(int id);
    List<Animal> retrieveAll();
    List<Animal> retrieveBySimilarName(String nome);
    List<Animal> retrieveByTutorIdBySimilarName(int tutorId, String nome);
    List<Animal> retrieveByTutorId(int id);
    void update(Animal animal);
    void delete(Animal animal);
}
