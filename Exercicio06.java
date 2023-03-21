//Faça um Programa que leia três números e mostre o maior deles.


package listaDeExercicios;
import java.util.Scanner;


public class Exercicio06 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("Informe o primeiro numero: ");
		num1 = scanner.nextInt();
		System.out.print("Informe o segundo numero: ");
		num2 = scanner.nextInt();
		System.out.print("Informe o terceiro numero: ");
		num3 = scanner.nextInt();
		
		if(num1> num2 && num1 > num3) {
			System.out.println("O maior numero eh o "+num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior numero eh o "+num2);
		}else {
			System.out.println("O maior numero eh o "+num3);
		}
		
		
	}
}
