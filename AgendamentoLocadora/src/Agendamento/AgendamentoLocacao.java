/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agendamento;

import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;
import sun.util.calendar.LocalGregorianCalendar;
import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 *
 * @author michael.aroriz
 */
public class AgendamentoLocacao {

    //Atributos
    
    private Time horasaida;
    private Date datasaida;
    private Date dataretorno;
    private Date horaretorno;
    private String pais;
    private String cidade;
    private String local;

    //Construtor
    public AgendamentoLocacao(Date datasaida, Date dataretorno, Time horasaida, Date horaretorno, String pais, String cidade, String local) {
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

    public void setDatasaida(Date dataSaida) {
        this.datasaida = datasaida;
    }

    public Date getDataretorno() {
        return dataretorno;
    }

    public void setDataretorno(Date dataRetorno) {
        this.dataretorno = dataretorno;
    }

    //////////////////////////////////////////////////////////////

    public void setHorasaida(Time horaSaida) {
        this.horasaida = horasaida;
    }

    public Time getHoraSaida() {
        return horasaida;
    }

    public void setHoraRetorno(Date horaRetorno) {
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
}
