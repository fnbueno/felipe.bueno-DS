/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

/**
 *
 * @author Aluno CA
 */
public class Calculadora {
    int numx;
    int numy;
    int soma;
    int subtracao;
    float divisao;
    int multiplicacao;
   public Calculadora(int numx, int numy){
       this.numx = numx;
       this.numy = numy;
       soma = numx + numy;
       subtracao = numx - numy;
       divisao = numx / numy;
       multiplicacao = numx * numy;
   }
    
    public void ImprimirDados(int soma, int subtracao, float divisao, int multiplicacao){
        System.out.println("Soma: "+ this.soma+"\n"
                + "Subtracao:"+ this.subtracao+"\n"
                        + "Divisao: "+this.divisao+"\n"
                                + "Multiplicacao: "+ this.multiplicacao);
    }
}
