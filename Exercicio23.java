//Faça um Programa que peça um número e informe se o número é positivo ou negativo

package listaDeExercicios;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.print("Informe um numero inteiro: ");
		numero = scanner.nextInt();
		if(numero < 0) {
			System.out.println("O numero é negativo");
		}else {
			System.out.println("O numero é positivo");
		}
	}

}
