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

public class UsuarioDAO {

    public Usuario existe(Usuario u) throws Exception {
        var sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
        var conexao = new ConnectionFactory().conectar();

        try (var ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getEmail());
            ps.setString(2, u.getSenha());

            try (var rs = ps.executeQuery()) {
                if (rs.next()) {
                    return u;
                } else {
                    return null;
                }
            }
        }
    }

    public void cadastrar(Usuario u) throws Exception {
        var sql = "INSERT INTO usuarios (nome_completo, email, senha, cpf, cep, rua, tipo_usuario) VALUES (?, ?, ?, ?, ?, ?, ?)";
        var conexao = new ConnectionFactory().conectar();

        try (var ps = conexao.prepareStatement(sql)) {
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
}