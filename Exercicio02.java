//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

package listaDeExercicios;
import java.util.Scanner;

public class Exercicio02 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("Informe um numero: ");
		num = scanner.nextInt();
		
		if(num < 0) {
			System.out.println("O numero informado eh negativo");
		}else if (num == 0) {
			System.out.println("O numero informado eh o zero");
		}else {
			System.out.println("O numero informado eh positivo");
		}
						
	}
}
