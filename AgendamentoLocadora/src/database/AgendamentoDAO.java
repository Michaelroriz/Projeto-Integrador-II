/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author sergio.smarangoni
 */
public class AgendamentoDAO {

    private Statement acesso;
    
    public void Agendamento(Agendamento.AgendamentoLocacao agendamento){
        ConexaoDB.ConnectDB();
        
        try {
            acesso.executeUpdate("insert into Agendamento()'" +agendamento.getPais()+ "','" +agendamento.getCidade()+"','"+agendamento.getLocal()+ "','" +agendamento.getDatasaida()+ "','"+agendamento.getHoraSaida()+ "','" +agendamento.getDataretorno()+ "','"+agendamento.getHoraRetorno()+"';'");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir os dados. Falha no acesso ao Banco de Dados");
        }  
    
}
}

