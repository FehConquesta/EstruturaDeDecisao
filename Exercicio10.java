/*Faça um Programa que pergunte em que turno você estuda. 
 * Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
 * Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 */

package listaDeExercicios;
import java.util.Scanner;
public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char turno;
		System.out.print("Em qual turno você estuda, Matutino(M), Vesperino(V) ou Noturno(N) ?");
		turno = scanner.next().charAt(0);
		if(turno =='M'|| turno == 'm') {
			System.out.println("Bom dia!");
		}else if(turno =='V'|| turno =='v') {
			System.out.println("Boa tarde!");
		}else if (turno =='N'|| turno == 'n') {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Resposta invalida");
		}
		
		
	}
}
