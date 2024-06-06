/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoA3_BlueWorld.bd;

/**
 *
 * @author saulo
 */

import ProjetoA3_BlueWorld.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public Usuario existe(Usuario u) throws SQLException {
        var sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
        try (var conexao = new ConnectionFactory().conectar();
             var ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getEmail());
            ps.setString(2, u.getSenha());

            try (var rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Recupera os dados do usuário do conjunto de resultados
                    return new Usuario(
                            rs.getString("nome_completo"),
                            rs.getString("email"),
                            rs.getString("senha"),
                            rs.getString("cpf"),
                            rs.getString("cep"),
                            rs.getString("rua"),
                            rs.getString("tipo_usuario")
                    );
                } else {
                    return null;
                }
            }
        }
    }

    public void cadastrar(Usuario u) throws SQLException {
        var sql = "INSERT INTO usuarios (nome_completo, email, senha, cpf, cep, rua, tipo_usuario) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (var conexao = new ConnectionFactory().conectar();
             var ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getNomeCompleto());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getSenha());
            ps.setString(4, u.getCpf());
            ps.setString(5, u.getCep());
            ps.setString(6, u.getRua());
            ps.setString(7, u.getTipo_usuario());
            ps.executeUpdate();
        }
    }
    
    public int getIdUsuario(String email, String senha) throws SQLException {
        var sql = "SELECT id FROM usuarios WHERE email = ? AND senha = ?";
        try (var conexao = new ConnectionFactory().conectar();
             var ps = conexao.prepareStatement(sql)) {
            ps.setString(1, email);
            ps.setString(2, senha);

            try (var rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id");
                } else {
                    return -1; // Retorna -1 se o usuário não for encontrado
                }
            }
        }
    }
    

     public String getTipoUsuario(String email, String senha) throws SQLException {
        var sql = "SELECT tipo_usuario FROM usuarios WHERE email = ? AND senha = ?";
        try (var conexao = new ConnectionFactory().conectar();
             var ps = conexao.prepareStatement(sql)) {
            ps.setString(1, email);
            ps.setString(2, senha);

            try (var rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("tipo_usuario");
                } else {
                    return null; // Retornar null se nenhum usuário for encontrado
                }
            }
        }
    }
}