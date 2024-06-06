package ProjetoA3_BlueWorld.telas;

import java.awt.Color;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ProjetoA3_BlueWorld.bd.ConnectionFactory;
import java.awt.event.ActionListener;

/**
 *
 * @author //Grupo 04\\
 */
public class LoginTela extends javax.swing.JFrame {
    
    private String tipoUsuario;
    private int id_usuario;
    
    public LoginTela() {
        
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Cod para max a tela
        

        // Definir campo de Usuário
        emailTextField.setBackground(new Color(0, 0, 0, 0));
        emailTextField.setBorder(null);
        emailTextField.setOpaque(false);
        
        // Definir campo de Senha
        pword.setBackground(new Color(0, 0, 0, 0));
        pword.setBorder(null);
        pword.setOpaque(false);
        
        // Definir campo de Senha
        Registro.setBackground(new Color(0, 0, 0, 0));
        Registro.setBorder(null);
        Registro.setOpaque(false);
        
}
    
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    
    public int getIdUsuario(){
        return id_usuario;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nver = new javax.swing.JLabel();
        ver = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        Registro = new javax.swing.JToggleButton();
        pword = new javax.swing.JPasswordField();
        EntrarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel Login");
        getContentPane().setLayout(null);

        nver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/escondido.png"))); // NOI18N
        nver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nverMouseClicked(evt);
            }
        });
        getContentPane().add(nver);
        nver.setBounds(840, 380, 40, 70);

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizar.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        getContentPane().add(ver);
        ver.setBounds(840, 390, 30, 50);

        emailTextField.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(emailTextField);
        emailTextField.setBounds(580, 300, 260, 70);

        Registro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        Registro.setForeground(new java.awt.Color(255, 255, 255));
        Registro.setText("Registre-se");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });
        getContentPane().add(Registro);
        Registro.setBounds(501, 528, 410, 40);

        pword.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        pword.setForeground(new java.awt.Color(255, 255, 255));
        pword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwordActionPerformed(evt);
            }
        });
        getContentPane().add(pword);
        pword.setBounds(580, 380, 260, 70);

        EntrarButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        EntrarButton.setForeground(new java.awt.Color(255, 255, 255));
        EntrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logar.png"))); // NOI18N
        EntrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EntrarButton);
        EntrarButton.setBounds(500, 460, 410, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TelaLogin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 1360, 770);

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
    String email = emailTextField.getText();
    String senha = new String(pword.getPassword());
    
    // Conecta-se ao banco de dados
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    try {
        ConnectionFactory factory = new ConnectionFactory();
        conn = factory.conectar(); // Obtém a conexão do ConnectionFactory

        // Consulta para verificar se o e-mail e a senha correspondem a um registro no banco de dados
        String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, email);
        stmt.setString(2, senha);
        rs = stmt.executeQuery();

        // Se houver um registro correspondente, o login é bem-sucedido
        if (rs.next()) {
            tipoUsuario = rs.getString("tipo_usuario");
            id_usuario = rs.getInt("id");
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
            // Exemplo: abrir uma nova janela
            TelaComum janelaPrincipal = new TelaComum(this);
            janelaPrincipal.setVisible(true);
            dispose(); // Fecha a janela de login
        } else {
            // Se não houver registro correspondente, exiba uma mensagem de erro
            JOptionPane.showMessageDialog(this, "E-mail ou senha incorretos. Tente novamente.");
        }
    } catch (Exception e) {
        // Trate quaisquer erros aqui
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados.");
    } finally {
        // Feche os recursos
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_EntrarButtonActionPerformed

    private void pwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwordActionPerformed
        var senha = pword.getPassword();
    }//GEN-LAST:event_pwordActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
            TelaCadastro janelaPrincipal = new TelaCadastro();
            janelaPrincipal.setVisible(true);
            dispose();
    }//GEN-LAST:event_RegistroActionPerformed

        
    
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
    private javax.swing.JButton EntrarButton;
    private javax.swing.JToggleButton Registro;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nver;
    private javax.swing.JPasswordField pword;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables

    
    public void setLoginButtonListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
