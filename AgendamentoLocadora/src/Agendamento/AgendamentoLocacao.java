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
    
    private String AGID;
    private String AGCLID;
    private String AGVID;
    private String AGFUNCID;
    private Date AGHRETIRADA;
    private Date AGHDEVOLUCAO;
    
    //construtor
    public AgendamentoLocacao(String AGID, String AGCLID, String AGVID, String AGFUNCID, Date AGHRETIRADA, Date AGHDEVOLUCAO) {
        this.AGID = AGID;
        this.AGCLID = AGCLID;
        this.AGVID = AGVID;
        this.AGFUNCID = AGFUNCID;
        this.AGHRETIRADA = AGHRETIRADA;
        this.AGHDEVOLUCAO = AGHDEVOLUCAO;
    }

      
    
    
}
