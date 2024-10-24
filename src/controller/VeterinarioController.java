/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.IVeterinarioDAO;
import java.util.List;
import models.Veterinario;

/**
 *
 * @author felipe
 */
public class VeterinarioController {
    private final IVeterinarioDAO veterinarioDAO;
    
    public VeterinarioController(IVeterinarioDAO veterinarioDAO) {
        this.veterinarioDAO = veterinarioDAO;
    }
    
    public Veterinario createVeterinario(String nome, String endereco, String cpf, String crmv) {
        return veterinarioDAO.create(nome, endereco, cpf, crmv);
    }

    public List<Veterinario> getAllVeterinarios() {
        return veterinarioDAO.retrieveAll();
    }

    public Veterinario getVeterinarioById(int id) {
        return veterinarioDAO.retrieveById(id);
    }

    public List<Veterinario> searchVeterinarioByName(String name) {
        return veterinarioDAO.retrieveBySimilarName(name);
    }

    public void updateVeterinario(Veterinario veterinario) {
        veterinarioDAO.update(veterinario);
    }

    public void deleteVeterinario(Veterinario veterinario) {
        veterinarioDAO.delete(veterinario);
    }
}
