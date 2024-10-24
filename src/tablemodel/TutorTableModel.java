/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;
import models.Tutor;

import java.util.List;

/**
 *
 * @author Felipe
 */
public class TutorTableModel extends GenericTableModel<Tutor>{

    public TutorTableModel(List vDados) {
        super(vDados, new String[]{"Nome", "Endereco", "CPF"});
    }
    
    public void setData(List vDados){
        this.vDados = vDados;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tutor tutor = (Tutor)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return tutor.getNome();
            case 1:
                return tutor.getEndereco();
            case 2:
                return tutor.getCpf();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Tutor tutor = (Tutor)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                tutor.setNome((String)value);
            case 1:
                tutor.setEndereco((String)value);
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        
        // Controller.updateAnimal();
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int colunIndex) {
        return true;
    }
}
