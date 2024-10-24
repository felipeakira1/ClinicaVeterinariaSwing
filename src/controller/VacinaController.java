/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.IVacinaDAO;
import java.util.List;
import models.Vacina;

/**
 *
 * @author felipe
 */
public class VacinaController {
    private IVacinaDAO vacinaDAO;
    
    public VacinaController(IVacinaDAO vacinaDAO) {
        this.vacinaDAO = vacinaDAO;
    }
    
    public Vacina createVacina(String nome, String descricao, String marca, int quantidade) {
        return vacinaDAO.create(nome, descricao, marca, quantidade);
    }

    public List<Vacina> getAllVacinas() {
        return vacinaDAO.retrieveAll();
    }

    public Vacina getVacinaById(int id) {
        return vacinaDAO.retrieveById(id);
    }

    public List<Vacina> searchVacinaByName(String name) {
        return vacinaDAO.retrieveBySimilarName(name);
    }

    public void updateVacina(Vacina vacina) {
        vacinaDAO.update(vacina);
    }

    public void deleteVacina(Vacina vacina) {
        vacinaDAO.delete(vacina);
    }
}
