/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class ClienteDAO {
    
    private Statement acesso;
    
    public void CadastroClientes(Cadastro.CadastroCliente cliente){
        //Realizar conexão ao BD
        Conexao.conectar();
        
        try {
            acesso.executeUpdate("insert into CLIENTE(nome,cpf,datadenascimento,sexo,endereco,complemento,bairro,cidade,uf) VALUES'"+cliente.getNome()+"','" +cliente.getCpf()+"','"+cliente.getData()+"','"+cliente.getSexo()+"','"+cliente.getEndereco()+"','"+cliente.getComplemento()+"','"+cliente.getBairro()+"','"+cliente.getCidade()+"','"+cliente.getUf()+"';'");
            
            cliente.setNome("nome");
            cliente.setSexo(this);
            cliente.setCpf("cpf");
            cliente.setEndereco("endereco");
            cliente.setNumero("numero");
            cliente.setComplemento("complemento");
            cliente.setBairro("bairro");
            cliente.setCidade("cidade");
            cliente.setUf("uf");
            cliente.setComplemento("complemento");
            
            JOptionPane.showInternalConfirmDialog(null, "Deseja incluir o registro?");
            
        } catch (Exception e) {
            
            //JOptionPane.showMessageDialog(, "Erro na inclusão");
        }
        
    }
    
    
    
}
