/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.forms;

import controller.VeterinarioController;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import models.Veterinario;
import tablemodel.VeterinarioTableModel;
import utils.Utils;

/**
 *
 * @author Felipe
 */
public class VeterinarioForm extends javax.swing.JPanel {
    VeterinarioController veterinarioController;
    
    public VeterinarioForm(VeterinarioController veterinarioController) {
        initComponents();
        initPanel();
        this.veterinarioController = veterinarioController;
        updateTable(tableVeterinarios, veterinarioController.getAllVeterinarios());
    }
    
    private void updateTable(JTable table, List<Veterinario> tutores) {
        VeterinarioTableModel model = new VeterinarioTableModel(tutores);
        table.setModel(model);
    }
    
    private void initPanel() {
        txtVeterinarioCpf.setColumns(14);
        Utils.setComponentsEnabled(true, btnNovoVeterinario);
        Utils.setComponentsEnabled(true, btnNovoVeterinario);
        Utils.setComponentsEnabled(false, btnAlterarVeterinario, btnExcluirVeterinario, btnSalvarVeterinario, btnCancelarVeterinario);
        Utils.setComponentsEnabled(false, txtVeterinarioId, txtVeterinarioNome, txtVeterinarioEndereco, txtVeterinarioCpf, txtVeterinarioCrmv);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovoVeterinario = new view.components.NewButton();
        btnAlterarVeterinario = new view.components.UpdateButton();
        btnExcluirVeterinario = new view.components.DeleteButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVeterinarioId = new javax.swing.JTextField();
        txtVeterinarioNome = new javax.swing.JTextField();
        txtVeterinarioEndereco = new javax.swing.JTextField();
        txtVeterinarioCpf = new JFormattedTextField(Utils.getCpfFormatter());
        jLabel5 = new javax.swing.JLabel();
        txtVeterinarioCrmv = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnCancelarVeterinario = new view.components.CancelButton();
        btnSalvarVeterinario = new view.components.SaveButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVeterinarios = new javax.swing.JTable();
        txtPesquisarVeterinario = new javax.swing.JTextField();
        btnPesquisarVeterinario = new view.components.SearchButton();

        setPreferredSize(new java.awt.Dimension(800, 800));

        btnNovoVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoVeterinarioActionPerformed(evt);
            }
        });

        btnAlterarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVeterinarioActionPerformed(evt);
            }
        });

        btnExcluirVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVeterinarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Veterinarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do veterinario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("CPF");

        txtVeterinarioId.setEnabled(false);

        jLabel5.setText("CRMV");

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
                            .addComponent(txtVeterinarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVeterinarioId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVeterinarioCrmv)
                            .addComponent(txtVeterinarioEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(txtVeterinarioCpf))))
                .addContainerGap(442, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVeterinarioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVeterinarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVeterinarioEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVeterinarioCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtVeterinarioCrmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnCancelarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVeterinarioActionPerformed(evt);
            }
        });

        btnSalvarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarVeterinarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar veterinários por nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tableVeterinarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tableVeterinarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVeterinariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVeterinarios);

        btnPesquisarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarVeterinarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtPesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnPesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarVeterinarioActionPerformed
        String idTxt = txtVeterinarioId.getText();
        String nome = txtVeterinarioNome.getText();
        String endereco = txtVeterinarioEndereco.getText();
        String cpf = txtVeterinarioCpf.getText();
        String crmv = txtVeterinarioCrmv.getText();
        if (nome.isEmpty() || endereco.isEmpty() || cpf.isEmpty() || crmv.isEmpty()) {
            Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
            return;
        } 
        if(idTxt.isEmpty()) {
            veterinarioController.createVeterinario(nome, endereco, cpf, crmv);
        } else {
            int id = Integer.parseInt(idTxt);
            Veterinario veterinario = veterinarioController.getVeterinarioById(id);
            if(veterinario != null) {
                veterinario.setNome(nome);
                veterinario.setEndereco(endereco);
                veterinarioController.updateVeterinario(veterinario);
            }
        }
        Utils.showSuccessfulMessage();
        txtVeterinarioNome.setText("");
        txtVeterinarioEndereco.setText("");
        txtVeterinarioCpf.setText("");
        txtVeterinarioCrmv.setText("");
        Utils.setComponentsEnabled(false, txtVeterinarioNome, txtVeterinarioEndereco, txtVeterinarioCpf, txtVeterinarioCrmv);                             
        Utils.setComponentsEnabled(true, btnNovoVeterinario);
        Utils.setComponentsEnabled(false, btnSalvarVeterinario, btnCancelarVeterinario);
        updateTable(tableVeterinarios, veterinarioController.getAllVeterinarios());
    }//GEN-LAST:event_btnSalvarVeterinarioActionPerformed
    
    private void btnNovoVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoVeterinarioActionPerformed
        Utils.setComponentsEnabled(false, btnNovoVeterinario);
        Utils.setComponentsEnabled(true, btnSalvarVeterinario, btnCancelarVeterinario);
        Utils.setComponentsEnabled(true, txtVeterinarioNome, txtVeterinarioEndereco, txtVeterinarioCpf, txtVeterinarioCrmv);
        txtVeterinarioNome.requestFocus();
    }//GEN-LAST:event_btnNovoVeterinarioActionPerformed

    private void btnCancelarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVeterinarioActionPerformed
        Utils.setComponentsEnabled(true, btnNovoVeterinario);
        Utils.setComponentsEnabled(false, btnAlterarVeterinario, btnExcluirVeterinario, btnSalvarVeterinario, btnCancelarVeterinario);
        txtVeterinarioId.setText("");
        txtVeterinarioNome.setText("");
        txtVeterinarioEndereco.setText("");
        txtVeterinarioCpf.setText("");
        txtVeterinarioCrmv.setText("");
        Utils.setComponentsEnabled(false, txtVeterinarioNome, txtVeterinarioEndereco, txtVeterinarioCpf, txtVeterinarioCrmv);
    }//GEN-LAST:event_btnCancelarVeterinarioActionPerformed

    private void tableVeterinariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVeterinariosMouseClicked
        if(!txtVeterinarioNome.isEnabled()) {
            Utils.setComponentsEnabled(false, btnNovoVeterinario);
            Utils.setComponentsEnabled(true, btnAlterarVeterinario, btnExcluirVeterinario, btnCancelarVeterinario);
            int row = tableVeterinarios.getSelectedRow();
            if(row != -1) {
                Veterinario veterinario = ((VeterinarioTableModel)tableVeterinarios.getModel()).getItem(row);
                txtVeterinarioId.setText(String.valueOf(veterinario.getId()));
                txtVeterinarioNome.setText(veterinario.getNome());
                txtVeterinarioEndereco.setText(veterinario.getEndereco());
                txtVeterinarioCpf.setText(veterinario.getCpf());
                txtVeterinarioCrmv.setText(veterinario.getCrmv());
            }
        }
    }//GEN-LAST:event_tableVeterinariosMouseClicked

    private void btnAlterarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVeterinarioActionPerformed
        Utils.setComponentsEnabled(false, btnNovoVeterinario, btnAlterarVeterinario, btnExcluirVeterinario);                                             
        Utils.setComponentsEnabled(true, btnSalvarVeterinario);
        Utils.setComponentsEnabled(true, txtVeterinarioNome, txtVeterinarioEndereco);
    }//GEN-LAST:event_btnAlterarVeterinarioActionPerformed

    private void btnExcluirVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVeterinarioActionPerformed
        String idTxt = txtVeterinarioId.getText();
        int id = Integer.parseInt(idTxt);
        Veterinario veterinario = veterinarioController.getVeterinarioById(id);
        veterinarioController.deleteVeterinario(veterinario);
        Utils.showSuccessfulMessage();
        txtVeterinarioId.setText("");
        txtVeterinarioNome.setText("");
        txtVeterinarioEndereco.setText("");
        txtVeterinarioCpf.setText("");
        txtVeterinarioCrmv.setText("");
        Utils.setComponentsEnabled(false, txtVeterinarioNome, txtVeterinarioEndereco);
        Utils.setComponentsEnabled(true, btnNovoVeterinario);
        Utils.setComponentsEnabled(false, btnAlterarVeterinario, btnExcluirVeterinario, btnCancelarVeterinario, btnSalvarVeterinario);
        updateTable(tableVeterinarios, veterinarioController.getAllVeterinarios());
    }//GEN-LAST:event_btnExcluirVeterinarioActionPerformed

    private void btnPesquisarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarVeterinarioActionPerformed
        String nome = txtPesquisarVeterinario.getText();
        updateTable(tableVeterinarios, veterinarioController.searchVeterinarioByName(nome));
    }//GEN-LAST:event_btnPesquisarVeterinarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.components.UpdateButton btnAlterarVeterinario;
    private view.components.CancelButton btnCancelarVeterinario;
    private view.components.DeleteButton btnExcluirVeterinario;
    private view.components.NewButton btnNovoVeterinario;
    private view.components.SearchButton btnPesquisarVeterinario;
    private view.components.SaveButton btnSalvarVeterinario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVeterinarios;
    private javax.swing.JTextField txtPesquisarVeterinario;
    private javax.swing.JFormattedTextField txtVeterinarioCpf;
    private javax.swing.JTextField txtVeterinarioCrmv;
    private javax.swing.JTextField txtVeterinarioEndereco;
    private javax.swing.JTextField txtVeterinarioId;
    private javax.swing.JTextField txtVeterinarioNome;
    // End of variables declaration//GEN-END:variables
}
