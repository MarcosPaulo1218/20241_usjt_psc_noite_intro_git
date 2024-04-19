package ProjetoA3_BlueWorld;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author //Grupo 04\\
 */
public class LoginTela extends javax.swing.JFrame {

    
    public LoginTela() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Cod para max a tela
        

        // Definir campo de Usuário
        loginTextField.setBackground(new Color(0, 0, 0, 0));
        loginTextField.setBorder(null);
        loginTextField.setOpaque(false);
        
        // Definir campo de Senha
        pword.setBackground(new Color(0, 0, 0, 0));
        pword.setBorder(null);
        pword.setOpaque(false);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ver = new javax.swing.JLabel();
        nver = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        pword = new javax.swing.JPasswordField();
        PaginaIncial = new javax.swing.JLabel();
        barra = new javax.swing.JLabel();
        SobreNós = new javax.swing.JLabel();
        barra1 = new javax.swing.JLabel();
        ContateNos = new javax.swing.JLabel();
        EntrarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel Login");
        getContentPane().setLayout(null);

        ver.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL G5\\Downloads\\20241_usjt_psc_noite_intro_git-main\\20241_usjt_psc_noite_intro_git-main\\ProjetoA3_BlueWorld\\src\\main\\Imagem\\visualizar.png")); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        getContentPane().add(ver);
        ver.setBounds(980, 510, 30, 40);

        nver.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL G5\\Downloads\\20241_usjt_psc_noite_intro_git-main\\20241_usjt_psc_noite_intro_git-main\\ProjetoA3_BlueWorld\\src\\main\\Imagem\\escondido.png")); // NOI18N
        nver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nverMouseClicked(evt);
            }
        });
        getContentPane().add(nver);
        nver.setBounds(980, 510, 40, 40);

        loginTextField.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        loginTextField.setForeground(new java.awt.Color(255, 255, 255));
        loginTextField.setText("Usuário");
        getContentPane().add(loginTextField);
        loginTextField.setBounds(710, 410, 270, 60);

        pword.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        pword.setForeground(new java.awt.Color(255, 255, 255));
        pword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwordActionPerformed(evt);
            }
        });
        getContentPane().add(pword);
        pword.setBounds(710, 500, 270, 60);

        PaginaIncial.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        PaginaIncial.setForeground(new java.awt.Color(255, 255, 255));
        PaginaIncial.setText("Pagina Inicial");
        PaginaIncial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaginaIncialMouseClicked(evt);
            }
        });
        getContentPane().add(PaginaIncial);
        PaginaIncial.setBounds(1000, 20, 140, 30);

        barra.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        barra.setForeground(new java.awt.Color(255, 255, 255));
        barra.setText("|");
        getContentPane().add(barra);
        barra.setBounds(1150, 10, 20, 50);

        SobreNós.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        SobreNós.setForeground(new java.awt.Color(255, 255, 255));
        SobreNós.setText("Sobre Nós");
        SobreNós.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SobreNósMouseClicked(evt);
            }
        });
        getContentPane().add(SobreNós);
        SobreNós.setBounds(1180, 20, 110, 30);

        barra1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        barra1.setForeground(new java.awt.Color(255, 255, 255));
        barra1.setText("|");
        getContentPane().add(barra1);
        barra1.setBounds(1300, 10, 20, 50);

        ContateNos.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        ContateNos.setForeground(new java.awt.Color(255, 255, 255));
        ContateNos.setText("Contate-nos");
        ContateNos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContateNosMouseClicked(evt);
            }
        });
        getContentPane().add(ContateNos);
        ContateNos.setBounds(1327, 20, 122, 30);

        EntrarButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        EntrarButton.setForeground(new java.awt.Color(255, 255, 255));
        EntrarButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL G5\\Downloads\\20241_usjt_psc_noite_intro_git-main\\20241_usjt_psc_noite_intro_git-main\\ProjetoA3_BlueWorld\\src\\main\\Imagem\\Logar.png")); // NOI18N
        EntrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EntrarButton);
        EntrarButton.setBounds(630, 580, 400, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL G5\\Downloads\\20241_usjt_psc_noite_intro_git-main\\20241_usjt_psc_noite_intro_git-main\\ProjetoA3_BlueWorld\\src\\main\\Imagem\\ImgFundo.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1600, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        ver.setVisible(false);
        nver.setVisible(true);
        pword.setEchoChar((char)0);
    }//GEN-LAST:event_verMouseClicked

    private void nverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nverMouseClicked
        ver.setVisible(true);
        nver.setVisible(false);
        pword.setEchoChar('*');
    }//GEN-LAST:event_nverMouseClicked

    private void EntrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarButtonActionPerformed
        String login = loginTextField.getText();
        String senha = new String(pword.getPassword());
        if(login.equals("admin") && senha.equals("admin")){
            JOptionPane.showMessageDialog(null, "Bem-Vindo, Administrador!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuário/senha inválido");
        }
    }//GEN-LAST:event_EntrarButtonActionPerformed

    private void PaginaIncialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaginaIncialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PaginaIncialMouseClicked

    private void SobreNósMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreNósMouseClicked
        
    }//GEN-LAST:event_SobreNósMouseClicked

    private void ContateNosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContateNosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ContateNosMouseClicked

    private void pwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwordActionPerformed

        
    
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
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContateNos;
    private javax.swing.JButton EntrarButton;
    private javax.swing.JLabel PaginaIncial;
    private javax.swing.JLabel SobreNós;
    private javax.swing.JLabel barra;
    private javax.swing.JLabel barra1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JLabel nver;
    private javax.swing.JPasswordField pword;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables

}
