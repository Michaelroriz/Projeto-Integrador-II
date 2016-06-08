/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

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

        Vector<AgendamentoDAO> entradas = new Vector<AgendamentoDAO>();

        ResultSet rs;
        
        try {
            acesso.executeUpdate("insert into AGENDAMENTO");
            while (rs.next()) {
                agendamento.setPais(pais);
                agendamento.setCidade(cidade);
                agendamento.setLocal(local);
                agendamento.setDatasaida(datasaida);
                agendamento.setDatasaida(datasaida);
                agendamento.setDataretorno(dataretorno);
                agendamento.setHoraRetorno(horaretorno);
                               
            }
                    
        } catch (SQLException e) {
            Conexao.imprimeErro("Erro de Conexão", msgErro);
        }
    }

}

