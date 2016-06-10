/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.Clock;
import static java.time.temporal.TemporalQueries.zone;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.objects.Global;
import jdk.nashorn.internal.runtime.UnwarrantedOptimismException;

/**
 *
 * @author sergio.smarangoni
 */
public class AgendamentoDAO {

    //Acesso ao metodo agendamentoDAO
    AgendamentoDAO agendamento = new AgendamentoDAO();

    private Statement acesso;

    public void Agendamento(Agendamento.AgendamentoLocacao agendamento) {

        Conexao.conectar();
        
        //Vector<AgendamentoDAO> entradas = new Vector<AgendamentoDAO>();

        ResultSet rs = null; //Verificar consistencia com inicialização null
        
        try {
            acesso.executeUpdate("insert into AGENDAMENTO" + "");
            while (rs.next()) {
                agendamento.setFilial("filial");
                agendamento.setCliente("cliente");
                agendamento.setDatasaida(Calendar.getInstance());
                //agendamento.setHorasaida(horasaida);
                //agendamento.setDataretorno(Calendar.getInstance());
                //agendamento.setHoraretorno(horaretorno);
            }
                    
        } catch (SQLException e) {
            
            //Conexao.imprimeErro("Erro de Conexão", msgErro);
        }
    }

}

