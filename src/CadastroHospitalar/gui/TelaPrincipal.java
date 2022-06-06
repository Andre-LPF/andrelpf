/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CadastroHospitalar.gui;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MedicoGUI
     */
    public TelaPrincipal() {
        initComponents();
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuCadastroMedico = new javax.swing.JMenuItem();
        menuCadastroPaciente = new javax.swing.JMenuItem();
        menuCadastroConsulta = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuSobreSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISTEMA DE CADASTRO HOSPITALAR");
        setResizable(false);

        menuArquivo.setText("ARQUIVO");

        menuCadastroMedico.setText("Cadastro de Médico");
        menuCadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroMedicoActionPerformed(evt);
            }
        });
        menuArquivo.add(menuCadastroMedico);

        menuCadastroPaciente.setText("Cadastro de Paciente");
        menuCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroPacienteActionPerformed(evt);
            }
        });
        menuArquivo.add(menuCadastroPaciente);

        menuCadastroConsulta.setText("Cadastro de Consulta");
        menuCadastroConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroConsultaActionPerformed(evt);
            }
        });
        menuArquivo.add(menuCadastroConsulta);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSair);

        jMenuBar1.add(menuArquivo);

        menuSobre.setText("SOBRE");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });

        menuSobreSistema.setText("Sobre o Sistema");
        menuSobreSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreSistemaActionPerformed(evt);
            }
        });
        menuSobre.add(menuSobreSistema);

        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("SISTEMA DE CADASTRO HOSPITALAR");

        setSize(new java.awt.Dimension(658, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroMedicoActionPerformed
        // TODO add your handling code here:
        MedicoGUI tela = new MedicoGUI();
        tela.show();
    }//GEN-LAST:event_menuCadastroMedicoActionPerformed

    private void menuCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroPacienteActionPerformed
        // TODO add your handling code here:
        PacienteGUI tela = new PacienteGUI();
        tela.show();
    }//GEN-LAST:event_menuCadastroPacienteActionPerformed

    private void menuCadastroConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroConsultaActionPerformed
        // TODO add your handling code here:
        ConsultaGUI tela = new ConsultaGUI();
        tela.show();
    }//GEN-LAST:event_menuCadastroConsultaActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuSobreSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreSistemaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane,"Sistema de Cadastro Hospitalar\ndesenvolvido Por Andrelpf");
    }//GEN-LAST:event_menuSobreSistemaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuCadastroConsulta;
    private javax.swing.JMenuItem menuCadastroMedico;
    private javax.swing.JMenuItem menuCadastroPaciente;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenuItem menuSobreSistema;
    // End of variables declaration//GEN-END:variables
}
