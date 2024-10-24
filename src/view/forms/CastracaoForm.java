/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.forms;

import controller.AnimalController;
import controller.CastracaoController;
import controller.TutorController;
import controller.VeterinarioController;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import models.Animal;
import models.Castracao;
import models.ConsultaGeral;
import models.Tutor;
import models.Veterinario;
import tablemodel.AnimalTableModel;
import tablemodel.CastracaoTableModel;
import utils.Utils;
import view.dialogs.SelecionarAnimalDialog;
import view.dialogs.SelecionarTutorDialog;
import view.dialogs.SelecionarVeterinarioDialog;

/**
 *
 * @author Felipe
 */
public class CastracaoForm extends javax.swing.JPanel {
    CastracaoController castracaoController;
    AnimalController animalController;
    TutorController tutorController;
    VeterinarioController veterinarioController;
    AnimalTableModel animalTableModel;
    Tutor tutorSelecionado;
    Animal animalSelecionado;
    Veterinario veterinarioSelecionado;
    
    public CastracaoForm(CastracaoController castracaoController, AnimalController animalController, TutorController tutorController, VeterinarioController veterinarioController) {
        this.castracaoController = castracaoController;
        this.animalController = animalController;
        this.tutorController = tutorController;
        this.veterinarioController = veterinarioController;
        this.animalTableModel = new AnimalTableModel(animalController.getAllAnimais());
        initComponents();
        initPanel();
    }
    
    private void initPanel() {
        txtCastracaoData.setColumns(10);
        Utils.setComponentsEnabled(true, btnNovoCastracao);
        Utils.setComponentsEnabled(true, btnNovoCastracao);
        Utils.setComponentsEnabled(false, btnAlterarCastracao, btnExcluirCastracao, btnSalvarCastracao, btnCancelarCastracao);
        Utils.setComponentsEnabled(false, txtCastracaoId, txtCastracaoTutor, btnCastracaoPesquisarTutor, txtCastracaoAnimal, btnCastracaoPesquisarAnimal, txtCastracaoVeterinario, btnCastracaoPesquisarVeterinario, txtCastracaoData, txtCastracaoHora, txtCastracaoValor, txtCastracaoGasto, txtCastracaoTipo, txtCastracaoPeso, txtCastracaoIdade);
        txtCastracaoTutor.setEditable(false);
        txtCastracaoAnimal.setEditable(false);
        txtCastracaoVeterinario.setEditable(false);
        updateTable(tableCastracoes, castracaoController.getAllCastracoes());
    }
    
    private void updateTable(JTable table, List<Castracao> castracoes) {
        CastracaoTableModel model = new CastracaoTableModel(castracoes, animalController, veterinarioController);
        table.setModel(model);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovoCastracao = new view.components.NewButton();
        btnAlterarCastracao = new view.components.UpdateButton();
        btnExcluirCastracao = new view.components.DeleteButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCastracaoId = new javax.swing.JTextField();
        txtCastracaoTutor = new javax.swing.JTextField();
        txtCastracaoAnimal = new javax.swing.JTextField();
        txtCastracaoVeterinario = new javax.swing.JTextField();
        btnCastracaoPesquisarTutor = new view.components.SearchButton();
        btnCastracaoPesquisarAnimal = new view.components.SearchButton();
        btnCastracaoPesquisarVeterinario = new view.components.SearchButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCastracaoData = new JFormattedTextField(Utils.getDateFormatter());
        ;
        jLabel8 = new javax.swing.JLabel();
        txtCastracaoHora = new JFormattedTextField(Utils.getHourFormatter())
        ;
        jLabel9 = new javax.swing.JLabel();
        txtCastracaoValor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCastracaoGasto = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCastracaoPeso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCastracaoIdade = new javax.swing.JTextField();
        txtCastracaoTipo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnCancelarCastracao = new view.components.CancelButton();
        btnSalvarCastracao = new view.components.SaveButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableCastracoes = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(800, 800));

        btnNovoCastracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCastracaoActionPerformed(evt);
            }
        });

        btnAlterarCastracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCastracaoActionPerformed(evt);
            }
        });

        btnExcluirCastracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCastracaoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Castrações");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovoCastracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarCastracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirCastracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoCastracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarCastracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirCastracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da castração", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("ID");

        jLabel2.setText("Tutor");

        jLabel3.setText("Animal");

        jLabel4.setText("Veterinario");

        txtCastracaoId.setEnabled(false);

        txtCastracaoTutor.setText("Selecione um tutor...");

        txtCastracaoAnimal.setText("Selecione um animal...");

        txtCastracaoVeterinario.setText("Selecione um veterinario...");

        btnCastracaoPesquisarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCastracaoPesquisarTutorActionPerformed(evt);
            }
        });

        btnCastracaoPesquisarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCastracaoPesquisarAnimalActionPerformed(evt);
            }
        });

        btnCastracaoPesquisarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCastracaoPesquisarVeterinarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtCastracaoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCastracaoPesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCastracaoId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtCastracaoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCastracaoPesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtCastracaoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCastracaoPesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCastracaoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCastracaoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCastracaoPesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCastracaoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCastracaoPesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCastracaoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCastracaoPesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jLabel5.setText("Data");

        jLabel8.setText("Hora");

        jLabel9.setText("Valor a ser cobrado");

        jLabel10.setText("Valor gasto");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCastracaoData, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtCastracaoValor))
                .addGap(98, 98, 98)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCastracaoGasto, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(txtCastracaoHora))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(txtCastracaoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCastracaoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCastracaoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCastracaoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel11.setText("Tipo");

        jLabel12.setText("Peso na castração");

        jLabel13.setText("Idade na castração");

        txtCastracaoTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orquiectomia", "Vasectomia", "Ovariossalpingohisterectomia", "Ovariectomia" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(71, 71, 71)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCastracaoIdade)
                            .addComponent(txtCastracaoTipo, 0, 656, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(22, 22, 22)
                        .addComponent(txtCastracaoPeso)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCastracaoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCastracaoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCastracaoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelarCastracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCastracaoActionPerformed(evt);
            }
        });

        btnSalvarCastracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCastracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarCastracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarCastracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCastracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCastracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar castrações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tableCastracoes.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCastracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCastracoesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableCastracoes);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarCastracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCastracaoActionPerformed
        try {
            String idTxt= txtCastracaoId.getText();
            String dataTxt = txtCastracaoData.getText();
            String horaTxt = txtCastracaoHora.getText();
            String valorTxt = txtCastracaoValor.getText();
            String gastoTxt = txtCastracaoGasto.getText();
            double valor = Double.parseDouble(valorTxt);
            double gasto = Double.parseDouble(gastoTxt);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalDate data = LocalDate.parse(dataTxt, dateFormatter);
            LocalTime hora = LocalTime.parse(horaTxt, timeFormatter);
            String tipo = txtCastracaoTipo.getSelectedItem().toString();
            String pesoTxt = txtCastracaoPeso.getText();
            String idadeTxt = txtCastracaoIdade.getText();
            double peso = Double.parseDouble(pesoTxt);
            int idade = Integer.parseInt(idadeTxt);
            if(tutorSelecionado == null || animalSelecionado == null || veterinarioSelecionado == null || dataTxt.isEmpty() || horaTxt.isEmpty() || valorTxt.isEmpty() || gastoTxt.isEmpty() || tipo.isEmpty() || pesoTxt.isEmpty() || idadeTxt.isEmpty()) {
                Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
                return;
            }
            if(idTxt.isEmpty()) {
                castracaoController.createCastracao(data, hora, valor, gasto, animalSelecionado.getId(), veterinarioSelecionado.getId(), tipo, idade, peso);
            } else {
                int id = Integer.parseInt(idTxt);
                Castracao castracao = castracaoController.getCastracaoById(id);
                if(castracao != null) {
                    castracao.setVeterinarioId(veterinarioSelecionado.getId());
                    castracao.setData(data);
                    castracao.setHora(hora);
                    castracao.setValor(valor);
                    castracao.setGasto(gasto);
                    castracao.setTipoCastracao(tipo);
                    castracao.setIdadeNaCastracao(idade);
                    castracao.setPesoNaCastracao(peso);
                    castracaoController.updateCastracao(castracao);
                    Utils.showSuccessfulMessage();
                } else {
                    Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
                }
            }
            updateTable(tableCastracoes, castracaoController.getAllCastracoes());
            Utils.setComponentsEnabled(true, btnNovoCastracao);
            Utils.setComponentsEnabled(false, btnAlterarCastracao, btnExcluirCastracao, btnSalvarCastracao, btnCancelarCastracao);
            txtCastracaoId.setText("");
            txtCastracaoTutor.setText("Selecione um tutor...");
            txtCastracaoAnimal.setText("Selecione um animal...");
            txtCastracaoVeterinario.setText("Selecione um veterinario...");
            txtCastracaoData.setText("");
            txtCastracaoHora.setText("");
            txtCastracaoValor.setText("");
            txtCastracaoGasto.setText("");
            txtCastracaoTipo.setSelectedIndex(0);
            txtCastracaoPeso.setText("");
            txtCastracaoIdade.setText("");
            Utils.setComponentsEnabled(false, txtCastracaoTutor, btnCastracaoPesquisarTutor, txtCastracaoAnimal, btnCastracaoPesquisarAnimal, txtCastracaoVeterinario, btnCastracaoPesquisarVeterinario, txtCastracaoData, txtCastracaoHora, txtCastracaoValor, txtCastracaoGasto, txtCastracaoTipo, txtCastracaoPeso, txtCastracaoIdade);
            
        } catch (NumberFormatException e) {
            System.out.println("Erro de entrada");    
            Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
        } catch (DateTimeParseException e) {
            System.out.println("Data ou hora em formato incorreto!");
            Utils.showWarningMessage("Data ou hora em formato incorreto!", "Data ou hora em formato incorreto!");
        }
    }//GEN-LAST:event_btnSalvarCastracaoActionPerformed

    private void btnNovoCastracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCastracaoActionPerformed
        Utils.setComponentsEnabled(false, btnNovoCastracao);
        Utils.setComponentsEnabled(true, btnSalvarCastracao, btnCancelarCastracao);
        Utils.setComponentsEnabled(true, txtCastracaoTutor, btnCastracaoPesquisarTutor, txtCastracaoAnimal, btnCastracaoPesquisarAnimal, txtCastracaoVeterinario, btnCastracaoPesquisarVeterinario, txtCastracaoData, txtCastracaoHora, txtCastracaoValor, txtCastracaoGasto, txtCastracaoTipo, txtCastracaoPeso, txtCastracaoIdade);
        txtCastracaoTutor.requestFocus();
    }//GEN-LAST:event_btnNovoCastracaoActionPerformed

    private void btnCancelarCastracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCastracaoActionPerformed
        Utils.setComponentsEnabled(true, btnNovoCastracao);
        Utils.setComponentsEnabled(false, btnAlterarCastracao, btnExcluirCastracao, btnSalvarCastracao, btnCancelarCastracao);
        txtCastracaoId.setText("");
        txtCastracaoTutor.setText("Selecione um tutor...");
        txtCastracaoAnimal.setText("Selecione um animal...");
        txtCastracaoVeterinario.setText("Selecione um veterinario...");
        txtCastracaoData.setText("");
        txtCastracaoHora.setText("");
        txtCastracaoValor.setText("");
        txtCastracaoGasto.setText("");
        txtCastracaoTipo.setSelectedIndex(0);
        txtCastracaoPeso.setText("");
        txtCastracaoIdade.setText("");
        Utils.setComponentsEnabled(false, txtCastracaoTutor, btnCastracaoPesquisarTutor, txtCastracaoAnimal, btnCastracaoPesquisarAnimal, txtCastracaoVeterinario, btnCastracaoPesquisarVeterinario, txtCastracaoData, txtCastracaoHora, txtCastracaoValor, txtCastracaoGasto, txtCastracaoTipo, txtCastracaoPeso, txtCastracaoIdade);
    }//GEN-LAST:event_btnCancelarCastracaoActionPerformed

    private void btnCastracaoPesquisarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCastracaoPesquisarTutorActionPerformed
        SelecionarTutorDialog dialog = new SelecionarTutorDialog(null, true, tutorController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        tutorSelecionado = dialog.getTutorSelecionado();
        if(tutorSelecionado != null) {
            txtCastracaoTutor.setText(tutorSelecionado.getNome());
        } else {
            txtCastracaoTutor.setText("Nenhum Tutor selecionado");
        }
    }//GEN-LAST:event_btnCastracaoPesquisarTutorActionPerformed

    private void btnCastracaoPesquisarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCastracaoPesquisarAnimalActionPerformed
        SelecionarAnimalDialog dialog = new SelecionarAnimalDialog(null, true, animalController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        animalSelecionado = dialog.getAnimalSelecionado();
        if(animalSelecionado != null) {
            txtCastracaoAnimal.setText(animalSelecionado.getNome());
        } else {
            txtCastracaoAnimal.setText("Nenhum animal selecionado");
        }
    }//GEN-LAST:event_btnCastracaoPesquisarAnimalActionPerformed

    private void btnCastracaoPesquisarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCastracaoPesquisarVeterinarioActionPerformed
        SelecionarVeterinarioDialog dialog = new SelecionarVeterinarioDialog(null, true, veterinarioController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        veterinarioSelecionado = dialog.getVeterinarioSelecionado();
        if(veterinarioSelecionado != null) {
            txtCastracaoVeterinario.setText(veterinarioSelecionado.getNome());
        } else {
            txtCastracaoVeterinario.setText("Nenhum veterinario selecionado");
        }
    }//GEN-LAST:event_btnCastracaoPesquisarVeterinarioActionPerformed

    private void tableCastracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCastracoesMouseClicked
        if(!txtCastracaoData.isEnabled()) {
            Utils.setComponentsEnabled(false, btnNovoCastracao);
            Utils.setComponentsEnabled(true, btnAlterarCastracao, btnExcluirCastracao, btnCancelarCastracao);
            int row = tableCastracoes.getSelectedRow();
            if(row != -1) {
                Castracao castracao = ((CastracaoTableModel)tableCastracoes.getModel()).getItem(row);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                animalSelecionado = animalController.getAnimalById(castracao.getAnimalId());
                tutorSelecionado = tutorController.getTutorById(animalSelecionado.getId());
                veterinarioSelecionado = veterinarioController.getVeterinarioById(castracao.getVeterinarioId());
                txtCastracaoId.setText(String.valueOf(castracao.getId()));
                txtCastracaoTutor.setText(tutorSelecionado.getNome());
                txtCastracaoAnimal.setText(animalSelecionado.getNome());
                txtCastracaoVeterinario.setText(veterinarioSelecionado.getNome());
                txtCastracaoData.setText(String.valueOf(castracao.getData().format(formatter)));
                txtCastracaoHora.setText(String.valueOf(castracao.getHora()));
                txtCastracaoValor.setText(String.valueOf(castracao.getValor()));
                txtCastracaoGasto.setText(String.valueOf(castracao.getGasto()));
                txtCastracaoTipo.setSelectedItem(castracao.getTipoCastracao());
                txtCastracaoIdade.setText(String.valueOf(castracao.getIdadeNaCastracao()));
                txtCastracaoPeso.setText(String.valueOf(castracao.getPesoNaCastracao()));
            }
        }
    }//GEN-LAST:event_tableCastracoesMouseClicked

    private void btnAlterarCastracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCastracaoActionPerformed
        Utils.setComponentsEnabled(false, btnNovoCastracao, btnAlterarCastracao, btnExcluirCastracao);                                             
        Utils.setComponentsEnabled(true, btnSalvarCastracao);
        Utils.setComponentsEnabled(true, txtCastracaoVeterinario, btnCastracaoPesquisarVeterinario, txtCastracaoData, txtCastracaoHora, txtCastracaoValor, txtCastracaoGasto, txtCastracaoTipo, txtCastracaoIdade, txtCastracaoPeso);
    }//GEN-LAST:event_btnAlterarCastracaoActionPerformed

    private void btnExcluirCastracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCastracaoActionPerformed
        String idTxt = txtCastracaoId.getText();
        int id = Integer.parseInt(idTxt);
        Castracao castracao = castracaoController.getCastracaoById(id);
        castracaoController.deleteCastracao(castracao);
        Utils.showSuccessfulMessage();
         txtCastracaoId.setText("");
        txtCastracaoTutor.setText("Selecione um tutor...");
        txtCastracaoAnimal.setText("Selecione um animal...");
        txtCastracaoVeterinario.setText("Selecione um veterinario...");
        txtCastracaoData.setText("");
        txtCastracaoHora.setText("");
        txtCastracaoValor.setText("");
        txtCastracaoGasto.setText("");
        txtCastracaoTipo.setSelectedIndex(0);
        txtCastracaoPeso.setText("");
        txtCastracaoIdade.setText("");
        Utils.setComponentsEnabled(false, txtCastracaoVeterinario, btnCastracaoPesquisarVeterinario, txtCastracaoData, txtCastracaoHora, txtCastracaoValor, txtCastracaoGasto, txtCastracaoTipo, txtCastracaoIdade, txtCastracaoPeso);
        Utils.setComponentsEnabled(true, btnNovoCastracao);
        Utils.setComponentsEnabled(false, btnAlterarCastracao, btnExcluirCastracao, btnCancelarCastracao, btnSalvarCastracao);
        updateTable(tableCastracoes, castracaoController.getAllCastracoes());
    }//GEN-LAST:event_btnExcluirCastracaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.components.UpdateButton btnAlterarCastracao;
    private view.components.CancelButton btnCancelarCastracao;
    private view.components.SearchButton btnCastracaoPesquisarAnimal;
    private view.components.SearchButton btnCastracaoPesquisarTutor;
    private view.components.SearchButton btnCastracaoPesquisarVeterinario;
    private view.components.DeleteButton btnExcluirCastracao;
    private view.components.NewButton btnNovoCastracao;
    private view.components.SaveButton btnSalvarCastracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tableCastracoes;
    private javax.swing.JTextField txtCastracaoAnimal;
    private javax.swing.JFormattedTextField txtCastracaoData;
    private javax.swing.JTextField txtCastracaoGasto;
    private javax.swing.JFormattedTextField txtCastracaoHora;
    private javax.swing.JTextField txtCastracaoId;
    private javax.swing.JTextField txtCastracaoIdade;
    private javax.swing.JTextField txtCastracaoPeso;
    private javax.swing.JComboBox<String> txtCastracaoTipo;
    private javax.swing.JTextField txtCastracaoTutor;
    private javax.swing.JTextField txtCastracaoValor;
    private javax.swing.JTextField txtCastracaoVeterinario;
    // End of variables declaration//GEN-END:variables
}
