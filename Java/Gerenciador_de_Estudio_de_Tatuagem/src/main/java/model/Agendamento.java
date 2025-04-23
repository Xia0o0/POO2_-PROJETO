/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Thiago
 */
public class Agendamento {
    private String dataHor;
    private String status;
    private int codAgendamento;

    public Agendamento(String dataHor, String status, int codAgendamento) {
        this.dataHor = dataHor;
        this.status = status;
        this.codAgendamento = codAgendamento;
    }

    public String getDataHor() {
        return dataHor;
    }

    public void setDataHor(String dataHor) {
        this.dataHor = dataHor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCodAgendamento() {
        return codAgendamento;
    }

    public void setCodAgendamento(int codAgendamento) {
        this.codAgendamento = codAgendamento;
    }
    
}
