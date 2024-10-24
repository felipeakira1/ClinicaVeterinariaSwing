/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.List;
import models.Vacina;

/**
 *
 * @author felipe
 */
public class VacinaTableModel extends GenericTableModel<Vacina>{
    public VacinaTableModel(List vDados) {
        super(vDados, new String[]{"Nome", "Descricao", "Marca", "Quantidade"});
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
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vacina vacina = (Vacina)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return vacina.getNome();
            case 1:
                return vacina.getDescricao();
            case 2:
                return vacina.getMarca();
            case 3:
                return vacina.getQuantidadeEstoque();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Vacina vacina = (Vacina)vDados.get(rowIndex);
        switch(columnIndex) {
            case 0:
                vacina.setNome((String)aValue);
            case 1:
                vacina.setDescricao((String)aValue);
            case 2:
                vacina.setMarca((String)aValue);
            case 3:
                vacina.setQuantidadeEstoque((int)aValue);
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
