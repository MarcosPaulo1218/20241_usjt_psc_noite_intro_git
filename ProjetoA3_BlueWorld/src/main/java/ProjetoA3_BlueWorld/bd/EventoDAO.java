/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoA3_BlueWorld.bd;

/**
 *
 * @author saulo
 */
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ProjetoA3_BlueWorld.eventos.Evento;
import java.sql.SQLException;
import ProjetoA3_BlueWorld.telas.LoginTela;


public class EventoDAO {
    
    private LoginTela loginTela;
    
    public EventoDAO(LoginTela loginTela) {
        this.loginTela = loginTela;
    }


    public void setLoginTela(LoginTela loginTela) {
        this.loginTela = loginTela;
    }
    
    public EventoDAO() {
    
    }

    public List<Evento> listar() throws SQLException {
        List<Evento> eventos = new ArrayList<>();
        String sql = "SELECT * FROM evento";

        try (Connection conexao = new ConnectionFactory().conectar();
             PreparedStatement ps = conexao.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Evento evento = new Evento();
                evento.setIdUsuario(loginTela.getIdUsuario());
                evento.setDataOcorrencia(rs.getDate("data_ocorrencia"));
                evento.setTipoPoluicao(rs.getString("tipo_poluicao"));
                evento.setNivelPoluicao(rs.getString("nivel_poluicao"));
                evento.setNomeRio(rs.getString("nome_rio"));
                evento.setBairro(rs.getString("bairro"));
                evento.setEstado(rs.getString("estado"));
                eventos.add(evento);
            }
        }

        return eventos;
    }

    public void cadastrar(Evento evento, int idUsuario) throws SQLException {
        String sql = "INSERT INTO evento (id_usuario, data_ocorrencia, tipo_poluicao, nivel_poluicao, nome_rio, bairro, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conexao = new ConnectionFactory().conectar();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);
            ps.setDate(2, new java.sql.Date(evento.getDataOcorrencia().getTime()));
            ps.setString(3, evento.getTipoPoluicao());
            ps.setString(4, evento.getNivelPoluicao());
            ps.setString(5, evento.getNomeRio());
            ps.setString(6, evento.getBairro());
            ps.setString(7, evento.getEstado());

            ps.executeUpdate();
        }
    }

    public Evento buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM evento WHERE id_evento = ?";
        Evento evento = null;

        try (Connection conexao = new ConnectionFactory().conectar();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    evento = new Evento();
                    evento.setIdUsuario(loginTela.getIdUsuario());
                    evento.setDataOcorrencia(rs.getDate("data_ocorrencia"));
                    evento.setTipoPoluicao(rs.getString("tipo_poluicao"));
                    evento.setNivelPoluicao(rs.getString("nivel_poluicao"));
                    evento.setNomeRio(rs.getString("nome_rio"));
                    evento.setBairro(rs.getString("bairro"));
                    evento.setEstado(rs.getString("estado"));
                }
            }
        }

        return evento;
    }
}