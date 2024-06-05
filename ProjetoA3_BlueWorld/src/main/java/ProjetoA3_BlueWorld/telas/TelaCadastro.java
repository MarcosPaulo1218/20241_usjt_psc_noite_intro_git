package ProjetoA3_BlueWorld.telas;

/**
 *
 * @author //Grupo 04\\
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ProjetoA3_BlueWorld.bd.UsuarioDAO;
import ProjetoA3_BlueWorld.modelo.Usuario;

public class TelaCadastro extends javax.swing.JFrame {

    private UsuarioDAO usuarioDAO;

    public TelaCadastro() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        usuarioDAO = new UsuarioDAO();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeComplet = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        ConfEmail = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        ConfPass = new javax.swing.JPasswordField();
        CPF = new javax.swing.JTextField();
        CEP = new javax.swing.JTextField();
        Rua = new javax.swing.JTextField();
        Confirmar = new javax.swing.JToggleButton();
        Limpar = new javax.swing.JToggleButton();
        ImgFundoSingup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SingUp");
        getContentPane().setLayout(null);

        NomeComplet.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        NomeComplet.setForeground(new java.awt.Color(255, 255, 255));
        NomeComplet.setText("Nome Completo");
        getContentPane().add(NomeComplet);
        NomeComplet.setBounds(90, 201, 330, 40);

        Email.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("E-mail");
        getContentPane().add(Email);
        Email.setBounds(90, 290, 330, 50);

        ConfEmail.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ConfEmail.setForeground(new java.awt.Color(255, 255, 255));
        ConfEmail.setText("E-mail");
        getContentPane().add(ConfEmail);
        ConfEmail.setBounds(90, 390, 330, 40);

        Pass.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Pass);
        Pass.setBounds(90, 488, 330, 30);

        ConfPass.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ConfPass.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ConfPass);
        ConfPass.setBounds(90, 580, 330, 30);

        CPF.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        CPF.setForeground(new java.awt.Color(255, 255, 255));
        CPF.setText("CPF");
        getContentPane().add(CPF);
        CPF.setBounds(620, 201, 330, 40);

        CEP.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        CEP.setForeground(new java.awt.Color(255, 255, 255));
        CEP.setText("CEP");
        CEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEPActionPerformed(evt);
            }
        });
        getContentPane().add(CEP);
        CEP.setBounds(620, 300, 330, 25);

        Rua.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Rua.setForeground(new java.awt.Color(255, 255, 255));
        Rua.setText("Rua");
        Rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuaActionPerformed(evt);
            }
        });
        getContentPane().add(Rua);
        Rua.setBounds(620, 390, 330, 40);

        Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Confirmar.png"))); // NOI18N
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
            }
        });
        getContentPane().add(Confirmar);
        Confirmar.setBounds(790, 580, 170, 50);

        Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Limpar.png"))); // NOI18N
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        getContentPane().add(Limpar);
        Limpar.setBounds(600, 580, 180, 50);

        ImgFundoSingup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TelaCadastro.png"))); // NOI18N
        ImgFundoSingup.setText("jLabel2");
        getContentPane().add(ImgFundoSingup);
        ImgFundoSingup.setBounds(0, 0, 1360, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RuaActionPerformed

    }//GEN-LAST:event_RuaActionPerformed

    private void CEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEPActionPerformed

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
        String nomeCompleto = NomeComplet.getText();
        String email = Email.getText();
        String senha = new String(Pass.getPassword());
        String cpf = CPF.getText();
        String cep = CEP.getText();
        String rua = Rua.getText();
        int tipo = 1; // Supondo que o tipo seja um valor fixo ou obtido de outra forma

        Usuario u = new Usuario(nomeCompleto, email, senha, cpf, cep, rua, tipo);

        try {
            usuarioDAO.cadastrar(u);
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário: " + e.getMessage());
        }
    
    }//GEN-LAST:event_ConfirmarMouseClicked

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        NomeComplet.setText("");
        Email.setText("");
        ConfEmail.setText("");
        Pass.setText("");
        ConfPass.setText("");
        CPF.setText("");
        CEP.setText("");
        Rua.setText("");
    }//GEN-LAST:event_LimparActionPerformed
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
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEP;
    private javax.swing.JTextField CPF;
    private javax.swing.JTextField ConfEmail;
    private javax.swing.JPasswordField ConfPass;
    private javax.swing.JToggleButton Confirmar;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel ImgFundoSingup;
    private javax.swing.JToggleButton Limpar;
    private javax.swing.JTextField NomeComplet;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Rua;
    // End of variables declaration//GEN-END:variables

}
