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
import models.Castracao;

/**
 *
 * @author felipe
 */
public class CastracaoTableModel extends GenericTableModel<Castracao> {
    AnimalController animalController;
    VeterinarioController veterinarioController;

    public CastracaoTableModel(List vDados, AnimalController animalController, VeterinarioController veterinarioController) {
        super(vDados, new String[]{"Data", "Hora", "Valor", "Gasto", "Animal", "Veterinario", "Tipo", "Idade", "Peso"});
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
        Castracao castracao = (Castracao)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return castracao.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            case 1:
                return castracao.getHora();
            case 2:
                return castracao.getValor();
            case 3:
                return castracao.getGasto();
            case 4:
                return animalController.getAnimalById(castracao.getAnimalId()).getNome();
            case 5:
                return veterinarioController.getVeterinarioById(castracao.getVeterinarioId()).getNome();
            case 6:
                return castracao.getTipoCastracao();
            case 7:
                return castracao.getIdadeNaCastracao();
            case 8:
                return castracao.getPesoNaCastracao();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Castracao castracao = (Castracao)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                castracao.setData((LocalDate)aValue);
                break;
            case 1:
                castracao.setHora((LocalTime)aValue);
                break;
            case 2:
                castracao.setValor((Double)aValue);
                break;
            case 3:
                castracao.setGasto((Double)aValue);
                break;
            case 6:
                castracao.setTipoCastracao((String)aValue);
                break;
            case 7:
                castracao.setIdadeNaCastracao((Integer)aValue);
                break;
            case 8:
                castracao.setPesoNaCastracao((Double)aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
}
