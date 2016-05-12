/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import sun.util.calendar.LocalGregorianCalendar.Date;



/**
 *
 * @author michael.aroriz
 */
public class CadastroCliente {
    
    private String nome;
    private String cpf;
    private Date datanascimento;
    private char sexo;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    
    //Construtor

    public CadastroCliente(String nome, String cpf, Date datanascimento, char sexo, String endereco, String numero, String complemento, String bairro, String cidade, String uf) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.sexo = sexo;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }    
    
    
    
    
    
}
