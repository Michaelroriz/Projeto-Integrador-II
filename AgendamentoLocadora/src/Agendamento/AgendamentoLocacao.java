/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agendamento;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author michael.aroriz
 */
public class AgendamentoLocacao {

    //Atributos
    private String filial;
    private String cliente;
    private String funcionario;
    private Calendar datasaida;
    private Time horasaida;
    private Calendar dataretorno;
    private Time horaretorno;
    private String observacao; //Banco de dados consta como motivo

    //Criação do construtor
    public AgendamentoLocacao(String filial, String cliente, String funcionario, Calendar datasaida, Time horasaida, Calendar dataretorno, Time horaretorno, String pais, String cidade, String observacao) {
        this.filial = filial;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.datasaida = datasaida;
        this.horasaida = horasaida;
        this.dataretorno = dataretorno;
        this.horaretorno = horaretorno;
        this.observacao = observacao;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public Calendar getDatasaida() {
        return datasaida;
    }

    public void setDatasaida(Calendar datasaida) {
        this.datasaida = datasaida;
    }

    public Time getHorasaida() {
        return horasaida;
    }

    public void setHorasaida(Time horasaida) {
        this.horasaida = horasaida;
    }

    public Calendar getDataretorno() {
        return dataretorno;
    }

    public void setDataretorno(Calendar dataretorno) {
        this.dataretorno = dataretorno;
    }

    public Time getHoraretorno() {
        return horaretorno;
    }

    public void setHoraretorno(Time horaretorno) {
        this.horaretorno = horaretorno;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

      
    

    
}
