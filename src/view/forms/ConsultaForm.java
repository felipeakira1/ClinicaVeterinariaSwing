/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.forms;

import controller.AnimalController;
import controller.ConsultaGeralController;
import controller.TutorController;
import controller.VeterinarioController;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import models.Animal;
import models.ConsultaGeral;
import models.Tutor;
import models.Veterinario;
import tablemodel.AnimalTableModel;
import tablemodel.ConsultaGeralTableModel;
import utils.Utils;
import view.dialogs.SelecionarAnimalDialog;
import view.dialogs.SelecionarTutorDialog;
import view.dialogs.SelecionarVeterinarioDialog;

/**
 *
 * @author Felipe
 */
public class ConsultaForm extends javax.swing.JPanel {
    ConsultaGeralController consultaController;
    AnimalController animalController;
    TutorController tutorController;
    VeterinarioController veterinarioController;
    AnimalTableModel animalTableModel;
    Tutor tutorSelecionado;
    Animal animalSelecionado;
    Veterinario veterinarioSelecionado;
    Animal filtrarAnimalSelecionado;
    Veterinario filtrarVeterinarioSelecionado;
    LocalDate filtrarDataAPartir;
    LocalDate filtrarDataAntes;
    
    public ConsultaForm(ConsultaGeralController consultaController, AnimalController animalController, TutorController tutorController, VeterinarioController veterinarioController) {
        this.consultaController = consultaController;
        this.animalController = animalController;
        this.tutorController = tutorController;
        this.veterinarioController = veterinarioController;
        this.animalTableModel = new AnimalTableModel(animalController.getAllAnimais());
        initComponents();
        initPanel();
    }
    
    private void initPanel() {
        txtConsultaData.setColumns(10);
        Utils.setComponentsEnabled(true, btnNovoConsulta);
        Utils.setComponentsEnabled(true, btnNovoConsulta);
        Utils.setComponentsEnabled(false, btnAlterarConsulta, btnExcluirConsulta, btnSalvarConsulta, btnCancelarConsulta);
        Utils.setComponentsEnabled(false, txtConsultaId, txtConsultaTutor, btnConsultaPesquisarTutor, txtConsultaAnimal, btnConsultaPesquisarAnimal, txtConsultaVeterinario, btnConsultaPesquisarVeterinario, txtConsultaData, txtConsultaHora, txtConsultaValor, txtConsultaGasto, txtConsultaMotivo, txtConsultaDiagnostico, txtConsultaPrescricao);
        txtConsultaTutor.setEditable(false);
        txtConsultaAnimal.setEditable(false);
        txtConsultaVeterinario.setEditable(false);
        updateTable(tableConsultas, consultaController.getAllConsultasGerais());
    }
    
    private void updateTable(JTable table, List<ConsultaGeral> consultas) {
        ConsultaGeralTableModel model = new ConsultaGeralTableModel(consultas, animalController, veterinarioController);
        table.setModel(model);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovoConsulta = new view.components.NewButton();
        btnAlterarConsulta = new view.components.UpdateButton();
        btnExcluirConsulta = new view.components.DeleteButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtConsultaId = new javax.swing.JTextField();
        txtConsultaTutor = new javax.swing.JTextField();
        txtConsultaAnimal = new javax.swing.JTextField();
        txtConsultaVeterinario = new javax.swing.JTextField();
        btnConsultaPesquisarTutor = new view.components.SearchButton();
        btnConsultaPesquisarAnimal = new view.components.SearchButton();
        btnConsultaPesquisarVeterinario = new view.components.SearchButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtConsultaData = new JFormattedTextField(Utils.getDateFormatter());
        ;
        jLabel8 = new javax.swing.JLabel();
        txtConsultaHora = new JFormattedTextField(Utils.getHourFormatter())
        ;
        jLabel9 = new javax.swing.JLabel();
        txtConsultaValor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtConsultaGasto = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtConsultaMotivo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtConsultaDiagnostico = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtConsultaPrescricao = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnCancelarConsulta = new view.components.CancelButton();
        btnSalvarConsulta = new view.components.SaveButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableConsultas = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnFiltrarAnimal = new view.components.SearchButton();
        txtFiltrarDataFinal = new JFormattedTextField(Utils.getDateFormatter());  ;
        jLabel14 = new javax.swing.JLabel();
        btnFiltrar = new view.components.SearchButton();
        txtFiltrarAnimal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnLimparVeterinario = new view.components.CancelButton();
        jLabel17 = new javax.swing.JLabel();
        txtFiltrarDataInicial = new JFormattedTextField(Utils.getDateFormatter());  ;
        txtFiltrarVeterinario = new javax.swing.JTextField();
        btnLimparAnimal = new view.components.CancelButton();
        btnFiltrarVeterinario = new view.components.SearchButton();
        btnLimparDataAntes = new view.components.CancelButton();
        btnLimparDataApartir = new view.components.CancelButton();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 800));

        btnNovoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoConsultaActionPerformed(evt);
            }
        });

        btnAlterarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarConsultaActionPerformed(evt);
            }
        });

        btnExcluirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("ID");

        jLabel2.setText("Tutor");

        jLabel3.setText("Animal");

        jLabel4.setText("Veterinario");

        txtConsultaId.setEnabled(false);

        txtConsultaTutor.setText("Selecione um tutor...");

        txtConsultaAnimal.setText("Selecione um animal...");

        txtConsultaVeterinario.setText("Selecione um veterinario...");

        btnConsultaPesquisarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaPesquisarTutorActionPerformed(evt);
            }
        });

        btnConsultaPesquisarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaPesquisarAnimalActionPerformed(evt);
            }
        });

        btnConsultaPesquisarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaPesquisarVeterinarioActionPerformed(evt);
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
                                .addComponent(txtConsultaTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultaPesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtConsultaId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtConsultaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultaPesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtConsultaVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultaPesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtConsultaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtConsultaTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaPesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtConsultaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaPesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtConsultaVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaPesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
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
                    .addComponent(txtConsultaData, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtConsultaValor))
                .addGap(98, 98, 98)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtConsultaGasto, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(txtConsultaHora))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(txtConsultaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtConsultaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtConsultaValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtConsultaGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel11.setText("Motivo");

        jLabel12.setText("Diagnóstico");

        jLabel13.setText("Prescrições");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(38, 38, 38)
                        .addComponent(txtConsultaMotivo))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtConsultaPrescricao))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConsultaDiagnostico)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtConsultaMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtConsultaDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtConsultaPrescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
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

        btnCancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarConsultaActionPerformed(evt);
            }
        });

        btnSalvarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tableConsultas.setModel(new javax.swing.table.DefaultTableModel(
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
        tableConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableConsultasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableConsultas);

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

        jLabel7.setText("Filtrar por animal");

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
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(139, Short.MAX_VALUE))
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
                                    .addComponent(jLabel7)
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
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Consultas");

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
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarConsultaActionPerformed
        try {
            String idTxt= txtConsultaId.getText();
            String dataTxt = txtConsultaData.getText();
            String horaTxt = txtConsultaHora.getText();
            String valorTxt = txtConsultaValor.getText();
            String gastoTxt = txtConsultaGasto.getText();
            String diagnostico = txtConsultaDiagnostico.getText();
            String prescricoes = txtConsultaPrescricao.getText();
            double valor = Double.parseDouble(valorTxt);
            double gasto = Double.parseDouble(gastoTxt);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalDate data = LocalDate.parse(dataTxt, dateFormatter);
            LocalTime hora = LocalTime.parse(horaTxt, timeFormatter);
            String motivo = txtConsultaMotivo.getText();
            if(motivo.isEmpty() || tutorSelecionado == null || animalSelecionado == null || veterinarioSelecionado == null) {
                Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
                return;
            }
            if(idTxt.isEmpty()) {
                consultaController.createConsultaGeral(data, hora, valor, gasto, animalSelecionado.getId(), veterinarioSelecionado.getId(), motivo, diagnostico, prescricoes);
            } else {
                int id = Integer.parseInt(idTxt);
                ConsultaGeral consultaGeral = consultaController.getConsultaGeralById(id);
                if(consultaGeral != null) {
                    consultaGeral.setData(data);
                    consultaGeral.setHora(hora);
                    consultaGeral.setValor(valor);
                    consultaGeral.setGasto(gasto);
                    consultaGeral.setVeterinarioId(veterinarioSelecionado.getId());
                    consultaGeral.setMotivo(motivo);
                    consultaGeral.setDiagnostico(diagnostico);
                    consultaGeral.setPrescricoes(prescricoes);
                    consultaController.updateConsultaGeral(consultaGeral);
                    Utils.showSuccessfulMessage();
                } else {
                    Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
                }
            }
            updateTable(tableConsultas, consultaController.getAllConsultasGerais());
            Utils.setComponentsEnabled(true, btnNovoConsulta);
            Utils.setComponentsEnabled(false, btnAlterarConsulta, btnExcluirConsulta, btnSalvarConsulta, btnCancelarConsulta);
            txtConsultaId.setText("");
            txtConsultaTutor.setText("Selecione um tutor...");
            txtConsultaAnimal.setText("Selecione um animal...");
            txtConsultaVeterinario.setText("Selecione um veterinario...");
            txtConsultaData.setText("");
            txtConsultaHora.setText("");
            txtConsultaValor.setText("");
            txtConsultaGasto.setText("");
            txtConsultaMotivo.setText("");
            txtConsultaDiagnostico.setText("");
            txtConsultaPrescricao.setText("");
            Utils.setComponentsEnabled(false, txtConsultaTutor, btnConsultaPesquisarTutor, txtConsultaAnimal, btnConsultaPesquisarAnimal, txtConsultaVeterinario, btnConsultaPesquisarVeterinario, txtConsultaData, txtConsultaHora, txtConsultaValor, txtConsultaGasto, txtConsultaMotivo, txtConsultaDiagnostico, txtConsultaPrescricao);
            
        } catch (NumberFormatException e) {
            System.out.println("Erro de entrada");    
            Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
        } catch (DateTimeParseException e) {
            System.out.println("Data ou hora em formato incorreto!");
            Utils.showWarningMessage("Data ou hora em formato incorreto!", "Data ou hora em formato incorreto!");
        }
    }//GEN-LAST:event_btnSalvarConsultaActionPerformed

    private void btnNovoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoConsultaActionPerformed
        Utils.setComponentsEnabled(false, btnNovoConsulta);
        Utils.setComponentsEnabled(true, btnSalvarConsulta, btnCancelarConsulta);
        Utils.setComponentsEnabled(true, txtConsultaTutor, btnConsultaPesquisarTutor, txtConsultaAnimal, btnConsultaPesquisarAnimal, txtConsultaVeterinario, btnConsultaPesquisarVeterinario, txtConsultaData, txtConsultaHora, txtConsultaValor, txtConsultaGasto, txtConsultaMotivo, txtConsultaDiagnostico, txtConsultaPrescricao);
        txtConsultaTutor.requestFocus();
    }//GEN-LAST:event_btnNovoConsultaActionPerformed

    private void btnCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarConsultaActionPerformed
        Utils.setComponentsEnabled(true, btnNovoConsulta);
        Utils.setComponentsEnabled(false, btnAlterarConsulta, btnExcluirConsulta, btnSalvarConsulta, btnCancelarConsulta);
        txtConsultaId.setText("");
        txtConsultaTutor.setText("Selecione um tutor...");
        txtConsultaAnimal.setText("Selecione um animal...");
        txtConsultaVeterinario.setText("Selecione um veterinario...");
        txtConsultaData.setText("");
        txtConsultaHora.setText("");
        txtConsultaValor.setText("");
        txtConsultaGasto.setText("");
        txtConsultaHora.setText("");
        txtConsultaMotivo.setText("");
        txtConsultaDiagnostico.setText("");
        txtConsultaPrescricao.setText("");
        Utils.setComponentsEnabled(false, txtConsultaTutor, btnConsultaPesquisarTutor, txtConsultaAnimal, btnConsultaPesquisarAnimal, txtConsultaVeterinario, btnConsultaPesquisarVeterinario, txtConsultaData, txtConsultaHora, txtConsultaValor, txtConsultaGasto, txtConsultaMotivo, txtConsultaDiagnostico, txtConsultaPrescricao);
    }//GEN-LAST:event_btnCancelarConsultaActionPerformed

    private void btnConsultaPesquisarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaPesquisarTutorActionPerformed
        SelecionarTutorDialog dialog = new SelecionarTutorDialog(null, true, tutorController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        tutorSelecionado = dialog.getTutorSelecionado();
        if(tutorSelecionado != null) {
            txtConsultaTutor.setText(tutorSelecionado.getNome());
        } else {
            txtConsultaTutor.setText("Nenhum Tutor selecionado");
        }
    }//GEN-LAST:event_btnConsultaPesquisarTutorActionPerformed

    private void btnConsultaPesquisarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaPesquisarAnimalActionPerformed
        if(tutorSelecionado == null) {
            Utils.showWarningMessage("Erro", "Selecione um tutor");
            return;
        }
        SelecionarAnimalDialog dialog = new SelecionarAnimalDialog(null, true, animalController, tutorController, tutorSelecionado);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        animalSelecionado = dialog.getAnimalSelecionado();
        if(animalSelecionado != null) {
            txtConsultaAnimal.setText(animalSelecionado.getNome());
        } else {
            txtConsultaAnimal.setText("Nenhum animal selecionado");
        }
    }//GEN-LAST:event_btnConsultaPesquisarAnimalActionPerformed

    private void btnConsultaPesquisarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaPesquisarVeterinarioActionPerformed
        SelecionarVeterinarioDialog dialog = new SelecionarVeterinarioDialog(null, true, veterinarioController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        veterinarioSelecionado = dialog.getVeterinarioSelecionado();
        if(veterinarioSelecionado != null) {
            txtConsultaVeterinario.setText(veterinarioSelecionado.getNome());
        } else {
            txtConsultaVeterinario.setText("Nenhum veterinario selecionado");
        }
    }//GEN-LAST:event_btnConsultaPesquisarVeterinarioActionPerformed

    private void tableConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableConsultasMouseClicked
        if(!txtConsultaData.isEnabled()) {
            Utils.setComponentsEnabled(false, btnNovoConsulta);
            Utils.setComponentsEnabled(true, btnAlterarConsulta, btnExcluirConsulta, btnCancelarConsulta);
            int row = tableConsultas.getSelectedRow();
            if(row != -1) {
                ConsultaGeral consulta = ((ConsultaGeralTableModel)tableConsultas.getModel()).getItem(row);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                txtConsultaId.setText(String.valueOf(consulta.getId()));
                animalSelecionado = animalController.getAnimalById(consulta.getAnimalId());
                tutorSelecionado = tutorController.getTutorById(animalSelecionado.getTutorId());
                veterinarioSelecionado = veterinarioController.getVeterinarioById(consulta.getVeterinarioId());
                txtConsultaTutor.setText(tutorSelecionado.getNome());
                txtConsultaAnimal.setText(animalSelecionado.getNome());
                txtConsultaVeterinario.setText(veterinarioSelecionado.getNome());
                txtConsultaData.setText(String.valueOf(consulta.getData().format(formatter)));
                txtConsultaHora.setText(String.valueOf(consulta.getHora()));
                txtConsultaValor.setText(String.valueOf(consulta.getValor()));
                txtConsultaGasto.setText(String.valueOf(consulta.getGasto()));
                txtConsultaMotivo.setText(consulta.getMotivo());
                txtConsultaDiagnostico.setText(consulta.getDiagnostico());
                txtConsultaPrescricao.setText(consulta.getPrescricoes());
            }
        }
    }//GEN-LAST:event_tableConsultasMouseClicked

    private void btnAlterarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarConsultaActionPerformed
        Utils.setComponentsEnabled(false, btnNovoConsulta, btnAlterarConsulta, btnExcluirConsulta);                                             
        Utils.setComponentsEnabled(true, btnSalvarConsulta);
        Utils.setComponentsEnabled(true, txtConsultaVeterinario, btnConsultaPesquisarVeterinario, txtConsultaData, txtConsultaHora, txtConsultaValor, txtConsultaGasto, txtConsultaMotivo, txtConsultaDiagnostico, txtConsultaPrescricao);
    }//GEN-LAST:event_btnAlterarConsultaActionPerformed

    private void btnExcluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirConsultaActionPerformed
        String idTxt = txtConsultaId.getText();
        int id = Integer.parseInt(idTxt);
        ConsultaGeral consulta = consultaController.getConsultaGeralById(id);
        consultaController.deleteConsultaGeral(consulta);
        Utils.showSuccessfulMessage();
        txtConsultaId.setText("");
        txtConsultaTutor.setText("Selecione um tutor...");
        txtConsultaAnimal.setText("Selecione um animal...");
        txtConsultaVeterinario.setText("Selecione um veterinario...");
        txtConsultaData.setText("");
        txtConsultaHora.setText("");
        txtConsultaValor.setText("");
        txtConsultaGasto.setText("");
        txtConsultaHora.setText("");
        txtConsultaMotivo.setText("");
        txtConsultaDiagnostico.setText("");
        txtConsultaPrescricao.setText("");
        Utils.setComponentsEnabled(false, txtConsultaVeterinario, btnConsultaPesquisarVeterinario, txtConsultaData, txtConsultaHora, txtConsultaValor, txtConsultaGasto, txtConsultaMotivo, txtConsultaDiagnostico, txtConsultaPrescricao);
        Utils.setComponentsEnabled(true, btnNovoConsulta);
        Utils.setComponentsEnabled(false, btnAlterarConsulta, btnExcluirConsulta, btnCancelarConsulta, btnSalvarConsulta);
        updateTable(tableConsultas, consultaController.getAllConsultasGerais());
    }//GEN-LAST:event_btnExcluirConsultaActionPerformed

    private void btnFiltrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarAnimalActionPerformed
        SelecionarAnimalDialog dialog = new SelecionarAnimalDialog(null, true, animalController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        filtrarAnimalSelecionado = dialog.getAnimalSelecionado();
        if(filtrarAnimalSelecionado != null) {
            txtFiltrarAnimal.setText(filtrarAnimalSelecionado.getNome());
        } else {
            txtFiltrarAnimal.setText("Nenhum animal selecionado");
        }
    }//GEN-LAST:event_btnFiltrarAnimalActionPerformed

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
            updateTable(tableConsultas, consultaController.filterConsultasByAnimalVeterinarioAndData(animalId, veterinarioId, dataAPartir, dataAntes));
        } catch (NullPointerException e) {
            System.out.println("Erro ao filtrar consultas: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnLimparAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparAnimalActionPerformed
        filtrarAnimalSelecionado = null;
        txtFiltrarAnimal.setText("Selecione um animal...");
    }//GEN-LAST:event_btnLimparAnimalActionPerformed

    private void btnLimparVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparVeterinarioActionPerformed
        filtrarVeterinarioSelecionado = null;
        txtFiltrarVeterinario.setText("Selecione um veterinario...");
    }//GEN-LAST:event_btnLimparVeterinarioActionPerformed

    private void btnLimparDataApartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDataApartirActionPerformed
        try {
            txtFiltrarDataInicial.setText("");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLimparDataApartirActionPerformed

    private void btnLimparDataAntesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDataAntesActionPerformed
        txtFiltrarDataFinal.setText("");
    }//GEN-LAST:event_btnLimparDataAntesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.components.UpdateButton btnAlterarConsulta;
    private view.components.CancelButton btnCancelarConsulta;
    private view.components.SearchButton btnConsultaPesquisarAnimal;
    private view.components.SearchButton btnConsultaPesquisarTutor;
    private view.components.SearchButton btnConsultaPesquisarVeterinario;
    private view.components.DeleteButton btnExcluirConsulta;
    private view.components.SearchButton btnFiltrar;
    private view.components.SearchButton btnFiltrarAnimal;
    private view.components.SearchButton btnFiltrarVeterinario;
    private view.components.CancelButton btnLimparAnimal;
    private view.components.CancelButton btnLimparDataAntes;
    private view.components.CancelButton btnLimparDataApartir;
    private view.components.CancelButton btnLimparVeterinario;
    private view.components.NewButton btnNovoConsulta;
    private view.components.SaveButton btnSalvarConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTable tableConsultas;
    private javax.swing.JTextField txtConsultaAnimal;
    private javax.swing.JFormattedTextField txtConsultaData;
    private javax.swing.JTextField txtConsultaDiagnostico;
    private javax.swing.JTextField txtConsultaGasto;
    private javax.swing.JFormattedTextField txtConsultaHora;
    private javax.swing.JTextField txtConsultaId;
    private javax.swing.JTextField txtConsultaMotivo;
    private javax.swing.JTextField txtConsultaPrescricao;
    private javax.swing.JTextField txtConsultaTutor;
    private javax.swing.JTextField txtConsultaValor;
    private javax.swing.JTextField txtConsultaVeterinario;
    private javax.swing.JTextField txtFiltrarAnimal;
    private javax.swing.JFormattedTextField txtFiltrarDataFinal;
    private javax.swing.JFormattedTextField txtFiltrarDataInicial;
    private javax.swing.JTextField txtFiltrarVeterinario;
    // End of variables declaration//GEN-END:variables
}
