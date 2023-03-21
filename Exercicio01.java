//Faça um Programa que peça dois números e imprima o maior deles.
package listaDeExercicios;
import java.util.Scanner;

public class Exercicio01 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Informe um numero inteiro: ");
		num1 = scanner.nextInt();
		System.out.print("Informe outro numero inteiro: ");
		num2 = scanner.nextInt();
		
		if(num1 > num2) {
			System.out.println("O numero "+num1+" eh o maior");
			
		}else if (num1 < num2) {
			System.out.println("O numero "+num2+" eh o maior");
	
		}else {
			System.out.println("Os numeros sao iguais");
		}
		
	}

}
