/*Faça um Programa que leia um número e exiba o dia correspondente da semana.
 * (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 */

package listaDeExercicios;
import java.util.Scanner;


public class Exercicio13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.print("Informe um numero que irei lhe informar um dia da semana (1-7): ");
		numero = scanner.nextInt();
		if(numero == 1) {
			System.out.println("1-Domingo");
		}else if (numero == 2) {
			System.out.println("2-Segunda");
		}else if(numero == 3) {
			System.out.println("3-Terça");
		}else if (numero == 4) {
			System.out.println("4-Quarta");
		}else if (numero == 5) {
			System.out.println("5-Quinta");
		}else if (numero == 6) {
			System.out.println("6-Sexta");
		}else if (numero == 7) {
			System.out.println("7-Sabado");
		}else {
			System.out.println("Numero invalido");
		}
		
	}
}
