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

    public static Connection conn = null;

    /*
     Conexão do Banco de Dados SQLite
     */
    public static Connection ConnectDB() {            

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://dbagendamento.c9kfohd9zyjr.us-east-1.rds.amazonaws.com:3306", "sergiomarangoni", "pi403465");
            if (conn != null) {
                JOptionPane.showMessageDialog(null, "Conexão Estabelecida com o Banco de Dados");
            }
            return conn;
        } catch (Exception e) {
            if (conn == null) {
                JOptionPane.showMessageDialog(null, e);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        ConnectDB();
    }

}
