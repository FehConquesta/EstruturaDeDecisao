//Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão).

package listaDeExercicios;
import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.print("Informe um numero inteiro: ");
		numero = scanner.nextInt();
		if(numero%2 == 0) {
			System.out.println("O numero eh par");
		}else {
			System.out.println("O numero eh impar");
		}
		
	}

}
