/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agendamento;

import sun.util.calendar.LocalGregorianCalendar;
import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 *
 * @author michael.aroriz
 */
public class AgendamentoLocacao {

    //Atributos
    
    private Date datasaida;
    private Date dataretorno;

    //Construtor
    public AgendamentoLocacao(Date datasaida, Date dataretorno) {
        this.datasaida = datasaida;
        this.dataretorno = dataretorno;
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
}
