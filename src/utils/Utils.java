/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.text.MaskFormatter;
import tablemodel.GenericTableModel;

/**
 *
 * @author Felipe
 */
public final class Utils {
    private static MaskFormatter cpfFormatter = criarCpfFormatter();
    private static MaskFormatter dateFormatter = criarDateFormatter();
    private static MaskFormatter hourFormatter = criarHourFormatter();
    
    private Utils() {
        
    }
    
    /**
     * Cria e retorna uma máscara de CPF no formato ###.###.###-##.
     *
     * @return MaskFormatter configurado para CPF.
     */
    private static MaskFormatter criarCpfFormatter() {
        try {
            MaskFormatter formatter = new MaskFormatter("###.###.###-##");
            formatter.setPlaceholderCharacter('_');
            return formatter;
        } catch (ParseException e) {
            throw new RuntimeException("Erro ao criar a máscara de CPF.", e);
        }
    }
    
    private static MaskFormatter criarDateFormatter() {
        try {
            MaskFormatter formatter = new MaskFormatter("##/##/####");
            formatter.setPlaceholderCharacter('_');
            return formatter;
        } catch (ParseException e) {
            throw new RuntimeException("Erro ao criar a máscara de data.", e);
        }
    }
    
    private static MaskFormatter criarHourFormatter() {
        try {
            MaskFormatter formatter = new MaskFormatter("##:##");
            formatter.setPlaceholderCharacter('_');
            return formatter;
        } catch (ParseException e) {
            throw new RuntimeException("Erro ao criar a máscara de hora.", e);
        }
    }
    
    /**
     * Retorna o MaskFormatter para CPF.
     *
     * @return MaskFormatter configurado para CPF.
     */
    public static MaskFormatter getCpfFormatter() {
        return cpfFormatter;
    }
    public static MaskFormatter getDateFormatter() {
        return dateFormatter;
    }
    public static MaskFormatter getHourFormatter() {
        return hourFormatter;
    }
    
    public static void setComponentsEnabled(boolean enabled, javax.swing.JComponent... components) {
        for (javax.swing.JComponent component : components) {
            component.setEnabled(enabled);
        }
    }
    
    public static <T> void updateTableModel(JTable table, List<T> dados, GenericTableModel model) {
        model.setData(dados);
        table.setModel(model);
    }
    
    public static void showWarningMessage(String title, String message) {
        JOptionPane.showMessageDialog(null,
                    message,
                    title,
                    JOptionPane.WARNING_MESSAGE);
    }
    
    public static void showSuccessfulMessage() {
        JOptionPane.showMessageDialog(null,
                    "Dados salvos com sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}
