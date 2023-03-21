//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
package listaDeExercicios;
import java.util.Scanner;

public class Exercicio04 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		char letra;
		System.out.print("Informe uma letra do alfabeto: ");
		letra = scanner.next().charAt(0);
		if(letra == 'A' || letra == 'a'|| letra == 'E'|| letra == 'e'|| letra == 'I'|| letra == 'i'|| letra == 'O'|| letra == 'o'|| letra == 'U'|| letra == 'u') {
			System.out.println("A letra eh uma Vogal");
		}else {
			System.out.println("A letra eh uma consoante");
		}
		
		
		
	}
}
