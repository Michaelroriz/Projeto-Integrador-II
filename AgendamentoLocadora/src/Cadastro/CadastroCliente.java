/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import java.util.Date;




/**
 *
 * @author michael.aroriz
 */
public class CadastroCliente {

    //Atributos
    private String nome;
    private String cpf;
    private Date datanascimento;
    private String sexo;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    //Construtor
    public CadastroCliente(String nome, String cpf, Date datanascimento, String sexo, String endereco, String numero, String complemento, String bairro, String cidade, String uf) {
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

    //Métodos     
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    //Apenas para testes de inserção
    public void imprimirN() {
        System.out.println(nome);
        System.out.println(sexo);
        System.out.println(cidade);
        System.out.println(numero);
        System.out.println(uf);
        System.out.println(bairro);
        System.out.println(cpf);
        System.out.println(complemento);
        System.out.println(endereco);
        System.out.println(datanascimento);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setTime(Date data) {
        this.datanascimento = datanascimento;
        
    }

    public Date getTime() {
        return datanascimento;
    }    
    
    public void setSexo(Object sexo) {
        if (sexo.equals("Masculino")) {
            sexo = "M";
            this.sexo = (String) sexo;
        } else if (sexo.equals("Feminino")) {
            sexo = "F";
            this.sexo = (String) sexo;
        } else {
            sexo = null;
            this.sexo = (String) sexo;
        }
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getUf() {
        return uf;
    }
    
}
