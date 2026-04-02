/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Writhttps://www.onlinegdb.com/online_java_compiler#editor_1e your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;


public class Ex03

{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
		String [] num = new String[10];
		
		
		String nome;
		int i = 0;
        while (i < 10){
            System.out.print("Digite um nome: ");
            nome = scanner.nextLine();
            num[i] = nome;
            i++;
        }
        i = 0;
        while (i<10){
            System.out.println(num[i]);
            i++;
        }
	}
}