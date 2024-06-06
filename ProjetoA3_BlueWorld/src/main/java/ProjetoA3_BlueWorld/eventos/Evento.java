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

public class Evento {

    private int idUsuario;
    private Date dataOcorrencia;
    private String tipoPoluicao;
    private String nivelPoluicao;
    private String nomeRio;
    private String bairro;
    private String estado;
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public String getTipoPoluicao() {
        return tipoPoluicao;
    }

    public void setTipoPoluicao(String tipoPoluicao) {
        this.tipoPoluicao = tipoPoluicao;
    }

    public String getNivelPoluicao() {
        return nivelPoluicao;
    }

    public void setNivelPoluicao(String nivelPoluicao) {
        this.nivelPoluicao = nivelPoluicao;
    }

    public String getNomeRio() {
        return nomeRio;
    }

    public void setNomeRio(String nomeRio) {
        this.nomeRio = nomeRio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    
        @Override
        public String toString() {
        var sdf = new SimpleDateFormat("dd/MM/yy");
        return String.format(
            "Data Ocorrência: %s, Tipo Poluição: %s, Nível Poluição: %s, Nome Rio: %s, Bairro: %s, Estado: %s",
            sdf.format(dataOcorrencia), tipoPoluicao, nivelPoluicao, nomeRio, bairro, estado
        );
    }
}