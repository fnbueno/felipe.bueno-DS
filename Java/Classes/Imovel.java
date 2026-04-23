/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Lab02 - Micro09
 */
public class Imovel {
    private int idimovel;
    private String endereco;
    private double valor;
    public Imovel(int idimovel, String endereco, double valor){
        this.idimovel = idimovel;
        this.endereco = endereco;
        this.valor = valor;
    }
    public void getInfo(){
        System.out.println("ID: "+idimovel+"\n"
                + "Endereço: "+ endereco+"\n"
                        + "Valor: "+ valor);
    }
}
