/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.forms;

import controller.*;

/**
 *
 * @author Felipe
 */
public class ServicoForm extends javax.swing.JPanel {
    ConsultaGeralController consultaController;
    ExameController exameController;
    VacinacaoController vacinacaoController;
    CastracaoController castracaoController;
    AnimalController animalController;
    TutorController tutorController;
    VeterinarioController veterinarioController;
    VacinaController vacinaController;
    
    public ServicoForm(ConsultaGeralController consultaController, ExameController exameController, VacinacaoController vacinacaoController, CastracaoController castracaoController, AnimalController animalController, TutorController tutorController, VeterinarioController veterinarioController, VacinaController vacinaController) {
        initComponents();
        ConsultaForm consultaForm = new ConsultaForm(consultaController, animalController, tutorController, veterinarioController);
        ExameForm exameForm = new ExameForm(exameController, animalController, tutorController, veterinarioController);
        VacinacaoForm vacinacaoForm = new VacinacaoForm(vacinacaoController, animalController, tutorController, veterinarioController, vacinaController);
        CastracaoForm castracaoForm = new CastracaoForm(castracaoController, animalController, tutorController, veterinarioController);
        jTabbedPane1.addTab("Consultas", consultaForm);
        jTabbedPane1.addTab("Exames", exameForm);
        jTabbedPane1.addTab("Vacinacoes", vacinacaoForm);
        jTabbedPane1.addTab("Castracao", castracaoForm);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
