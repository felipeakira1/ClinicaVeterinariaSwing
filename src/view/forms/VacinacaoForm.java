/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.forms;

import controller.AnimalController;
import controller.TutorController;
import controller.VacinaController;
import controller.VacinacaoController;
import controller.VeterinarioController;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import models.Animal;
import models.Tutor;
import models.Vacina;
import models.Vacinacao;
import models.Veterinario;
import tablemodel.VacinacaoTableModel;
import utils.Utils;
import view.dialogs.SelecionarAnimalDialog;
import view.dialogs.SelecionarTutorDialog;
import view.dialogs.SelecionarVacinaDialog;
import view.dialogs.SelecionarVeterinarioDialog;

/**
 *
 * @author Felipe
 */
public class VacinacaoForm extends javax.swing.JPanel {
    VacinacaoController vacinacaoController;
    AnimalController animalController;
    TutorController tutorController;
    VeterinarioController veterinarioController;
    VacinaController vacinaController;
    Tutor tutorSelecionado;
    Animal animalSelecionado;
    Veterinario veterinarioSelecionado;
    Vacina vacinaSelecionada;
    Animal filtrarAnimalSelecionado;
    Veterinario filtrarVeterinarioSelecionado;
    
    public VacinacaoForm(VacinacaoController vacinacaoController, AnimalController animalController, TutorController tutorController, VeterinarioController veterinarioController, VacinaController vacinaController) {
        this.vacinacaoController = vacinacaoController;
        this.animalController = animalController;
        this.tutorController = tutorController;
        this.veterinarioController = veterinarioController;
        this.vacinaController = vacinaController;
        initComponents();
        initPanel();
    }
    
    private void initPanel() {
        txtVacinacaoData.setColumns(10);
        Utils.setComponentsEnabled(true, btnNovoVacinacao);
        Utils.setComponentsEnabled(true, btnNovoVacinacao);
        Utils.setComponentsEnabled(false, btnAlterarVacinacao, btnExcluirVacinacao, btnSalvarVacinacao, btnCancelarVacinacao);
        Utils.setComponentsEnabled(false, txtVacinacaoId, txtVacinacaoTutor, btnVacinacaoPesquisarTutor, txtVacinacaoAnimal, btnVacinacaoPesquisarAnimal, txtVacinacaoVeterinario, btnVacinacaoPesquisarVeterinario, txtVacinacaoData, txtVacinacaoHora, txtVacinacaoValor, txtVacinacaoGasto, txtVacinacaoVacina, btnVacinacaoPesquisarVacina, txtVacinacaoDataProximaDose);
        txtVacinacaoTutor.setEditable(false);
        txtVacinacaoAnimal.setEditable(false);
        txtVacinacaoVeterinario.setEditable(false);
        txtVacinacaoVacina.setEditable(false);
        updateTable(tableVacinacoes, vacinacaoController.getAllVacinacoes());
    }
    
    private void updateTable(JTable table, List<Vacinacao> vacinacoes) {
        VacinacaoTableModel model = new VacinacaoTableModel(vacinacoes, animalController, veterinarioController, vacinaController);
        table.setModel(model);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovoVacinacao = new view.components.NewButton();
        btnAlterarVacinacao = new view.components.UpdateButton();
        btnExcluirVacinacao = new view.components.DeleteButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVacinacaoId = new javax.swing.JTextField();
        txtVacinacaoTutor = new javax.swing.JTextField();
        txtVacinacaoAnimal = new javax.swing.JTextField();
        txtVacinacaoVeterinario = new javax.swing.JTextField();
        btnVacinacaoPesquisarTutor = new view.components.SearchButton();
        btnVacinacaoPesquisarAnimal = new view.components.SearchButton();
        btnVacinacaoPesquisarVeterinario = new view.components.SearchButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtVacinacaoData = new JFormattedTextField(Utils.getDateFormatter())
        ;
        jLabel8 = new javax.swing.JLabel();
        txtVacinacaoHora = new JFormattedTextField(Utils.getHourFormatter())
        ;
        jLabel9 = new javax.swing.JLabel();
        txtVacinacaoValor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtVacinacaoGasto = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtVacinacaoDataProximaDose = new JFormattedTextField(Utils.getDateFormatter())
        ;
        txtVacinacaoVacina = new javax.swing.JTextField();
        btnVacinacaoPesquisarVacina = new view.components.SearchButton();
        jPanel3 = new javax.swing.JPanel();
        btnCancelarVacinacao = new view.components.CancelButton();
        btnSalvarVacinacao = new view.components.SaveButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableVacinacoes = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnFiltrarAnimal = new view.components.SearchButton();
        txtFiltrarDataFinal = new JFormattedTextField(Utils.getDateFormatter());  ;
        jLabel14 = new javax.swing.JLabel();
        btnFiltrar = new view.components.SearchButton();
        txtFiltrarAnimal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnLimparVeterinario = new view.components.CancelButton();
        jLabel17 = new javax.swing.JLabel();
        txtFiltrarDataInicial = new JFormattedTextField(Utils.getDateFormatter());  ;
        txtFiltrarVeterinario = new javax.swing.JTextField();
        btnLimparAnimal = new view.components.CancelButton();
        btnFiltrarVeterinario = new view.components.SearchButton();
        btnLimparDataAntes = new view.components.CancelButton();
        btnLimparDataApartir = new view.components.CancelButton();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 800));

        btnNovoVacinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoVacinacaoActionPerformed(evt);
            }
        });

        btnAlterarVacinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVacinacaoActionPerformed(evt);
            }
        });

        btnExcluirVacinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVacinacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterarVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("ID");

        jLabel2.setText("Tutor");

        jLabel3.setText("Animal");

        jLabel4.setText("Veterinario");

        txtVacinacaoId.setEnabled(false);

        txtVacinacaoTutor.setText("Selecione um tutor...");

        txtVacinacaoAnimal.setText("Selecione um animal...");

        txtVacinacaoVeterinario.setText("Selecione um veterinario...");

        btnVacinacaoPesquisarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacinacaoPesquisarTutorActionPerformed(evt);
            }
        });

        btnVacinacaoPesquisarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacinacaoPesquisarAnimalActionPerformed(evt);
            }
        });

        btnVacinacaoPesquisarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacinacaoPesquisarVeterinarioActionPerformed(evt);
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
                                .addComponent(txtVacinacaoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVacinacaoPesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtVacinacaoId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtVacinacaoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVacinacaoPesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtVacinacaoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVacinacaoPesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVacinacaoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVacinacaoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVacinacaoPesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVacinacaoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVacinacaoPesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVacinacaoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVacinacaoPesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
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
                    .addComponent(txtVacinacaoData, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtVacinacaoValor))
                .addGap(98, 98, 98)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVacinacaoGasto, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(txtVacinacaoHora))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(txtVacinacaoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtVacinacaoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtVacinacaoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtVacinacaoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel11.setText("Vacina");

        jLabel6.setText("Data próxima dose");

        txtVacinacaoVacina.setText("Selecione uma vacina...");

        btnVacinacaoPesquisarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacinacaoPesquisarVacinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVacinacaoDataProximaDose, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVacinacaoVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVacinacaoPesquisarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtVacinacaoVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVacinacaoPesquisarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtVacinacaoDataProximaDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnCancelarVacinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVacinacaoActionPerformed(evt);
            }
        });

        btnSalvarVacinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarVacinacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tableVacinacoes.setModel(new javax.swing.table.DefaultTableModel(
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
        tableVacinacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVacinacoesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableVacinacoes);

        jLabel16.setText("A partir de:");

        btnFiltrarAnimal.setText("");
        btnFiltrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarAnimalActionPerformed(evt);
            }
        });

        jLabel14.setText("Filtrar por veterinário");

        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        txtFiltrarAnimal.setText("Selecione um animal...");

        jLabel12.setText("Filtrar por animal");

        btnLimparVeterinario.setText("");
        btnLimparVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparVeterinarioActionPerformed(evt);
            }
        });

        jLabel17.setText("Antes de:");

        txtFiltrarVeterinario.setText("Selecione um veterinario...");

        btnLimparAnimal.setText("");
        btnLimparAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparAnimalActionPerformed(evt);
            }
        });

        btnFiltrarVeterinario.setText("");
        btnFiltrarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarVeterinarioActionPerformed(evt);
            }
        });

        btnLimparDataAntes.setText("");
        btnLimparDataAntes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDataAntesActionPerformed(evt);
            }
        });

        btnLimparDataApartir.setText("");
        btnLimparDataApartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDataApartirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFiltrarAnimal)
                            .addComponent(txtFiltrarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFiltrarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btnFiltrarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimparAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimparVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFiltrarDataFinal)
                            .addComponent(txtFiltrarDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimparDataApartir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimparDataAntes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLimparAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFiltrarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFiltrarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtFiltrarDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)))
                            .addComponent(btnLimparDataApartir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimparVeterinario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFiltrarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFiltrarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(txtFiltrarDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17))))
                    .addComponent(btnLimparDataAntes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Vacinações");

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
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarVacinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarVacinacaoActionPerformed
        try {
            String idTxt= txtVacinacaoId.getText();
            String dataTxt = txtVacinacaoData.getText();
            String horaTxt = txtVacinacaoHora.getText();
            String valorTxt = txtVacinacaoValor.getText();
            String gastoTxt = txtVacinacaoGasto.getText();
            String dataProximaDoseTxt = txtVacinacaoDataProximaDose.getText();
            double valor = Double.parseDouble(valorTxt);
            double gasto = Double.parseDouble(gastoTxt);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalDate data = LocalDate.parse(dataTxt, dateFormatter);
            LocalTime hora = LocalTime.parse(horaTxt, timeFormatter);
            LocalDate dataProximaDose = LocalDate.parse(dataProximaDoseTxt, dateFormatter);
            if(tutorSelecionado == null || animalSelecionado == null || veterinarioSelecionado == null || vacinaSelecionada == null || dataTxt.isEmpty() || horaTxt.isEmpty() || valorTxt.isEmpty() || gastoTxt.isEmpty() || dataProximaDoseTxt.isEmpty()) {
                Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
                return;
            }
            if(idTxt.isEmpty()) {
                vacinacaoController.createVacinacao(data, hora, valor, gasto, animalSelecionado.getId(), veterinarioSelecionado.getId(), vacinaSelecionada.getId(), dataProximaDose);
            } else {
                int id = Integer.parseInt(idTxt);
                Vacinacao vacinacao = vacinacaoController.getVacinacaoById(id);
                if(vacinacao != null) {
                    vacinacao.setData(data);
                    vacinacao.setHora(hora);
                    vacinacao.setValor(valor);
                    vacinacao.setGasto(gasto);
                    vacinacao.setVeterinarioId(veterinarioSelecionado.getId());
                    vacinacao.setVacinaId(vacinaSelecionada.getId());
                    vacinacao.setDataProximaDose(dataProximaDose);
                    vacinacaoController.updateVacinacao(vacinacao);
                    Utils.showSuccessfulMessage();
                } else {
                    Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
                }
            }
            updateTable(tableVacinacoes, vacinacaoController.getAllVacinacoes());
            Utils.setComponentsEnabled(true, btnNovoVacinacao);
            Utils.setComponentsEnabled(false, btnAlterarVacinacao, btnExcluirVacinacao, btnSalvarVacinacao, btnCancelarVacinacao);
            txtVacinacaoId.setText("");
            txtVacinacaoTutor.setText("Selecione um tutor...");
            txtVacinacaoAnimal.setText("Selecione um animal...");
            txtVacinacaoVeterinario.setText("Selecione um veterinario...");
            txtVacinacaoData.setText("");
            txtVacinacaoHora.setText("");
            txtVacinacaoValor.setText("");
            txtVacinacaoGasto.setText("");
            txtVacinacaoVacina.setText("Selecione uma vacina...");
            txtVacinacaoDataProximaDose.setText("");
            Utils.setComponentsEnabled(false, txtVacinacaoTutor, btnVacinacaoPesquisarTutor, txtVacinacaoAnimal, btnVacinacaoPesquisarAnimal, txtVacinacaoVeterinario, btnVacinacaoPesquisarVeterinario, txtVacinacaoData, txtVacinacaoHora, txtVacinacaoValor, txtVacinacaoGasto, txtVacinacaoVacina, btnVacinacaoPesquisarVacina, txtVacinacaoDataProximaDose);
            
        } catch (NumberFormatException e) {
            System.out.println("Erro de entrada");    
            Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
        } catch (DateTimeParseException e) {
            System.out.println("Data ou hora em formato incorreto!");
            Utils.showWarningMessage("Data ou hora em formato incorreto!", "Data ou hora em formato incorreto!");
        }
    }//GEN-LAST:event_btnSalvarVacinacaoActionPerformed

    private void btnNovoVacinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoVacinacaoActionPerformed
        Utils.setComponentsEnabled(false, btnNovoVacinacao);
        Utils.setComponentsEnabled(true, btnSalvarVacinacao, btnCancelarVacinacao);
        Utils.setComponentsEnabled(true, txtVacinacaoTutor, btnVacinacaoPesquisarTutor, txtVacinacaoAnimal, btnVacinacaoPesquisarAnimal, txtVacinacaoVeterinario, btnVacinacaoPesquisarVeterinario, txtVacinacaoData, txtVacinacaoHora, txtVacinacaoValor, txtVacinacaoGasto, txtVacinacaoVacina, btnVacinacaoPesquisarVacina, txtVacinacaoDataProximaDose);
        txtVacinacaoTutor.requestFocus();
    }//GEN-LAST:event_btnNovoVacinacaoActionPerformed

    private void btnCancelarVacinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVacinacaoActionPerformed
        Utils.setComponentsEnabled(true, btnNovoVacinacao);
        Utils.setComponentsEnabled(false, btnAlterarVacinacao, btnExcluirVacinacao, btnSalvarVacinacao, btnCancelarVacinacao);
        txtVacinacaoId.setText("");
        txtVacinacaoTutor.setText("Selecione um tutor...");
        txtVacinacaoAnimal.setText("Selecione um animal...");
        txtVacinacaoVeterinario.setText("Selecione um veterinario...");
        txtVacinacaoData.setText("");
        txtVacinacaoHora.setText("");
        txtVacinacaoValor.setText("");
        txtVacinacaoGasto.setText("");
        txtVacinacaoVacina.setText("Selecione uma vacina...");
        txtVacinacaoDataProximaDose.setText("");
        Utils.setComponentsEnabled(false, txtVacinacaoTutor, btnVacinacaoPesquisarTutor, txtVacinacaoAnimal, btnVacinacaoPesquisarAnimal, txtVacinacaoVeterinario, btnVacinacaoPesquisarVeterinario, txtVacinacaoData, txtVacinacaoHora, txtVacinacaoValor, txtVacinacaoGasto, txtVacinacaoVacina, btnVacinacaoPesquisarVacina, txtVacinacaoDataProximaDose);
    }//GEN-LAST:event_btnCancelarVacinacaoActionPerformed

    private void btnVacinacaoPesquisarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacinacaoPesquisarTutorActionPerformed
        SelecionarTutorDialog dialog = new SelecionarTutorDialog(null, true, tutorController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        tutorSelecionado = dialog.getTutorSelecionado();
        if(tutorSelecionado != null) {
            txtVacinacaoTutor.setText(tutorSelecionado.getNome());
        } else {
            txtVacinacaoTutor.setText("Nenhum Tutor selecionado");
        }
    }//GEN-LAST:event_btnVacinacaoPesquisarTutorActionPerformed

    private void btnVacinacaoPesquisarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacinacaoPesquisarAnimalActionPerformed
        if(tutorSelecionado == null) {
            Utils.showWarningMessage("Erro", "Selecione um tutor");
            return;
        }
        SelecionarAnimalDialog dialog = new SelecionarAnimalDialog(null, true, animalController, tutorController, tutorSelecionado);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        animalSelecionado = dialog.getAnimalSelecionado();
        if(animalSelecionado != null) {
            txtVacinacaoAnimal.setText(animalSelecionado.getNome());
        } else {
            txtVacinacaoAnimal.setText("Nenhum animal selecionado");
        }
    }//GEN-LAST:event_btnVacinacaoPesquisarAnimalActionPerformed

    private void btnVacinacaoPesquisarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacinacaoPesquisarVeterinarioActionPerformed
        SelecionarVeterinarioDialog dialog = new SelecionarVeterinarioDialog(null, true, veterinarioController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        veterinarioSelecionado = dialog.getVeterinarioSelecionado();
        if(veterinarioSelecionado != null) {
            txtVacinacaoVeterinario.setText(veterinarioSelecionado.getNome());
        } else {
            txtVacinacaoVeterinario.setText("Nenhum veterinario selecionado");
        }
    }//GEN-LAST:event_btnVacinacaoPesquisarVeterinarioActionPerformed

    private void tableVacinacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVacinacoesMouseClicked
        if(!txtVacinacaoData.isEnabled()) {
            Utils.setComponentsEnabled(false, btnNovoVacinacao);
            Utils.setComponentsEnabled(true, btnAlterarVacinacao, btnExcluirVacinacao, btnCancelarVacinacao);
            int row = tableVacinacoes.getSelectedRow();
            if(row != -1) {
                Vacinacao vacinacao = ((VacinacaoTableModel)tableVacinacoes.getModel()).getItem(row);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                txtVacinacaoId.setText(String.valueOf(vacinacao.getId()));
                animalSelecionado = animalController.getAnimalById(vacinacao.getAnimalId());
                tutorSelecionado = tutorController.getTutorById(animalSelecionado.getId());
                veterinarioSelecionado = veterinarioController.getVeterinarioById(vacinacao.getVeterinarioId());
                vacinaSelecionada = vacinaController.getVacinaById(vacinacao.getVacinaId());
                txtVacinacaoTutor.setText(tutorSelecionado.getNome());
                txtVacinacaoAnimal.setText(animalSelecionado.getNome());
                txtVacinacaoVeterinario.setText(veterinarioSelecionado.getNome());
                txtVacinacaoData.setText(String.valueOf(vacinacao.getData().format(formatter)));
                txtVacinacaoHora.setText(String.valueOf(vacinacao.getHora()));
                txtVacinacaoValor.setText(String.valueOf(vacinacao.getValor()));
                txtVacinacaoGasto.setText(String.valueOf(vacinacao.getGasto()));
                txtVacinacaoVacina.setText(vacinaController.getVacinaById(vacinacao.getVacinaId()).getNome());
                txtVacinacaoDataProximaDose.setText(String.valueOf(vacinacao.getDataProximaDose().format(formatter)));
            }
        }
    }//GEN-LAST:event_tableVacinacoesMouseClicked

    private void btnVacinacaoPesquisarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacinacaoPesquisarVacinaActionPerformed
        SelecionarVacinaDialog dialog = new SelecionarVacinaDialog(null, true, vacinaController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        vacinaSelecionada = dialog.getVacinaSelecionado();
        if(vacinaSelecionada != null) {
            txtVacinacaoVacina.setText(vacinaSelecionada.getNome());
        } else {
            txtVacinacaoVacina.setText("Nenhuma vacina selecionada");
        }
    }//GEN-LAST:event_btnVacinacaoPesquisarVacinaActionPerformed

    private void btnAlterarVacinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVacinacaoActionPerformed
        Utils.setComponentsEnabled(false, btnNovoVacinacao, btnAlterarVacinacao, btnExcluirVacinacao);                                             
        Utils.setComponentsEnabled(true, btnSalvarVacinacao);
        Utils.setComponentsEnabled(true, txtVacinacaoVeterinario, btnVacinacaoPesquisarVeterinario, txtVacinacaoData, txtVacinacaoHora, txtVacinacaoValor, txtVacinacaoGasto, txtVacinacaoVacina, btnVacinacaoPesquisarVacina, txtVacinacaoDataProximaDose);
    }//GEN-LAST:event_btnAlterarVacinacaoActionPerformed

    private void btnExcluirVacinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVacinacaoActionPerformed
        String idTxt = txtVacinacaoId.getText();
        int id = Integer.parseInt(idTxt);
        Vacinacao vacinacao = vacinacaoController.getVacinacaoById(id);
        vacinacaoController.deleteVacinacao(vacinacao);
        Utils.showSuccessfulMessage();
        txtVacinacaoId.setText("");
        txtVacinacaoTutor.setText("Selecione um tutor...");
        txtVacinacaoAnimal.setText("Selecione um animal...");
        txtVacinacaoVeterinario.setText("Selecione um veterinario...");
        txtVacinacaoData.setText("");
        txtVacinacaoHora.setText("");
        txtVacinacaoValor.setText("");
        txtVacinacaoGasto.setText("");
        txtVacinacaoVacina.setText("Selecione uma vacina...");
        txtVacinacaoDataProximaDose.setText("");
        Utils.setComponentsEnabled(false, txtVacinacaoVeterinario, btnVacinacaoPesquisarVeterinario, txtVacinacaoData, txtVacinacaoHora, txtVacinacaoValor, txtVacinacaoGasto, txtVacinacaoVacina, btnVacinacaoPesquisarVacina, txtVacinacaoDataProximaDose);
        Utils.setComponentsEnabled(true, btnNovoVacinacao);
        Utils.setComponentsEnabled(false, btnAlterarVacinacao, btnExcluirVacinacao, btnCancelarVacinacao, btnSalvarVacinacao);
        updateTable(tableVacinacoes, vacinacaoController.getAllVacinacoes());
    }//GEN-LAST:event_btnExcluirVacinacaoActionPerformed

    private void btnFiltrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarAnimalActionPerformed
        SelecionarAnimalDialog dialog = new SelecionarAnimalDialog(null, true, animalController, tutorController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        filtrarAnimalSelecionado = dialog.getAnimalSelecionado();
        if(filtrarAnimalSelecionado != null) {
            txtFiltrarAnimal.setText(filtrarAnimalSelecionado.getNome());
        } else {
            txtFiltrarAnimal.setText("Nenhum animal selecionado");
        }
    }//GEN-LAST:event_btnFiltrarAnimalActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        Integer animalId = (filtrarAnimalSelecionado != null) ? filtrarAnimalSelecionado.getId() : null;
        Integer veterinarioId = (filtrarVeterinarioSelecionado != null) ? filtrarVeterinarioSelecionado.getId() : null;
        LocalDate dataAPartir = null;
        LocalDate dataAntes = null;

        // Tentativa de conversão dos campos de data
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataInicialText = txtFiltrarDataInicial.getText().trim();
        String dataFinalText = txtFiltrarDataFinal.getText().trim();
        String placeholder = "__/__/____"; // Placeholder da máscara de data

        try {
            if (!dataInicialText.equals(placeholder)) {
                dataAPartir = LocalDate.parse(dataInicialText, dateFormatter);
            }
            if (!dataFinalText.equals(placeholder)) {
                dataAntes = LocalDate.parse(dataFinalText, dateFormatter);
            }
        } catch (DateTimeParseException e) {
            Utils.showWarningMessage("Formato de Data Inválido", "Por favor, insira as datas no formato dd/MM/yyyy.");
            return;
        }

        try {
            // Chama o método de atualização da tabela apenas com os parâmetros válidos
            updateTable(tableVacinacoes, vacinacaoController.filterVacinacoesByAnimalVeterinarioAndData(animalId, veterinarioId, dataAPartir, dataAntes));
        } catch (NullPointerException e) {
            System.out.println("Erro ao filtrar consultas: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnLimparVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparVeterinarioActionPerformed
        filtrarVeterinarioSelecionado = null;
        txtFiltrarVeterinario.setText("Selecione um veterinario...");
    }//GEN-LAST:event_btnLimparVeterinarioActionPerformed

    private void btnLimparAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparAnimalActionPerformed
        filtrarAnimalSelecionado = null;
        txtFiltrarAnimal.setText("Selecione um animal...");
    }//GEN-LAST:event_btnLimparAnimalActionPerformed

    private void btnFiltrarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarVeterinarioActionPerformed
        SelecionarVeterinarioDialog dialog = new SelecionarVeterinarioDialog(null, true, veterinarioController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        filtrarVeterinarioSelecionado = dialog.getVeterinarioSelecionado();
        if(filtrarVeterinarioSelecionado != null) {
            txtFiltrarVeterinario.setText(filtrarVeterinarioSelecionado.getNome());
        } else {
            txtFiltrarVeterinario.setText("Nenhum veterinario selecionado");
        }
    }//GEN-LAST:event_btnFiltrarVeterinarioActionPerformed

    private void btnLimparDataAntesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDataAntesActionPerformed
        txtFiltrarDataFinal.setText("");
    }//GEN-LAST:event_btnLimparDataAntesActionPerformed

    private void btnLimparDataApartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDataApartirActionPerformed
        try {
            txtFiltrarDataInicial.setText("");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLimparDataApartirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.components.UpdateButton btnAlterarVacinacao;
    private view.components.CancelButton btnCancelarVacinacao;
    private view.components.DeleteButton btnExcluirVacinacao;
    private view.components.SearchButton btnFiltrar;
    private view.components.SearchButton btnFiltrarAnimal;
    private view.components.SearchButton btnFiltrarVeterinario;
    private view.components.CancelButton btnLimparAnimal;
    private view.components.CancelButton btnLimparDataAntes;
    private view.components.CancelButton btnLimparDataApartir;
    private view.components.CancelButton btnLimparVeterinario;
    private view.components.NewButton btnNovoVacinacao;
    private view.components.SaveButton btnSalvarVacinacao;
    private view.components.SearchButton btnVacinacaoPesquisarAnimal;
    private view.components.SearchButton btnVacinacaoPesquisarTutor;
    private view.components.SearchButton btnVacinacaoPesquisarVacina;
    private view.components.SearchButton btnVacinacaoPesquisarVeterinario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tableVacinacoes;
    private javax.swing.JTextField txtFiltrarAnimal;
    private javax.swing.JFormattedTextField txtFiltrarDataFinal;
    private javax.swing.JFormattedTextField txtFiltrarDataInicial;
    private javax.swing.JTextField txtFiltrarVeterinario;
    private javax.swing.JTextField txtVacinacaoAnimal;
    private javax.swing.JFormattedTextField txtVacinacaoData;
    private javax.swing.JFormattedTextField txtVacinacaoDataProximaDose;
    private javax.swing.JTextField txtVacinacaoGasto;
    private javax.swing.JFormattedTextField txtVacinacaoHora;
    private javax.swing.JTextField txtVacinacaoId;
    private javax.swing.JTextField txtVacinacaoTutor;
    private javax.swing.JTextField txtVacinacaoVacina;
    private javax.swing.JTextField txtVacinacaoValor;
    private javax.swing.JTextField txtVacinacaoVeterinario;
    // End of variables declaration//GEN-END:variables
}
