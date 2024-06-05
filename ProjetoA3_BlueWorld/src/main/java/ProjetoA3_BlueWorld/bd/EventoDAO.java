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

public class EventoDAO {

    public List<Evento> listar() throws Exception {
        List<Evento> eventos = new ArrayList<>();
        String sql = "SELECT * FROM eventos";

        try (Connection conexao = new ConnectionFactory().conectar();
             PreparedStatement ps = conexao.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Evento evento = new Evento();
                evento.setCodigo(rs.getInt("cod_evento"));
                evento.setNome(rs.getString("nome"));
                evento.setDescricao(rs.getString("descricao"));
                evento.setDataInicio(rs.getDate("data_inicio"));
                evento.setDataFim(rs.getDate("data_fim"));
                eventos.add(evento);
            }
            return eventos;
        }
    }

}