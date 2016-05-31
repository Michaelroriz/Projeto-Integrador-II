/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Statement;

/**
 *
 * @author sergio
 */
public class ClienteDAO {
    
    private Statement acesso;
    
    public void CadastroClientes(Cadastro.CadastroCliente cliente){
        //Realizar conexão ao BD
        ConexaoDB.ConnectDB();
        
        try {
            acesso.executeUpdate("insert into CLIENTE(nome,cpf,datadenascimento,sexo,endereco,complemento,bairro,cidade,uf values)'"+cliente.getNome()+"','" +cliente.getCpf()+"','"+cliente.getTime()+"','"+cliente.getSexo()+"','"+cliente.getEndereco()+"','"+cliente.getComplemento()+"','"+cliente.getBairro()+"','"+cliente.getCidade()+"','"+cliente.getUf()+"';'");
        } catch (Exception e) {
        }
        
    }
    
    
    
}
