/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Felipe
 */
public abstract class GenericTableModel<T> extends AbstractTableModel {
    protected List<T> vDados;
    protected String[] colunas;
    
    public GenericTableModel(List<T> vDados, String[] colunas) {
        this.vDados = (ArrayList)vDados;
        this.colunas = colunas;
    }
    
    public void setData(List dados) {
        vDados = dados;
    }
    
    public T getItem(int indiceLinha) {
        if(indiceLinha < 0) {
            return null;
        }
        return vDados.get(indiceLinha);
    }
    
    public void addItem(T obj) {
        vDados.add(obj);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public int getRowCount() {
        return vDados.size();
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    public void removeItem(int indiceLinha) {
        vDados.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
    
    public void addListOfItems(List<T> vItens) {
        this.clear();
        for(T obj : vItens) {
            this.addItem(obj);
        }
    }
    
    public void clear() {
        vDados.clear();
        fireTableDataChanged();
    }
    
    public boolean isEmpty() {
        return vDados.isEmpty();
    }
    
    public void setColumnWidth(JTable myTable, int[] vWidth) {
        myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for(int i = 0; i < vWidth.length; i++) {
            TableColumn col = myTable.getColumnModel().getColumn(i);
            col.setPreferredWidth(vWidth[i]);
        }
    }
    
    public void selectAndScroll(JTable table, int rowIndex) {
        table.getSelectionModel().setSelectionInterval(rowIndex, rowIndex);
        scrollToVisible(table, rowIndex);
    }
    
    public void scrollToVisible(JTable table, int rowIndex) {
        scrollToVisible(table, rowIndex, 0);
    }
    
    public void scrollToVisible(JTable table, int rowIndex, int vColIndex) {
        if(!(table.getParent() instanceof JViewport)) {
            return;
        }
        this.setViewPortPosition((JViewport) table.getParent(), table.getCellRect(rowIndex, vColIndex, true));
    }
    
    private void setViewPortPosition(JViewport viewport, Rectangle position) {
        Point pt = viewport.getViewPosition();
        position.setLocation(position.x - pt.x, position.y - pt.y);
        viewport.scrollRectToVisible(position);
    }
}