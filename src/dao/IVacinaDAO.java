/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.Vacina;

/**
 *
 * @author Felipe
 */
public interface IVacinaDAO {
    Vacina create(String nome, String descricao, String marca, int quantidade_estoque);
    Vacina retrieveById(int id);
    List<Vacina> retrieveAll();
    List<Vacina> retrieveBySimilarName(String nome);
    void update(Vacina vacina);
    void delete(Vacina vacina);
}
