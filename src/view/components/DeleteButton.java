/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.components;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Felipe
 */
public class DeleteButton extends javax.swing.JButton {
    public DeleteButton() {
        super("Excluir");
        this.setFont(new java.awt.Font("SansSerif", 0, 12));
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png")));
        this.setOpaque(false);
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(110, 40));
    }
}
