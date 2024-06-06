/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoA3_BlueWorld;

/**
 *
 * @author DELL G5
 */
import ProjetoA3_BlueWorld.telas.LoginTela;
import javax.swing.JFrame;

    public class App {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            LoginTela loginTela = new LoginTela();
            loginTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginTela.setVisible(true);
        });
    }
}