/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.forms;

import controller.AnimalController;
import controller.ExameController;
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
import models.Exame;
import models.Tutor;
import models.Veterinario;
import tablemodel.ExameTableModel;
import utils.Utils;
import view.dialogs.SelecionarAnimalDialog;
import view.dialogs.SelecionarTutorDialog;
import view.dialogs.SelecionarVeterinarioDialog;

/**
 *
 * @author Felipe
 */
public class ExameForm extends javax.swing.JPanel {
    ExameController exameController;
    AnimalController animalController;
    TutorController tutorController;
    VeterinarioController veterinarioController;
    Tutor tutorSelecionado;
    Animal animalSelecionado;
    Veterinario veterinarioSelecionado;
    Animal filtrarAnimalSelecionado;
    Veterinario filtrarVeterinarioSelecionado;
    
    public ExameForm(ExameController exameController, AnimalController animalController, TutorController tutorController, VeterinarioController veterinarioController) {
        this.exameController = exameController;
        this.animalController = animalController;
        this.tutorController = tutorController;
        this.veterinarioController = veterinarioController;
        initComponents();
        initPanel();
    }
    
    private void initPanel() {
        txtExameData.setColumns(10);
        Utils.setComponentsEnabled(true, btnNovoExame);
        Utils.setComponentsEnabled(true, btnNovoExame);
        Utils.setComponentsEnabled(false, btnAlterarExame, btnExcluirExame, btnSalvarExame, btnCancelarExame);
        Utils.setComponentsEnabled(false, txtExameId, txtExameTutor, btnExamePesquisarTutor, txtExameAnimal, btnExamePesquisarAnimal, txtExameVeterinario, btnExamePesquisarVeterinario, txtExameData, txtExameHora, txtExameValor, txtExameGasto, txtExameTipo, txtExameResultados);
        txtExameTutor.setEditable(false);
        txtExameAnimal.setEditable(false);
        txtExameVeterinario.setEditable(false);
        updateTable(tableExames, exameController.getAllExames());
    }
    
    private void updateTable(JTable table, List<Exame> exames) {
        ExameTableModel model = new ExameTableModel(exames, animalController, veterinarioController);
        table.setModel(model);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovoExame = new view.components.NewButton();
        btnAlterarExame = new view.components.UpdateButton();
        btnExcluirExame = new view.components.DeleteButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtExameId = new javax.swing.JTextField();
        txtExameTutor = new javax.swing.JTextField();
        txtExameAnimal = new javax.swing.JTextField();
        txtExameVeterinario = new javax.swing.JTextField();
        btnExamePesquisarTutor = new view.components.SearchButton();
        btnExamePesquisarAnimal = new view.components.SearchButton();
        btnExamePesquisarVeterinario = new view.components.SearchButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtExameData = new JFormattedTextField(Utils.getDateFormatter());
        ;
        jLabel8 = new javax.swing.JLabel();
        txtExameHora = new JFormattedTextField(Utils.getHourFormatter())
        ;
        jLabel9 = new javax.swing.JLabel();
        txtExameValor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtExameGasto = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtExameResultados = new javax.swing.JTextField();
        txtExameTipo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnCancelarExame = new view.components.CancelButton();
        btnSalvarExame = new view.components.SaveButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableExames = new javax.swing.JTable();
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

        btnNovoExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoExameActionPerformed(evt);
            }
        });

        btnAlterarExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarExameActionPerformed(evt);
            }
        });

        btnExcluirExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirExameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterarExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do exame", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("ID");

        jLabel2.setText("Tutor");

        jLabel3.setText("Animal");

        jLabel4.setText("Veterinario");

        txtExameId.setEnabled(false);

        txtExameTutor.setText("Selecione um tutor...");

        txtExameAnimal.setText("Selecione um animal...");

        txtExameVeterinario.setText("Selecione um veterinario...");

        btnExamePesquisarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamePesquisarTutorActionPerformed(evt);
            }
        });

        btnExamePesquisarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamePesquisarAnimalActionPerformed(evt);
            }
        });

        btnExamePesquisarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamePesquisarVeterinarioActionPerformed(evt);
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
                                .addComponent(txtExameTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExamePesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtExameId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtExameAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExamePesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtExameVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExamePesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtExameId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtExameTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExamePesquisarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtExameAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExamePesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtExameVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExamePesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtExameData, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtExameValor))
                .addGap(98, 98, 98)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtExameGasto, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(txtExameHora))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(txtExameData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtExameHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtExameValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtExameGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel11.setText("Tipo");

        jLabel12.setText("Resultados");

        txtExameTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exame de sangue", "Exame de urina" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtExameResultados)
                    .addComponent(txtExameTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtExameTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtExameResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnCancelarExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarExameActionPerformed(evt);
            }
        });

        btnSalvarExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarExameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar exames", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tableExames.setModel(new javax.swing.table.DefaultTableModel(
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
        tableExames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableExamesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableExames);

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
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Exames");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarExameActionPerformed
        try {
            String idTxt= txtExameId.getText();
            String dataTxt = txtExameData.getText();
            String horaTxt = txtExameHora.getText();
            String valorTxt = txtExameValor.getText();
            String gastoTxt = txtExameGasto.getText();
            String tipo = (String)txtExameTipo.getSelectedItem();
            String resultados = txtExameResultados.getText();
            double valor = Double.parseDouble(valorTxt);
            double gasto = Double.parseDouble(gastoTxt);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalDate data = LocalDate.parse(dataTxt, dateFormatter);
            LocalTime hora = LocalTime.parse(horaTxt, timeFormatter);
            if(tutorSelecionado == null || animalSelecionado == null || veterinarioSelecionado == null) {
                Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
                return;
            }
            if(idTxt.isEmpty()) {
                exameController.createExame(data, hora, valor, gasto, animalSelecionado.getId(), veterinarioSelecionado.getId(), tipo, resultados);
            } else {
                int id = Integer.parseInt(idTxt);
                Exame exame = exameController.getExameById(id);
                if(exame != null) {
                    exame.setData(data);
                    exame.setHora(hora);
                    exame.setValor(valor);
                    exame.setGasto(gasto);
                    exame.setTipoExame(tipo);
                    exame.setResultados(resultados);
                    exameController.updateExame(exame);
                    Utils.showSuccessfulMessage();
                } else {
                    Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
                }
            }
            updateTable(tableExames, exameController.getAllExames());
            Utils.setComponentsEnabled(true, btnNovoExame);
            Utils.setComponentsEnabled(false, btnAlterarExame, btnExcluirExame, btnSalvarExame, btnCancelarExame);
            txtExameId.setText("");
            txtExameTutor.setText("Selecione um tutor...");
            txtExameAnimal.setText("Selecione um animal...");
            txtExameVeterinario.setText("Selecione um veterinario...");
            txtExameData.setText("");
            txtExameHora.setText("");
            txtExameValor.setText("");
            txtExameGasto.setText("");
            txtExameTipo.setSelectedIndex(0);
            txtExameResultados.setText("");
            Utils.setComponentsEnabled(false, txtExameTutor, btnExamePesquisarTutor, txtExameAnimal, btnExamePesquisarAnimal, txtExameVeterinario, btnExamePesquisarVeterinario, txtExameData, txtExameHora, txtExameValor, txtExameGasto, txtExameTipo, txtExameResultados);
            
        } catch (NumberFormatException e) {
            System.out.println("Erro de entrada");    
            Utils.showWarningMessage("Campos obrigatórios", "Por favor, preencha todos os campos obrigatórios");
        } catch (DateTimeParseException e) {
            System.out.println("Data ou hora em formato incorreto!");
            Utils.showWarningMessage("Data ou hora em formato incorreto!", "Data ou hora em formato incorreto!");
        }
    }//GEN-LAST:event_btnSalvarExameActionPerformed

    private void btnNovoExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoExameActionPerformed
        Utils.setComponentsEnabled(false, btnNovoExame);
        Utils.setComponentsEnabled(true, btnSalvarExame, btnCancelarExame);
        Utils.setComponentsEnabled(true, txtExameTutor, btnExamePesquisarTutor, txtExameAnimal, btnExamePesquisarAnimal, txtExameVeterinario, btnExamePesquisarVeterinario, txtExameData, txtExameHora, txtExameValor, txtExameGasto, txtExameTipo, txtExameResultados);
        txtExameTutor.requestFocus();
    }//GEN-LAST:event_btnNovoExameActionPerformed

    private void btnCancelarExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarExameActionPerformed
        Utils.setComponentsEnabled(true, btnNovoExame);
        Utils.setComponentsEnabled(false, btnAlterarExame, btnExcluirExame, btnSalvarExame, btnCancelarExame);
        txtExameId.setText("");
        txtExameTutor.setText("Selecione um tutor...");
        txtExameAnimal.setText("Selecione um animal...");
        txtExameVeterinario.setText("Selecione um veterinario...");
        txtExameData.setText("");
        txtExameHora.setText("");
        txtExameValor.setText("");
        txtExameGasto.setText("");
        txtExameTipo.setSelectedIndex(0);
        txtExameResultados.setText("");
        Utils.setComponentsEnabled(false, txtExameTutor, btnExamePesquisarTutor, txtExameAnimal, btnExamePesquisarAnimal, txtExameVeterinario, btnExamePesquisarVeterinario, txtExameData, txtExameHora, txtExameValor, txtExameGasto, txtExameTipo, txtExameResultados);
    }//GEN-LAST:event_btnCancelarExameActionPerformed

    private void btnExamePesquisarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamePesquisarTutorActionPerformed
        SelecionarTutorDialog dialog = new SelecionarTutorDialog(null, true, tutorController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        tutorSelecionado = dialog.getTutorSelecionado();
        if(tutorSelecionado != null) {
            txtExameTutor.setText(tutorSelecionado.getNome());
        } else {
            txtExameTutor.setText("Nenhum Tutor selecionado");
        }
    }//GEN-LAST:event_btnExamePesquisarTutorActionPerformed

    private void btnExamePesquisarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamePesquisarAnimalActionPerformed
        if(tutorSelecionado == null) {
            Utils.showWarningMessage("Erro", "Selecione um tutor");
            return;
        }
        SelecionarAnimalDialog dialog = new SelecionarAnimalDialog(null, true, animalController, tutorController, tutorSelecionado);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        animalSelecionado = dialog.getAnimalSelecionado();
        if(animalSelecionado != null) {
            txtExameAnimal.setText(animalSelecionado.getNome());
        } else {
            txtExameAnimal.setText("Nenhum animal selecionado");
        }
    }//GEN-LAST:event_btnExamePesquisarAnimalActionPerformed

    private void btnExamePesquisarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamePesquisarVeterinarioActionPerformed
        SelecionarVeterinarioDialog dialog = new SelecionarVeterinarioDialog(null, true, veterinarioController);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        veterinarioSelecionado = dialog.getVeterinarioSelecionado();
        if(veterinarioSelecionado != null) {
            txtExameVeterinario.setText(veterinarioSelecionado.getNome());
        } else {
            txtExameVeterinario.setText("Nenhum veterinario selecionado");
        }
    }//GEN-LAST:event_btnExamePesquisarVeterinarioActionPerformed

    private void tableExamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableExamesMouseClicked
        if(!txtExameData.isEnabled()) {
            Utils.setComponentsEnabled(false, btnNovoExame);
            Utils.setComponentsEnabled(true, btnAlterarExame, btnExcluirExame, btnCancelarExame);
            int row = tableExames.getSelectedRow();
            if(row != -1) {
                Exame exame = ((ExameTableModel)tableExames.getModel()).getItem(row);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                animalSelecionado = animalController.getAnimalById(exame.getAnimalId());
                tutorSelecionado = tutorController.getTutorById(animalSelecionado.getId());
                veterinarioSelecionado = veterinarioController.getVeterinarioById(exame.getVeterinarioId());
                txtExameId.setText(String.valueOf(exame.getId()));
                txtExameTutor.setText(tutorSelecionado.getNome());
                txtExameAnimal.setText(animalSelecionado.getNome());
                txtExameVeterinario.setText(veterinarioSelecionado.getNome());
                txtExameData.setText(String.valueOf(exame.getData().format(formatter)));
                txtExameHora.setText(String.valueOf(exame.getHora()));
                txtExameValor.setText(String.valueOf(exame.getValor()));
                txtExameGasto.setText(String.valueOf(exame.getGasto()));
                txtExameTipo.setSelectedItem(exame.getTipoExame());
                txtExameResultados.setText(exame.getResultados());
            }
        }
    }//GEN-LAST:event_tableExamesMouseClicked

    private void btnAlterarExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarExameActionPerformed
        Utils.setComponentsEnabled(false, btnNovoExame, btnAlterarExame, btnExcluirExame);                                             
        Utils.setComponentsEnabled(true, btnSalvarExame);
        Utils.setComponentsEnabled(true, txtExameVeterinario, btnExamePesquisarVeterinario, txtExameData, txtExameHora, txtExameValor, txtExameGasto, txtExameTipo, txtExameResultados);
    }//GEN-LAST:event_btnAlterarExameActionPerformed

    private void btnExcluirExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirExameActionPerformed
        String idTxt = txtExameId.getText();
        int id = Integer.parseInt(idTxt);
        Exame exame = exameController.getExameById(id);
        exameController.deleteExame(exame);
        Utils.showSuccessfulMessage();
        txtExameId.setText("");
        txtExameTutor.setText("Selecione um tutor...");
        txtExameAnimal.setText("Selecione um animal...");
        txtExameVeterinario.setText("Selecione um veterinario...");
        txtExameData.setText("");
        txtExameHora.setText("");
        txtExameValor.setText("");
        txtExameGasto.setText("");
        txtExameTipo.setSelectedIndex(0);
        txtExameResultados.setText("");
        Utils.setComponentsEnabled(false, txtExameVeterinario, btnExamePesquisarVeterinario, txtExameData, txtExameHora, txtExameValor, txtExameGasto, txtExameTipo, txtExameResultados);
        Utils.setComponentsEnabled(true, btnNovoExame);
        Utils.setComponentsEnabled(false, btnAlterarExame, btnExcluirExame, btnCancelarExame, btnSalvarExame);
        updateTable(tableExames, exameController.getAllExames());
    }//GEN-LAST:event_btnExcluirExameActionPerformed

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
            updateTable(tableExames, exameController.filterExamesByAnimalVeterinarioAndData(animalId, veterinarioId, dataAPartir, dataAntes));
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
    private view.components.UpdateButton btnAlterarExame;
    private view.components.CancelButton btnCancelarExame;
    private view.components.SearchButton btnExamePesquisarAnimal;
    private view.components.SearchButton btnExamePesquisarTutor;
    private view.components.SearchButton btnExamePesquisarVeterinario;
    private view.components.DeleteButton btnExcluirExame;
    private view.components.SearchButton btnFiltrar;
    private view.components.SearchButton btnFiltrarAnimal;
    private view.components.SearchButton btnFiltrarVeterinario;
    private view.components.CancelButton btnLimparAnimal;
    private view.components.CancelButton btnLimparDataAntes;
    private view.components.CancelButton btnLimparDataApartir;
    private view.components.CancelButton btnLimparVeterinario;
    private view.components.NewButton btnNovoExame;
    private view.components.SaveButton btnSalvarExame;
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
    private javax.swing.JTable tableExames;
    private javax.swing.JTextField txtExameAnimal;
    private javax.swing.JFormattedTextField txtExameData;
    private javax.swing.JTextField txtExameGasto;
    private javax.swing.JFormattedTextField txtExameHora;
    private javax.swing.JTextField txtExameId;
    private javax.swing.JTextField txtExameResultados;
    private javax.swing.JComboBox<String> txtExameTipo;
    private javax.swing.JTextField txtExameTutor;
    private javax.swing.JTextField txtExameValor;
    private javax.swing.JTextField txtExameVeterinario;
    private javax.swing.JTextField txtFiltrarAnimal;
    private javax.swing.JFormattedTextField txtFiltrarDataFinal;
    private javax.swing.JFormattedTextField txtFiltrarDataInicial;
    private javax.swing.JTextField txtFiltrarVeterinario;
    // End of variables declaration//GEN-END:variables
}
