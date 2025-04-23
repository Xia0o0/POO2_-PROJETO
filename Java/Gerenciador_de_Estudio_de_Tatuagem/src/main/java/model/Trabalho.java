/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Thiago
 */
public class Trabalho {
    private int codTrabalho;
    private String tipo;
    private String descricao;
    private String dataRealizacao;
    private float valorPago;
    private String situacao;

    public Trabalho(int codTrabalho, String tipo, String descricao, String dataRealizacao, float valorPago, String situacao) {
        this.codTrabalho = codTrabalho;
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataRealizacao = dataRealizacao;
        this.valorPago = valorPago;
        this.situacao = situacao;
    }

    public int getCodTrabalho() {
        return codTrabalho;
    }

    public void setCodTrabalho(int codTrabalho) {
        this.codTrabalho = codTrabalho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(String dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
}
