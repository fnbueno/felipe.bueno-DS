/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class Mavenproject1 {
    

    public static void main(String[] args){  
        double nota=0;
        double media = 0;
        int i = 0;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite seu nome:");
       String nome = scanner.nextLine();
       System.out.print("Digite o nome da escola:");
       String escola = scanner.nextLine();
       while (i <6 + i++){
           System.out.print("Digite uma nota:");
           nota = scanner.nextDouble();
           media += nota;
           if (i == 6){
               media /= i;
            System.out.println("O aluno " +nome+ " da escola " +escola+" teve a media: "+media);
               break;
           }
       }
    }
    
}
