/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Cadastro.CadastroCliente;

/**
 *
 * @author sergio
 */
public class ClienteDAO {
    
    private Statement comando;
    
    public void CadastroClientes(Cadastro.CadastroCliente cliente){
        //Realizar conexão ao BD
        Conexao.conectar();        
        
        try {
            comando.executeUpdate("INSERT INTO cliente(nome,cpf,datanascimento,sexo,endereco,numero,complemento,bairro,cidade,uf) values('"
                    +cliente.getNome()+"','"+cliente.getCpf()+"','"+cliente.getData()+"','"+cliente.getSexo()+"','"
                    +cliente.getEndereco()+"','"+cliente.getNumero()+"','"+cliente.getComplemento()+"','"
                    +cliente.getBairro()+"','"+cliente.getCidade()+"','"+cliente.getUf()+"')");
            
            
            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro");
        } finally {
            Conexao.fechar();
        }
            
        
        
    }
    
    
    
}
