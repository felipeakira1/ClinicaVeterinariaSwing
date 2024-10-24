/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import models.Tutor;

/**
 *
 * @author Felipe
 */
public interface ITutorDAO {
    Tutor create(String nome, String endereco, String cpf);
    Tutor retrieveById(int id);
    List<Tutor> retrieveAll();
    List<Tutor> retrieveBySimilarName(String nome);
    void update(Tutor tutor);
    void delete(Tutor tutor);
}
