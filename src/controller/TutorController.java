/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import models.Tutor;
import dao.ITutorDAO;

/**
 *
 * @author Felipe
 */
public class TutorController {
    private ITutorDAO tutorDAO;
    
    public TutorController(ITutorDAO tutorDAO) {
        this.tutorDAO = tutorDAO;
    }
    
    public Tutor createTutor(String nome, String endereco, String cpf) {
        return tutorDAO.create(nome, endereco, cpf);
    }

    public List<Tutor> getAllTutores() {
        return tutorDAO.retrieveAll();
    }

    public Tutor getTutorById(int id) {
        return tutorDAO.retrieveById(id);
    }

    public List<Tutor> searchTutorByName(String name) {
        return tutorDAO.retrieveBySimilarName(name);
    }

    public void updateTutor(Tutor tutor) {
        tutorDAO.update(tutor);
    }

    public void deleteTutor(Tutor tutor) {
        tutorDAO.delete(tutor);
    }
}
