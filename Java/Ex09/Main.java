/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Lab02
 */

public class Main {

    public static void main(String[] args) {

       
        Carro carro = new Carro("Toyota", "Corolla", 2000);
        Moto moto = new Moto("Honda", "CB 500", 500);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 3000);

       
        carro.exibirInformacoes();

        moto.exibirInformacoes();

        caminhao.exibirInformacoes();
    }
}