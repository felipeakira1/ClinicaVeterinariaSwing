/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;

/**
 *
 * @author Felipe
 */
public class SideMenu extends javax.swing.JPanel {
    public SideMenu() {
        initComponents();
        jButton1.setOpaque(true);
        jButton2.setOpaque(true);
        jButton3.setOpaque(true);
        jButton4.setOpaque(true);
        jButton5.setOpaque(true);
        jButton1.setBackground(Color.WHITE);
        jButton2.setBackground(Color.WHITE);
        jButton3.setBackground(Color.WHITE);
        jButton4.setBackground(Color.WHITE);
        jButton5.setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Serviços");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(144, 40));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        add(jButton1);

        jButton2.setText("Tutores");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton2.setContentAreaFilled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(144, 40));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        add(jButton2);

        jButton3.setText("Animais");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton3.setContentAreaFilled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(144, 40));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        add(jButton3);

        jButton4.setText("Veterinarios");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton4.setContentAreaFilled(false);
        jButton4.setPreferredSize(new java.awt.Dimension(144, 40));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        add(jButton4);

        jButton5.setText("Vacinas");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setPreferredSize(new java.awt.Dimension(144, 40));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        add(jButton5);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       jButton1.setBackground(Color.LIGHT_GRAY);
       jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(Color.WHITE);
       jButton1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(Color.LIGHT_GRAY);
       jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(Color.WHITE);
       jButton2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(Color.LIGHT_GRAY);
       jButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(Color.WHITE);
       jButton3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
       jButton4.setBackground(Color.LIGHT_GRAY);
       jButton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(Color.WHITE);
       jButton4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setBackground(Color.LIGHT_GRAY);
       jButton5.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setBackground(Color.WHITE);
       jButton5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton5MouseExited
    
    public void addBotao1ActionListener(ActionListener listener) {
        jButton1.addActionListener(listener);
    }

    public void addBotao2ActionListener(ActionListener listener) {
        jButton2.addActionListener(listener);
    }

    public void addBotao3ActionListener(ActionListener listener) {
        jButton3.addActionListener(listener);
    }

    public void addBotao4ActionListener(ActionListener listener) {
        jButton4.addActionListener(listener);
    }

    public void addBotao5ActionListener(ActionListener listener) {
        jButton5.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
