//Faça um Programa que leia três números e mostre-os em ordem decrescente.

package listaDeExercicios;
import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe tres numeros: ");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		System.out.println("Numeros em ordem decrescente:");
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1);
			if(num2 >= num3) {
				System.out.println(num2);
				System.out.println(num3);
			}else {
				System.out.println(num3);
				System.out.println(num2);
			}
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.println(num2);
			if(num1 >= num3) {
				System.out.println(num1);
				System.out.println(num3);
			}else {
				System.out.println(num3);
				System.out.println(num1);
			}
		}else {
			System.out.println(num3);
			if(num1 >= num2) {
				System.out.println(num1);
				System.out.println(num2);
			}else {
				System.out.println(num2);
				System.out.println(num1);
			}
		}
		
		
		
	}

}
