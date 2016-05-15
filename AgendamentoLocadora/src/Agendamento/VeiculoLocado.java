/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agendamento;

/**
 *
 * @author michael.aroriz
 */
public class VeiculoLocado {

    //Atributos   

    private String placa;
    private String marca;
    private String modelo;

    //Construtor
    public VeiculoLocado(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
    //Métodos
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

}
