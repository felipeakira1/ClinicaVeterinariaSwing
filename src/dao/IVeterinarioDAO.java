/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.Veterinario;

/**
 *
 * @author felipe
 */
public interface IVeterinarioDAO {
    Veterinario create(String nome, String endereco, String cpf, String crmv);
    Veterinario retrieveById(int id);
    List<Veterinario> retrieveAll();
    List<Veterinario> retrieveLast();
    List<Veterinario> retrieveBySimilarName(String nome);
    void update(Veterinario veterinario);
    void delete(Veterinario veterinario);
}
