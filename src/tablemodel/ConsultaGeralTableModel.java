/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import controller.AnimalController;
import controller.TutorController;
import controller.VeterinarioController;
import java.time.format.DateTimeFormatter;
import java.util.List;
import models.ConsultaGeral;

/**
 *
 * @author felipe
 */
public class ConsultaGeralTableModel extends GenericTableModel<ConsultaGeral> {
    private AnimalController animalController;
    VeterinarioController veterinarioController;
    
    public ConsultaGeralTableModel(List<ConsultaGeral> vDados, AnimalController animalController, VeterinarioController veterinarioController) {
        super(vDados, new String[]{"Data", "Hora", "Valor", "Gasto", "Animal", "Veterinario", "Motivo", "Diagnostico", "Prescricoes"});
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
            case 8:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ConsultaGeral consulta = (ConsultaGeral)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return (consulta.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            case 1:
                return consulta.getHora();
            case 2:
                return consulta.getValor();
            case 3:
                return consulta.getGasto();
            case 4:
                return (animalController.getAnimalById(consulta.getAnimalId())).getNome();
            case 5:
                return (veterinarioController.getVeterinarioById(consulta.getVeterinarioId())).getNome();
            case 6:
                return consulta.getMotivo();
            case 7:
                return consulta.getDiagnostico();
            case 8:
                return consulta.getPrescricoes();
            
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
}
