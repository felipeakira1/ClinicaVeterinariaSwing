/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.forms;

import controller.TutorController;
import controller.VacinaController;
import controller.VeterinarioController;
import dao.ITutorDAO;
import dao.InMemoryTutorDAO;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.text.MaskFormatter;
import models.Tutor;
import models.Vacina;
import models.Veterinario;
import tablemodel.TutorTableModel;
import tablemodel.VacinaTableModel;
import tablemodel.VeterinarioTableModel;
import utils.Utils;

/**
 *
 * @author Felipe
 */
public class VacinaForm extends javax.swing.JPanel {
    VacinaController vacinaController;
    
    public VacinaForm(VacinaController vacinaController) {
        initComponents();
        initPanel();
        this.vacinaController = vacinaController;
        updateTable(tableVacinas, vacinaController.getAllVacinas());
    }
    
    private void updateTable(JTable table, List<Vacina> vacinas) {
        VacinaTableModel model = new VacinaTableModel(vacinas);
        table.setModel(model);
    }
    
    private void initPanel() {
        txtVacinaMarca.setColumns(14);
        Utils.setComponentsEnabled(true, btnNovoVacina);
        Utils.setComponentsEnabled(true, btnNovoVacina);
        Utils.setComponentsEnabled(false, btnAlterarVacina, btnExcluirVacina, btnSalvarVacina, btnCancelarVacina);
        Utils.setComponentsEnabled(false, txtVacinaId, txtVacinaNome, txtVacinaDescricao, txtVacinaMarca, txtVacinaQuantidade);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovoVacina = new view.components.NewButton();
        btnAlterarVacina = new view.components.UpdateButton();
        btnExcluirVacina = new view.components.DeleteButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVacinaId = new javax.swing.JTextField();
        txtVacinaNome = new javax.swing.JTextField();
        txtVacinaDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVacinaQuantidade = new javax.swing.JTextField();
        txtVacinaMarca = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnCancelarVacina = new view.components.CancelButton();
        btnSalvarVacina = new view.components.SaveButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVacinas = new javax.swing.JTable();
        txtPesquisarVeterinario = new javax.swing.JTextField();
        btnPesquisarVeterinario = new view.components.SearchButton();

        setPreferredSize(new java.awt.Dimension(800, 800));

        btnNovoVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoVacinaActionPerformed(evt);
            }
        });

        btnAlterarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVacinaActionPerformed(evt);
            }
        });

        btnExcluirVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVacinaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Vacinas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovoVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da vacina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jLabel3.setText("Descrição");

        jLabel4.setText("Marca");

        txtVacinaId.setEnabled(false);

        jLabel5.setText("Quantidade");

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
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVacinaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVacinaId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVacinaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVacinaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVacinaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(440, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVacinaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVacinaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVacinaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVacinaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtVacinaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnCancelarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVacinaActionPerformed(evt);
            }
        });

        btnSalvarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarVacinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar vacinas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tableVacinas.setModel(new javax.swing.table.DefaultTableModel(
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
        tableVacinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVacinasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVacinas);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarVacinaActionPerformed
        try {
            String id = txtVacinaId.getText();
            String nome = txtVacinaNome.getText();
            String descricao = txtVacinaDescricao.getText();
            String marca = txtVacinaMarca.getText();
            String quantidadeTxt = txtVacinaQuantidade.getText();
            int quantidade = Integer.parseInt(quantidadeTxt);
            
            if(nome.isEmpty() || descricao.isEmpty() || marca.isEmpty()) {
                Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
                return;
            }
            
            if(id.isEmpty()) {
                vacinaController.createVacina(nome, descricao, marca, quantidade);
                Utils.showSuccessfulMessage();
            } else {
                int vacinaId = Integer.parseInt(id);
                Vacina vacina = vacinaController.getVacinaById(vacinaId);
                if(vacina != null) {
                    vacina.setNome(nome);
                    vacina.setDescricao(descricao);
                    vacina.setMarca(marca);
                    vacina.setQuantidadeEstoque(quantidade);
                    Utils.showSuccessfulMessage();
                } else {
                    Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
                }
            }
            updateTable(tableVacinas, vacinaController.getAllVacinas());
            Utils.setComponentsEnabled(true, btnNovoVacina);
            Utils.setComponentsEnabled(false, btnAlterarVacina, btnExcluirVacina, btnSalvarVacina, btnCancelarVacina);
            txtVacinaId.setText("");
            txtVacinaNome.setText("");
            txtVacinaDescricao.setText("");
            txtVacinaMarca.setText("");
            txtVacinaQuantidade.setText("");
            Utils.setComponentsEnabled(false, txtVacinaId, txtVacinaNome, txtVacinaDescricao, txtVacinaMarca, txtVacinaQuantidade);
        } catch (NumberFormatException e) {
            Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
        }
    }//GEN-LAST:event_btnSalvarVacinaActionPerformed
    
    private void btnNovoVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoVacinaActionPerformed
        Utils.setComponentsEnabled(false, btnNovoVacina);
        Utils.setComponentsEnabled(true, btnSalvarVacina, btnCancelarVacina);
        Utils.setComponentsEnabled(true, txtVacinaNome, txtVacinaDescricao, txtVacinaMarca, txtVacinaQuantidade);
        txtVacinaNome.requestFocus();
    }//GEN-LAST:event_btnNovoVacinaActionPerformed

    private void btnCancelarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVacinaActionPerformed
        Utils.setComponentsEnabled(true, btnNovoVacina);
        Utils.setComponentsEnabled(false, btnAlterarVacina, btnExcluirVacina, btnSalvarVacina, btnCancelarVacina);
        txtVacinaId.setText("");
        txtVacinaNome.setText("");
        txtVacinaDescricao.setText("");
        txtVacinaMarca.setText("");
        txtVacinaQuantidade.setText("");
        Utils.setComponentsEnabled(false, txtVacinaNome, txtVacinaDescricao, txtVacinaMarca, txtVacinaQuantidade);
    }//GEN-LAST:event_btnCancelarVacinaActionPerformed

    private void tableVacinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVacinasMouseClicked
        if(!txtVacinaNome.isEnabled()) {
            Utils.setComponentsEnabled(false, btnNovoVacina);
            Utils.setComponentsEnabled(true, btnAlterarVacina, btnExcluirVacina, btnCancelarVacina);
            int row = tableVacinas.getSelectedRow();
            if(row != -1) {
                Vacina vacina = ((VacinaTableModel)tableVacinas.getModel()).getItem(row);
                txtVacinaId.setText(String.valueOf(vacina.getId()));
                txtVacinaNome.setText(vacina.getNome());
                txtVacinaDescricao.setText(vacina.getDescricao());
                txtVacinaMarca.setText(vacina.getMarca());
                txtVacinaQuantidade.setText(String.valueOf(vacina.getQuantidadeEstoque()));
            }
        }
    }//GEN-LAST:event_tableVacinasMouseClicked

    private void btnAlterarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVacinaActionPerformed
        Utils.setComponentsEnabled(false, btnNovoVacina, btnAlterarVacina, btnExcluirVacina);                                             
        Utils.setComponentsEnabled(true, btnSalvarVacina);
        Utils.setComponentsEnabled(true, txtVacinaNome, txtVacinaDescricao, txtVacinaMarca, txtVacinaQuantidade);
    }//GEN-LAST:event_btnAlterarVacinaActionPerformed

    private void btnExcluirVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVacinaActionPerformed
        String idTxt = txtVacinaId.getText();
        int id = Integer.parseInt(idTxt);
        Vacina vacina = vacinaController.getVacinaById(id);
        vacinaController.deleteVacina(vacina);
        Utils.showSuccessfulMessage();
        txtVacinaId.setText("");
        txtVacinaNome.setText("");
        txtVacinaDescricao.setText("");
        txtVacinaMarca.setText("");
        txtVacinaQuantidade.setText("");
        Utils.setComponentsEnabled(false, txtVacinaId, txtVacinaNome, txtVacinaDescricao, txtVacinaMarca, txtVacinaQuantidade);
        Utils.setComponentsEnabled(true, btnNovoVacina);
        Utils.setComponentsEnabled(false, btnAlterarVacina, btnExcluirVacina, btnSalvarVacina, btnCancelarVacina);
        updateTable(tableVacinas, vacinaController.getAllVacinas());
    }//GEN-LAST:event_btnExcluirVacinaActionPerformed

    private void btnPesquisarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarVeterinarioActionPerformed
        String nome = txtPesquisarVeterinario.getText();
        updateTable(tableVacinas, vacinaController.searchVacinaByName(nome));
    }//GEN-LAST:event_btnPesquisarVeterinarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.components.UpdateButton btnAlterarVacina;
    private view.components.CancelButton btnCancelarVacina;
    private view.components.DeleteButton btnExcluirVacina;
    private view.components.NewButton btnNovoVacina;
    private view.components.SearchButton btnPesquisarVeterinario;
    private view.components.SaveButton btnSalvarVacina;
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
    private javax.swing.JTable tableVacinas;
    private javax.swing.JTextField txtPesquisarVeterinario;
    private javax.swing.JTextField txtVacinaDescricao;
    private javax.swing.JTextField txtVacinaId;
    private javax.swing.JTextField txtVacinaMarca;
    private javax.swing.JTextField txtVacinaNome;
    private javax.swing.JTextField txtVacinaQuantidade;
    // End of variables declaration//GEN-END:variables
}
