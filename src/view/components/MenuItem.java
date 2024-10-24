/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author Felipe
 */
public class MenuItem extends JButton {
    private Color hoverBackgroundColor;
    private Color normalBackgroundColor;
    
    public MenuItem(String text) {
        super(text);
        super.setContentAreaFilled(false);
        this.normalBackgroundColor = Color.WHITE;
        this.hoverBackgroundColor = Color.GRAY;
        this.setBackground(normalBackgroundColor);
        this.initHoverListener();
    }
    
    private void initHoverListener() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverBackgroundColor);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(normalBackgroundColor);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
    }
}
