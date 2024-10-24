/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.forms;

import controller.AnimalController;
import controller.TutorController;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import models.Animal;
import models.Tutor;
import tablemodel.AnimalTableModel;
import tablemodel.TutorTableModel;
import utils.Utils;
import view.dialogs.SelecionarTutorDialog;

/**
 *
 * @author Felipe
 */
public class AnimalForm extends javax.swing.JPanel {
    AnimalController animalController;
    TutorController tutorController;
    AnimalTableModel animalTableModel;
    Tutor tutorSelecionado;
    
    public AnimalForm(AnimalController animalController, TutorController tutorController) {
        this.animalController = animalController;
        this.tutorController = tutorController;
        this.animalTableModel = new AnimalTableModel(animalController.getAllAnimais());
        initComponents();
        initPanel();
    }
    
    private void initPanel() {
        txtAnimalRaca.setColumns(14);
        Utils.setComponentsEnabled(true, btnNovoAnimal);
        Utils.setComponentsEnabled(true, btnNovoAnimal);
        Utils.setComponentsEnabled(false, btnAlterarAnimal, btnExcluirAnimal, btnSalvarAnimal, btnCancelarAnimal);
        Utils.setComponentsEnabled(false, txtAnimalId, txtAnimalNome, txtAnimalEspecie, txtAnimalRaca, txtAnimalIdade, txtAnimalSexo, txtAnimalTutor, btnAnimalPesquisarTutor);
        txtAnimalTutor.setEditable(false);
        updateTable(tableAnimais, animalController.getAllAnimais());
    }
    
    
    private void updateTable(JTable table, List<Animal> animais) {
        AnimalTableModel model = new AnimalTableModel(animais);
        table.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovoAnimal = new view.components.NewButton();
        btnAlterarAnimal = new view.components.UpdateButton();
        btnExcluirAnimal = new view.components.DeleteButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAnimalId = new javax.swing.JTextField();
        txtAnimalNome = new javax.swing.JTextField();
        txtAnimalEspecie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAnimalSexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtAnimalTutor = new javax.swing.JTextField();
        btnAnimalPesquisarTutor = new view.components.SearchButton();
        txtAnimalRaca = new javax.swing.JTextField();
        txtAnimalIdade = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnCancelarAnimal = new view.components.CancelButton();
        btnSalvarAnimal = new view.components.SaveButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAnimais = new javax.swing.JTable();
        txtPesquisarAnimal = new javax.swing.JTextField();
        btnPesquisarAnimal = new view.components.SearchButton();

        setPreferredSize(new java.awt.Dimension(800, 800));

        btnNovoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAnimalActionPerformed(evt);
            }
        });

        btnAlterarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAnimalActionPerformed(evt);
            }
        });

        btnExcluirAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAnimalActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Animais");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do animal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jLabel3.setText("Espécie");

        jLabel4.setText("Raça");

        txtAnimalId.setEnabled(false);

        jLabel5.setText("Idade");

        jLabel6.setText("Sexo");

        txtAnimalSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        txtAnimalSexo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAnimalSexo.setOpaque(true);

        jLabel7.setText("Tutor");

        txtAnimalTutor.setText("Selecione um tutor..");

        btnAnimalPesquisarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalPesquisarTutorActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtAnimalId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAnimalNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnimalEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))
                            .addComponent(txtAnimalRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnimalSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtAnimalTutor, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnimalPesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAnimalIdade)))
                    .addComponent(jLabel4))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAnimalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtAnimalIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAnimalNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtAnimalSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtAnimalTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnimalPesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnimalEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAnimalRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnCancelarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAnimalActionPerformed(evt);
            }
        });

        btnSalvarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar animais por nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tableAnimais.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAnimaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAnimais);

        btnPesquisarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtPesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnPesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAnimalActionPerformed
        try {
            String id = txtAnimalId.getText();
            String nome = txtAnimalNome.getText();
            String especie = txtAnimalEspecie.getText();
            String raca = txtAnimalRaca.getText();
            String idadeTexto = txtAnimalIdade.getText();
            String sexo = (String) txtAnimalSexo.getSelectedItem();
            
            if(nome.isEmpty() || especie.isEmpty() || raca.isEmpty() || idadeTexto.isEmpty() || sexo.isEmpty() || tutorSelecionado == null) {
                Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
                return;
            }
            
            int idade;
            try {
                idade = Integer.parseInt(idadeTexto);
            } catch(NumberFormatException e) {
                Utils.showWarningMessage("Valor inválido", "A idade deve ser um número inteiro válido");
                return;
            }
            
            if(id.isEmpty()) {
                animalController.createAnimal(nome, especie, raca, idade, sexo, tutorSelecionado.getId());
            } else {
                int animalId = Integer.parseInt(id);
                Animal animal = animalController.getAnimalById(animalId);
                if(animal != null) {
                    animal.setNome(nome);
                    animal.setEspecie(especie);
                    animal.setRaca(raca);
                    animal.setIdade(idade);
                    animal.setSexo(sexo);
                    animal.setTutorId(tutorSelecionado.getId());
                    animalController.updateAnimal(animal);
                } else {
                    Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
                }
            }
            Utils.showSuccessfulMessage();
            Utils.setComponentsEnabled(true, btnNovoAnimal);
            Utils.setComponentsEnabled(false, btnAlterarAnimal, btnExcluirAnimal, btnSalvarAnimal, btnCancelarAnimal);
            txtAnimalId.setText("");
            txtAnimalNome.setText("");
            txtAnimalEspecie.setText("");
            txtAnimalRaca.setText("");
            txtAnimalIdade.setText("");
            txtAnimalTutor.setText("");
            updateTable(tableAnimais, animalController.getAllAnimais());
            Utils.setComponentsEnabled(false, txtAnimalId, txtAnimalNome, txtAnimalEspecie, txtAnimalRaca, txtAnimalIdade, txtAnimalSexo, txtAnimalTutor, btnAnimalPesquisarTutor);
        } catch (NumberFormatException e) {
            Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
        }
    }//GEN-LAST:event_btnSalvarAnimalActionPerformed

    private void btnNovoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAnimalActionPerformed
        Utils.setComponentsEnabled(false, btnNovoAnimal);
        Utils.setComponentsEnabled(true, btnSalvarAnimal, btnCancelarAnimal);
        Utils.setComponentsEnabled(true, txtAnimalNome, txtAnimalEspecie, txtAnimalRaca, txtAnimalIdade, txtAnimalSexo, txtAnimalTutor, btnAnimalPesquisarTutor);
        txtAnimalNome.requestFocus();
    }//GEN-LAST:event_btnNovoAnimalActionPerformed

    private void btnCancelarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAnimalActionPerformed
        Utils.setComponentsEnabled(true, btnNovoAnimal);
        Utils.setComponentsEnabled(false, btnAlterarAnimal, btnExcluirAnimal, btnSalvarAnimal, btnCancelarAnimal);
        txtAnimalId.setText("");
        txtAnimalNome.setText("");
        txtAnimalEspecie.setText("");
        txtAnimalRaca.setText("");
        txtAnimalIdade.setText("");
        txtAnimalTutor.setText("");
        Utils.setComponentsEnabled(false, txtAnimalNome, txtAnimalEspecie, txtAnimalRaca, txtAnimalIdade, txtAnimalSexo, txtAnimalTutor, btnAnimalPesquisarTutor);
    }//GEN-LAST:event_btnCancelarAnimalActionPerformed

    private void tableAnimaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAnimaisMouseClicked
        if(!txtAnimalNome.isEnabled()) {
            Utils.setComponentsEnabled(false, btnNovoAnimal);
            Utils.setComponentsEnabled(true, btnAlterarAnimal, btnExcluirAnimal, btnCancelarAnimal);
            int row = tableAnimais.getSelectedRow();
            if(row != -1) {
                Animal animal = ((AnimalTableModel)tableAnimais.getModel()).getItem(row);
                txtAnimalId.setText(String.valueOf(animal.getId()));
                txtAnimalNome.setText(animal.getNome());
                txtAnimalEspecie.setText(animal.getEspecie());
                txtAnimalRaca.setText(animal.getRaca());
                txtAnimalIdade.setText(String.valueOf(animal.getIdade()));
                txtAnimalSexo.setSelectedItem(animal.getSexo());
                tutorSelecionado = tutorController.getTutorById(animal.getTutorId());
                txtAnimalTutor.setText(tutorSelecionado.getNome());
            }
        }
    }//GEN-LAST:event_tableAnimaisMouseClicked

    private void btnAnimalPesquisarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimalPesquisarTutorActionPerformed
        SelecionarTutorDialog dialog = new SelecionarTutorDialog(null, true, tutorController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        tutorSelecionado = dialog.getTutorSelecionado();
        if(tutorSelecionado != null) {
            txtAnimalTutor.setText(tutorSelecionado.getNome());
        } else {
            txtAnimalTutor.setText("Nenhum Tutor selecionado");
        }
    }//GEN-LAST:event_btnAnimalPesquisarTutorActionPerformed

    private void btnAlterarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAnimalActionPerformed
        Utils.setComponentsEnabled(false, btnNovoAnimal, btnAlterarAnimal, btnExcluirAnimal);                                             
        Utils.setComponentsEnabled(true, btnSalvarAnimal);
        Utils.setComponentsEnabled(true, txtAnimalNome, txtAnimalEspecie, txtAnimalRaca, txtAnimalIdade, txtAnimalSexo);
    }//GEN-LAST:event_btnAlterarAnimalActionPerformed

    private void btnPesquisarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAnimalActionPerformed
        String nome = txtPesquisarAnimal.getText();
        updateTable(tableAnimais, animalController.searchAnimalByName(nome));
    }//GEN-LAST:event_btnPesquisarAnimalActionPerformed

    private void btnExcluirAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAnimalActionPerformed
        String idTxt = txtAnimalId.getText();
        int id = Integer.parseInt(idTxt);
        Animal animal = animalController.getAnimalById(id);
        animalController.deleteAnimal(animal);
        Utils.showSuccessfulMessage();
        txtAnimalId.setText("");
        txtAnimalNome.setText("");
        txtAnimalEspecie.setText("");
        txtAnimalRaca.setText("");
        txtAnimalIdade.setText("");
        txtAnimalTutor.setText("");
        Utils.setComponentsEnabled(false, txtAnimalNome, txtAnimalEspecie, txtAnimalRaca, txtAnimalIdade, txtAnimalSexo);
        Utils.setComponentsEnabled(true, btnNovoAnimal);
        Utils.setComponentsEnabled(false, btnAlterarAnimal, btnExcluirAnimal, btnCancelarAnimal, btnSalvarAnimal);
        updateTable(tableAnimais, animalController.getAllAnimais());
    }//GEN-LAST:event_btnExcluirAnimalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.components.UpdateButton btnAlterarAnimal;
    private view.components.SearchButton btnAnimalPesquisarTutor;
    private view.components.CancelButton btnCancelarAnimal;
    private view.components.DeleteButton btnExcluirAnimal;
    private view.components.NewButton btnNovoAnimal;
    private view.components.SearchButton btnPesquisarAnimal;
    private view.components.SaveButton btnSalvarAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAnimais;
    private javax.swing.JTextField txtAnimalEspecie;
    private javax.swing.JTextField txtAnimalId;
    private javax.swing.JTextField txtAnimalIdade;
    private javax.swing.JTextField txtAnimalNome;
    private javax.swing.JTextField txtAnimalRaca;
    private javax.swing.JComboBox<String> txtAnimalSexo;
    private javax.swing.JTextField txtAnimalTutor;
    private javax.swing.JTextField txtPesquisarAnimal;
    // End of variables declaration//GEN-END:variables
}
