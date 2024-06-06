/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjetoA3_BlueWorld.telas;

/**
 *
 * @author saulo
 */

import java.awt.Color;

public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        
        // Definir campo Nome Rio
        NomeRio.setBackground(new Color(0, 0, 0, 0));
        NomeRio.setBorder(null);
        NomeRio.setOpaque(false);
        
        // Definir campo Nivel Poluição
        NivelPoluicao.setBackground(new Color(0, 0, 0, 0));
        NivelPoluicao.setBorder(null);
        NivelPoluicao.setOpaque(false);
        
        // Definir campo Tipo de Poluição
        TipoPoluicao.setBackground(new Color(0, 0, 0, 0));
        TipoPoluicao.setBorder(null);
        TipoPoluicao.setOpaque(false);
        
        // Definir campo Data de ocorrência
        DataOcorrencia.setBackground(new Color(0, 0, 0, 0));
        DataOcorrencia.setBorder(null);
        DataOcorrencia.setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeRio = new javax.swing.JTextField();
        NivelPoluicao = new javax.swing.JTextField();
        TipoPoluicao = new javax.swing.JTextField();
        DataOcorrencia = new javax.swing.JTextField();
        Confirmar = new javax.swing.JToggleButton();
        Voltar = new javax.swing.JToggleButton();
        Limpar = new javax.swing.JToggleButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        NomeRio.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        NomeRio.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NomeRio);
        NomeRio.setBounds(120, 220, 390, 70);

        NivelPoluicao.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        NivelPoluicao.setForeground(new java.awt.Color(255, 255, 255));
        NivelPoluicao.setToolTipText("");
        getContentPane().add(NivelPoluicao);
        NivelPoluicao.setBounds(120, 340, 390, 60);

        TipoPoluicao.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        TipoPoluicao.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TipoPoluicao);
        TipoPoluicao.setBounds(120, 450, 390, 60);

        DataOcorrencia.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        DataOcorrencia.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DataOcorrencia);
        DataOcorrencia.setBounds(120, 560, 390, 60);

        Confirmar.setText("Confirmar");
        getContentPane().add(Confirmar);
        Confirmar.setBounds(470, 680, 83, 28);

        Voltar.setText("Voltar");
        getContentPane().add(Voltar);
        Voltar.setBounds(390, 680, 59, 28);

        Limpar.setText("Limpar");
        getContentPane().add(Limpar);
        Limpar.setBounds(310, 680, 67, 28);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TelaCadastroRio.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 1360, 768);

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Confirmar;
    private javax.swing.JTextField DataOcorrencia;
    private javax.swing.JLabel Fundo;
    private javax.swing.JToggleButton Limpar;
    private javax.swing.JTextField NivelPoluicao;
    private javax.swing.JTextField NomeRio;
    private javax.swing.JTextField TipoPoluicao;
    private javax.swing.JToggleButton Voltar;
    // End of variables declaration//GEN-END:variables
}