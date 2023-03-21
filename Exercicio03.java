//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

package listaDeExercicios;
import java.util.Scanner;

public class Exercicio03 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		char letra;
		System.out.print("Voce eh masculino(M) ou feminino(F): ");
		letra = scanner.next().charAt(0);
		if(letra == 'M'|| letra == 'm' ) {
			System.out.println("Sexo masculino");
		}else if(letra == 'F'|| letra == 'f') {
			System.out.println("Sexo feminino");
		}else {
			System.out.println("Opcao invalida");
		}
	}
}
