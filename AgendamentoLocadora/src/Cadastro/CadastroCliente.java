/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import sun.util.calendar.LocalGregorianCalendar;



/**
 *
 * @author michael.aroriz
 */
public class CadastroCliente {
    
    private String CLNOME;
    private String CLCPF;
    private LocalGregorianCalendar.Date CLDTNASCIMENTO;
    private char CLSEXO;
    private String CLENDERECO;
    private String CLNUMERO;
    private String CLCOMPLEMENTO;
    private String CLBAIRRO;
    private String CLCIDADE;
    private String CLUF;
    
    //Construtor
    public CadastroCliente(String CLNOME, String CLCPF, LocalGregorianCalendar.Date CLDTNASCIMENTO, char CLSEXO, String CLENDERECO, String CLNUMERO, String CLCOMPLEMENTO, String CLBAIRRO, String CLCIDADE, String CLUF) {
        this.CLNOME = CLNOME;
        this.CLCPF = CLCPF;
        this.CLDTNASCIMENTO = CLDTNASCIMENTO;
        this.CLSEXO = CLSEXO;
        this.CLENDERECO = CLENDERECO;
        this.CLNUMERO = CLNUMERO;
        this.CLCOMPLEMENTO = CLCOMPLEMENTO;
        this.CLBAIRRO = CLBAIRRO;
        this.CLCIDADE = CLCIDADE;
        this.CLUF = CLUF;
    }
    
    
    
    
    
}
