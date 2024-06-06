/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoA3_BlueWorld.modelo;

/**
 *
 * @author DELL G5
 */
public class Rio {
    private String nomeRio;
    private String estado;
    private String bairro;

    // Construtor
    public Rio(String nomeRio, String estado, String bairro) {
        this.nomeRio = nomeRio;
        this.estado = estado;
        this.bairro = bairro;
    }

    // Getters e Setters
    public String getNomeRio() {
        return nomeRio;
    }

    public void setNomeRio(String nomeRio) {
        this.nomeRio = nomeRio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
