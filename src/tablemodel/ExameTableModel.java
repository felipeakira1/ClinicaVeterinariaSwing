/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import controller.AnimalController;
import controller.VeterinarioController;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import models.Exame;

/**
 *
 * @author felipe
 */
public class ExameTableModel extends GenericTableModel<Exame> {
    AnimalController animalController;
    VeterinarioController veterinarioController;
    
    
    public ExameTableModel(List vDados, AnimalController animalController, VeterinarioController veterinarioController) {
        super(vDados, new String[]{"Data", "Hora", "Valor", "Gasto", "Animal", "Veterinario", "Tipo", "Resultados"});
        this.animalController = animalController;
        this.veterinarioController = veterinarioController;
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
            case 6:
                return String.class;
            case 7:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Exame exame = (Exame)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return exame.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            case 1:
                return exame.getHora();
            case 2:
                return exame.getValor();
            case 3:
                return exame.getGasto();
            case 4:
                return (animalController.getAnimalById(exame.getAnimalId())).getNome();
            case 5:
                return (veterinarioController.getVeterinarioById(exame.getVeterinarioId())).getNome();
            case 6:
                return exame.getTipoExame();
            case 7:
                return exame.getResultados();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Exame exame = (Exame)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                exame.setData((LocalDate)aValue);
                break;
            case 1:
                exame.setHora((LocalTime)aValue);
                break;
            case 2:
                exame.setValor((Double)aValue);
                break;
            case 3:
                exame.setGasto((Double)aValue);
                break;
            case 6:
                exame.setTipoExame((String)aValue);
                break;
            case 7:
                exame.setResultados((String)aValue);
                break;
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
