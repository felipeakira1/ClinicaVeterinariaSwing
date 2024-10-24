/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe
 */
public class Tutor extends Pessoa {
    private List<Animal> animais;

    public Tutor(int id, String nome, String endereco, String cpf) {
        super(id, nome, endereco, cpf);
        animais = new ArrayList<>();
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }
    
    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }
}
