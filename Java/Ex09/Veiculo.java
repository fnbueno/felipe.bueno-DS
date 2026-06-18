/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Lab02
 */

class Carro extends Veiculo {

    private double cilindrada;

    public Carro(String marca, String modelo, double cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularConsumo() {
        return 15.0 - (cilindrada / 200);
    }

    public double getCilindrada() {
        return cilindrada;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("-------------------------");
    }
}
