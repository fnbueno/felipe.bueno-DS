/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class Ex04 {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int Soma, Multiplicacao, Subtracao, Divisao, c = 0;
        double [] historico = new double [10];
        
        while (c<historico.length){
            System.out.print("Digite um numero: ");
            int a = scanner.nextInt();
        
            System.out.print("Digite outro numero: ");
            int b = scanner.nextInt();
        
            Soma = a + b;
            Subtracao = a - b;
            Multiplicacao = a * b;
            Divisao = a / b;
        
            System.out.print("Escolha uma operação \n"
                    + "[0] soma\n"
                    + "[1] subtracao \n"
                    + "[2] multiplicacao \n"
                    + "[3] divisao: ");
            int escolha = scanner.nextInt();
            if (escolha ==0){
                System.out.println("O resultado da operação escolhida é: "+ Soma+" e a operação escolhida é Soma");
                historico[c] = Soma;
        }
            if (escolha ==1){
                System.out.println("O resultado da operação escolhida é: "+ Subtracao+" e a operação escolhida é Subtracao");
                historico[c] = Subtracao;
        }
            if (escolha ==2){
                System.out.println("O resultado da operação escolhida é: "+ Multiplicacao+" e a operação escolhida é Multiplicacao");
                historico[c] = Multiplicacao;
        }
            if (escolha ==3){
                System.out.println("O resultado da operação escolhida é: "+ Divisao+" e a operação escolhida é Divisao");
                historico[c] = Divisao;
        }
            c++;
        }
        c = 0;
        while (c<historico.length){
            System.out.println(historico[c]);
            c++;
        }
    }
}
