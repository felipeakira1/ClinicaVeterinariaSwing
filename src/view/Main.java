/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AnimalController;
import controller.CastracaoController;
import controller.ConsultaGeralController;
import controller.ExameController;
import controller.TutorController;
import controller.VacinaController;
import controller.VacinacaoController;
import controller.VeterinarioController;
import dao.*;
import java.awt.*;
import javax.swing.*;
import view.forms.AnimalForm;
import view.forms.ServicoForm;
import view.forms.TutorForm;
import view.forms.VacinaForm;
import view.forms.VeterinarioForm;

/**
 *
 * @author Felipe
 */
public class Main extends javax.swing.JFrame {
    private TutorController tutorController;
    private AnimalController animalController;
    private VeterinarioController veterinarioController;
    private VacinaController vacinaController;
    private ConsultaGeralController consultaGeralController;
    private ExameController exameController;
    private VacinacaoController vacinacaoController;
    private CastracaoController castracaoController;
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        initControllers();
        TutorForm tutorForm = new TutorForm(tutorController);
        AnimalForm animalForm = new AnimalForm(animalController, tutorController);
        VeterinarioForm veterinarioForm = new VeterinarioForm(veterinarioController);
        VacinaForm vacinaForm = new VacinaForm(vacinaController);
        ServicoForm servicoForm = new ServicoForm(consultaGeralController, exameController, vacinacaoController, castracaoController, animalController, tutorController, veterinarioController, vacinaController);
        panelPrincipal.add(servicoForm, "servicoForm");
        panelPrincipal.add(tutorForm, "tutorForm");
        panelPrincipal.add(animalForm, "animalForm");
        panelPrincipal.add(veterinarioForm, "veterinarioForm");
        panelPrincipal.add(vacinaForm, "vacinaForm");
        sideMenu1.addBotao1ActionListener(e -> {
            CardLayout c1 = (CardLayout)panelPrincipal.getLayout();
            c1.show(panelPrincipal, "servicoForm");
        });
        sideMenu1.addBotao2ActionListener(e -> {
            CardLayout c1 = (CardLayout)panelPrincipal.getLayout();
            c1.show(panelPrincipal, "tutorForm");
        });
        sideMenu1.addBotao3ActionListener(e -> {
            CardLayout c1 = (CardLayout)panelPrincipal.getLayout();
            c1.show(panelPrincipal, "animalForm");
        });
        sideMenu1.addBotao4ActionListener(e -> {
            CardLayout c1 = (CardLayout)panelPrincipal.getLayout();
            c1.show(panelPrincipal, "veterinarioForm");
        });
        sideMenu1.addBotao5ActionListener(e -> {
            CardLayout c1 = (CardLayout)panelPrincipal.getLayout();
            c1.show(panelPrincipal, "vacinaForm");
        });
    }
    
    private void initControllers() {
        ITutorDAO tutorDAO = InMemoryTutorDAO.getInstance();
        tutorController = new TutorController(tutorDAO);
        IAnimalDAO animalDAO = InMemoryAnimalDAO.getInstance();
        animalController = new AnimalController(animalDAO);
        IVeterinarioDAO veterinarioDAO = InMemoryVeterinarioDAO.getInstance();
        veterinarioController = new VeterinarioController(veterinarioDAO);
        IVacinaDAO vacinaDAO = InMemoryVacinaDAO.getInstance();
        vacinaController = new VacinaController(vacinaDAO);
        IConsultaGeralDAO consultaGeralDAO = InMemoryConsultaGeralDAO.getInstance();
        consultaGeralController = new ConsultaGeralController(consultaGeralDAO);
        IVacinacaoDAO vacinacaoDAO = InMemoryVacinacaoDAO.getInstance();
        vacinacaoController = new VacinacaoController(vacinacaoDAO);
        IExameDAO exameDAO = InMemoryExameDAO.getInstance();
        exameController = new ExameController(exameDAO);
        ICastracaoDAO castracaoDAO = InMemoryCastracaoDAO.getInstance();
        castracaoController = new CastracaoController(castracaoDAO);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideMenu1 = new view.components.SideMenu();
        panelPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica Veterinaria");
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 1000));

        panelPrincipal.setLayout(new java.awt.CardLayout());

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sideMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelPrincipal;
    private view.components.SideMenu sideMenu1;
    // End of variables declaration//GEN-END:variables
}
