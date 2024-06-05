/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoA3_BlueWorld.teste;

/**
 *
 * @author DELL G5
 */
import java.util.Date;
import ProjetoA3_BlueWorld.eventos.EventoMonitoramento;

public class TesteEvento {
    public static void main(String[] args) {

        EventoMonitoramento evento = new EventoMonitoramento();
        evento.setNome("Monitoramento da Qualidade da Água");
        evento.setDescricao("Evento de monitoramento da qualidade da água no rio X");
        evento.setDataInicio(new Date());
        evento.setLocalizacao("Rio X");
        evento.setQualidadeAgua(7.5);
        System.out.println(evento);
    }
}

