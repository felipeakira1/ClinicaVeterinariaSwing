/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;
import controller.TutorController;
import models.Animal;

import java.util.List;

/**
 *
 * @author Felipe
 */
public class AnimalTableModel extends GenericTableModel<Animal> {
    private TutorController tutorController;
    
    public AnimalTableModel(List vDados, TutorController tutorController) {
        super(vDados, new String[]{"Nome", "Espécie", "Raça", "Idade", "Sexo", "Tutor"});
        this.tutorController = tutorController;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Animal animal = (Animal)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return animal.getNome();
            case 1:
                return animal.getEspecie();
            case 2:
                return animal.getRaca();
            case 3:
                return animal.getIdade();
            case 4:
                return animal.getSexo();
            case 5:
                return tutorController.getTutorById(animal.getTutorId()).getNome();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Animal animal = (Animal)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                animal.setNome((String)aValue);
            case 1:
                animal.setEspecie((String)aValue);
            case 2:
                animal.setRaca((String)aValue);
            case 3:
                animal.setIdade((int)aValue);
            case 4:
                animal.setSexo((String)aValue);
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        
        // Controller.updateAnimal();
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
}
