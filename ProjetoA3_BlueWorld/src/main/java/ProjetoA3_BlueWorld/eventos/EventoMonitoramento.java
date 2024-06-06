/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoA3_BlueWorld.eventos;

/**
 *
 * @author saulo
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class EventoMonitoramento extends Evento {

    private String localizacao;
    private double qualidadeAgua;

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setQualidadeAgua(double qualidadeAgua) {
        this.qualidadeAgua = qualidadeAgua;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public double getQualidadeAgua() {
        return qualidadeAgua;
    }

    @Override
    public String toString() {
        var sdf = new SimpleDateFormat("dd/MM/yy");
        return String.format(
                "Nome: %s, Descrição: %s, Data Início: %s, Localização: %s, Qualidade da Água: %.2f",
                getNome(), getDescricao(), sdf.format(getDataInicio()), localizacao, qualidadeAgua
        );
    }
}