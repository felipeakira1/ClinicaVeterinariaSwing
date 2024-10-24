/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.List;
import models.Veterinario;

/**
 *
 * @author felipe
 */
public class VeterinarioTableModel extends GenericTableModel<Veterinario> {
    public VeterinarioTableModel(List vDados) {
        super(vDados, new String[]{"Nome", "Endereco", "CPF", "CRMV"});
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Veterinario veterinario = (Veterinario)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return veterinario.getNome();
            case 1:
                return veterinario.getEndereco();
            case 2:
                return veterinario.getCpf();
            case 3:
                return veterinario.getCrmv();
            default: 
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Veterinario veterinario = (Veterinario)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                veterinario.setNome((String)value);
            case 1:
                veterinario.setEndereco((String)value);
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
