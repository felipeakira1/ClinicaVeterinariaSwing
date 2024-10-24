/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.forms;

import controller.TutorController;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import models.Tutor;
import tablemodel.TutorTableModel;
import utils.Utils;

/**
 *
 * @author Felipe
 */
public class TutorForm extends javax.swing.JPanel {
    TutorController tutorController;
    TutorTableModel tutorTableModel;
    
    public TutorForm(TutorController tutorController) {
        initComponents();
        initPanel();
        this.tutorController = tutorController;
        this.tutorTableModel = new TutorTableModel(tutorController.getAllTutores());
        Utils.updateTableModel(tableTutores, tutorController.getAllTutores(), tutorTableModel);
    }
    
    private void initPanel() {
        txtTutorCpf.setColumns(14);
        Utils.setComponentsEnabled(true, btnNovoTutor);
        Utils.setComponentsEnabled(true, btnNovoTutor);
        Utils.setComponentsEnabled(false, btnAlterarTutor, btnExcluirTutor, btnSalvarTutor, btnCancelarTutor);
        Utils.setComponentsEnabled(false, txtTutorId, txtTutorNome, txtTutorEndereco, txtTutorCpf);
    }
    
    private void updateTable(JTable table, List<Tutor> tutores) {
        TutorTableModel model = new TutorTableModel(tutores);
        table.setModel(model);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovoTutor = new view.components.NewButton();
        btnAlterarTutor = new view.components.UpdateButton();
        btnExcluirTutor = new view.components.DeleteButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTutorId = new javax.swing.JTextField();
        txtTutorNome = new javax.swing.JTextField();
        txtTutorEndereco = new javax.swing.JTextField();
        txtTutorCpf = new JFormattedTextField(Utils.getCpfFormatter());
        jPanel3 = new javax.swing.JPanel();
        btnCancelarTutor = new view.components.CancelButton();
        btnSalvarTutor = new view.components.SaveButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTutores = new javax.swing.JTable();
        txtPesquisarTutor = new javax.swing.JTextField();
        btnPesquisarTutor = new view.components.SearchButton();

        setPreferredSize(new java.awt.Dimension(800, 800));

        btnNovoTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoTutorActionPerformed(evt);
            }
        });

        btnAlterarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarTutorActionPerformed(evt);
            }
        });

        btnExcluirTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTutorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Tutores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do tutor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("CPF");

        txtTutorId.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTutorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTutorId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTutorEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(txtTutorCpf))))
                .addContainerGap(442, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTutorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTutorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTutorEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTutorCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnCancelarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarTutorActionPerformed(evt);
            }
        });

        btnSalvarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar tutores por nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tableTutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableTutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTutoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTutores);

        btnPesquisarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarTutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtPesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnPesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTutorActionPerformed
        String idTxt = txtTutorId.getText();
        String nome = txtTutorNome.getText();
        String endereco = txtTutorEndereco.getText();
        String cpf = txtTutorCpf.getText();
        if (nome.isEmpty() || endereco.isEmpty() || cpf.isEmpty()) {
            Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
            return;
        }
        if(idTxt.isEmpty()){
            tutorController.createTutor(nome, endereco, cpf);
        } else {
            int id = Integer.parseInt(idTxt);
            Tutor tutor = tutorController.getTutorById(id);
            if(tutor != null) {
                tutor.setNome(nome);
                tutor.setEndereco(endereco);
                tutorController.updateTutor(tutor);
            }
        }
        Utils.showSuccessfulMessage();
        txtTutorId.setText("");
        txtTutorNome.setText("");
        txtTutorEndereco.setText("");
        txtTutorCpf.setText("");
        Utils.setComponentsEnabled(false, txtTutorNome, txtTutorEndereco, txtTutorCpf);                             
        Utils.setComponentsEnabled(true, btnNovoTutor);
        Utils.setComponentsEnabled(false, btnSalvarTutor, btnCancelarTutor);
        updateTable(tableTutores, tutorController.getAllTutores());
    }//GEN-LAST:event_btnSalvarTutorActionPerformed
    
    private void btnNovoTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoTutorActionPerformed
        Utils.setComponentsEnabled(false, btnNovoTutor);
        Utils.setComponentsEnabled(true, btnSalvarTutor, btnCancelarTutor);
        Utils.setComponentsEnabled(true, txtTutorNome, txtTutorEndereco, txtTutorCpf);
        txtTutorNome.requestFocus();
    }//GEN-LAST:event_btnNovoTutorActionPerformed

    private void btnCancelarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarTutorActionPerformed
        Utils.setComponentsEnabled(true, btnNovoTutor);
        Utils.setComponentsEnabled(false, btnAlterarTutor, btnExcluirTutor, btnSalvarTutor, btnCancelarTutor);
        txtTutorId.setText("");
        txtTutorNome.setText("");
        txtTutorEndereco.setText("");
        txtTutorCpf.setText("");
        Utils.setComponentsEnabled(false, txtTutorNome, txtTutorEndereco, txtTutorCpf);
    }//GEN-LAST:event_btnCancelarTutorActionPerformed

    private void tableTutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTutoresMouseClicked
        if(!txtTutorNome.isEnabled()) { // Verify if there is any data in the form
            Utils.setComponentsEnabled(false, btnNovoTutor);
            Utils.setComponentsEnabled(true, btnAlterarTutor, btnExcluirTutor, btnCancelarTutor);
            int row = tableTutores.getSelectedRow();
            if(row != -1) {
                Tutor tutor = ((TutorTableModel)tableTutores.getModel()).getItem(row);
                txtTutorId.setText(String.valueOf(tutor.getId()));
                txtTutorNome.setText(tutor.getNome());
                txtTutorEndereco.setText(tutor.getEndereco());
                txtTutorCpf.setText(tutor.getCpf());
            }
        }
    }//GEN-LAST:event_tableTutoresMouseClicked

    private void btnAlterarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarTutorActionPerformed
        Utils.setComponentsEnabled(false, btnNovoTutor, btnAlterarTutor, btnExcluirTutor);                                             
        Utils.setComponentsEnabled(true, btnSalvarTutor);
        Utils.setComponentsEnabled(true, txtTutorNome, txtTutorEndereco, txtTutorCpf);
    }//GEN-LAST:event_btnAlterarTutorActionPerformed

    private void btnExcluirTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTutorActionPerformed
        String idTxt = txtTutorId.getText();
        int id = Integer.parseInt(idTxt);
        Tutor tutor = tutorController.getTutorById(id);
        tutorController.deleteTutor(tutor);
        Utils.showSuccessfulMessage();
        txtTutorId.setText("");
        txtTutorNome.setText("");
        txtTutorEndereco.setText("");
        txtTutorCpf.setText("");
        Utils.setComponentsEnabled(true, btnNovoTutor);
        Utils.setComponentsEnabled(false, btnAlterarTutor, btnExcluirTutor, btnSalvarTutor, btnCancelarTutor);
        updateTable(tableTutores, tutorController.getAllTutores());
    }//GEN-LAST:event_btnExcluirTutorActionPerformed

    private void btnPesquisarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarTutorActionPerformed
        String nome = txtPesquisarTutor.getText();
        updateTable(tableTutores, tutorController.searchTutorByName(nome));
    }//GEN-LAST:event_btnPesquisarTutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.components.UpdateButton btnAlterarTutor;
    private view.components.CancelButton btnCancelarTutor;
    private view.components.DeleteButton btnExcluirTutor;
    private view.components.NewButton btnNovoTutor;
    private view.components.SearchButton btnPesquisarTutor;
    private view.components.SaveButton btnSalvarTutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTutores;
    private javax.swing.JTextField txtPesquisarTutor;
    private javax.swing.JFormattedTextField txtTutorCpf;
    private javax.swing.JTextField txtTutorEndereco;
    private javax.swing.JTextField txtTutorId;
    private javax.swing.JTextField txtTutorNome;
    // End of variables declaration//GEN-END:variables
}
