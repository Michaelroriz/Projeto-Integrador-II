/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;

/**
 *
 * @author Sergio
 */
public class testeBD {
    
    public static void TestaConexao(){
        
        Connection TesteConexao = ConexaoDB.ConnectDB();
    }
    public static void main(String[] args) {
        
        TestaConexao();
        
        
    
}
}
