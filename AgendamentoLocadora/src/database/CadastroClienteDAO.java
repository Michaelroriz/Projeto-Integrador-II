/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Cadastro.CadastroCliente;
import static database.Conexao.con;

import gui.MenuPrincipal;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class CadastroClienteDAO {            
    
    
    public void CadastroClientes(CadastroCliente cliente){
        //Realizar conexão ao BD
        Conexao.conectar();
            String sql = "insert into CLIENTE (nome,cpf,datanascimento,sexo,endereco,complemento,bairro,cidade,uf) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setDate(3, (Date) cliente.getData());
            stmt.setString(4, cliente.getSexo());
            stmt.setString(5, cliente.getEndereco());
            stmt.setString(6, cliente.getComplemento());
            stmt.setString(7, cliente.getBairro());
            stmt.setString(8, cliente.getCidade());
            stmt.setString(9, cliente.getUf());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "ClienteInserido com sucesso");
            //JOptionPane.showInternalConfirmDialog(null, "Deseja incluir o registro?");
            
        } catch (Exception e) {
           
            JOptionPane.showMessageDialog(null, "Erro na inclusão");
        }
            
    }
    
    
    
}
