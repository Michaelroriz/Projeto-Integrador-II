/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agendamento;

import java.util.Date;

/**
 *
 * @author michael.aroriz
 */
public class AgendamentoLocacao {

    //Atributos
    
    private Date horasaida;
    private Date datasaida;
    private Date dataretorno;
    private Date horaretorno;
    private String pais;
    private String cidade;
    private String local;

    //Construtor
    public AgendamentoLocacao(Date datasaida, Date dataretorno, Date horasaida, Date horaretorno, String pais, String cidade, String local) {
        this.datasaida = datasaida;
        this.dataretorno = dataretorno;
        this.horasaida = horasaida;
        this.horaretorno = horaretorno;
        this.pais = pais;
        this.cidade = cidade;
        this.local = local;
    }

    //Métodos
    
    public Date getDatasaida() {
        return datasaida;
    }

    public void setDatasaida(Date datasaida) {
        this.datasaida = datasaida;
    }

    public Date getDataretorno() {
        return dataretorno;
    }

    public void setDataretorno(Date dataretorno) {
        this.dataretorno = dataretorno;
    }    

    public void setHorasaida(Date horasaida) {
        this.horasaida = horasaida;
    }

    public Date getHoraSaida() {
        return horasaida;
    }

    public void setHoraRetorno(Date horaretorno) {
        this.horaretorno = horaretorno;
    }

    public Date getHoraRetorno() {
        return horaretorno;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }
    //Apenas para testes de inserção
    public void imprimi() {
        System.out.println(datasaida);
        System.out.println(dataretorno);
        //System.out.println(horasaida);
        //System.out.println(horaretorno);
        System.out.println(pais);
        System.out.println(cidade);
        System.out.println(local);
    }
}
