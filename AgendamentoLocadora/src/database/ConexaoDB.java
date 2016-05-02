/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class ConexaoDB {
    
    Connection conn = null;
    
    /*
    Conexão do Banco de Dados SQLite
    */
    
        public static Connection ConnectDB(){
            //C:\Users\Sergio\Documents\NetBeansProjects\Projeto-Integrador-II\AgendamentoLocadora\src\database
            try {
                Class.forName("org.sqlite.JDBC");
                Connection conn =  DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sergio\\Documents\\NetBeansProjects\\Projeto-Integrador-II\\AgendamentoLocadora\\src\\database\\BDagendamento.db");
                JOptionPane.showMessageDialog(null, "Conexão Estabelecida com o Banco de Dados");
                return conn;
            } catch (Exception e) {
                System.out.println("Não foi possível conectar. Erro!!! [ " + e.getMessage() + "]");
                return null;
            }
    
}
    
    
    
}
