/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Lab02
 */

class Caminhao extends Veiculo {

    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, double capacidadeCarga) {
        super(marca, modelo);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularConsumo() {
        return 5.0 - (capacidadeCarga / 1000.0);
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " kg");
        System.out.println("-------------------------");
    }
}
