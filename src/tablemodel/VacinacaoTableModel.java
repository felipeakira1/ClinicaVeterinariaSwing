/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import controller.AnimalController;
import controller.VacinaController;
import controller.VeterinarioController;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import models.Vacinacao;

/**
 *
 * @author felipe
 */
public class VacinacaoTableModel extends GenericTableModel<Vacinacao> {
    AnimalController animalController;
    VeterinarioController veterinarioController;
    VacinaController vacinaController;
    
    
    public VacinacaoTableModel(List vDados, AnimalController animalController, VeterinarioController veterinarioController, VacinaController vacinaController) {
        super(vDados, new String[]{"Data", "Hora", "Valor", "Gasto", "Animal", "Veterinario", "Vacina", "Proxima dose"});
        this.animalController = animalController;
        this.veterinarioController = veterinarioController;
        this.vacinaController = vacinaController;
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
        Vacinacao vacinacao = (Vacinacao)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return vacinacao.getData();
            case 1:
                return vacinacao.getHora();
            case 2:
                return vacinacao.getValor();
            case 3:
                return vacinacao.getGasto();
            case 4:
                return (animalController.getAnimalById(vacinacao.getAnimalId())).getNome();
            case 5:
                return (veterinarioController.getVeterinarioById(vacinacao.getVeterinarioId())).getNome();
            case 6:
                return (vacinaController.getVacinaById(vacinacao.getVacinaId())).getNome();
            case 7:
                return vacinacao.getDataProximaDose();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Vacinacao vacinacao = (Vacinacao)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                vacinacao.setData((LocalDate)aValue);
                break;
            case 1:
                vacinacao.setHora((LocalTime)aValue);
                break;
            case 2:
                vacinacao.setValor((Double)aValue);
                break;
            case 3:
                vacinacao.setGasto((Double)aValue);
                break;
            case 7:
                vacinacao.setDataProximaDose((LocalDate)aValue);
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
