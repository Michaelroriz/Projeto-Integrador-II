/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



/**
 *
 * @author Sergio
 */
public class ConexaoDB {

    public static Connection connection = null;

    /*
     Conexão do Banco de Dados MySql
     */
    public static Connection ConnectDB() {
        Class.forName("sun.jdbc.odbc.JdbcObdcDriver");
        //Realiza teste de conexão ao Banco de Dados
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql//localhost/DBagendamento","root","1234");

            if (connection != null) {
                JOptionPane.showMessageDialog(null, "Conexão Estabelecida com o Banco de Dados");
            }
            return connection;
            //Retorno de mensagem de erro caso ocorra erro durante a conexão.
        } catch (Exception e) {
            if (connection == null) {
                JOptionPane.showMessageDialog(null, e);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        ConnectDB();
    }

}
