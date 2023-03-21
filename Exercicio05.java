/*Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez.*/

package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		double nota1, nota2, nota3, nota4, media;
		System.out.print("Informe sua primeira nota: ");
		nota1 =scanner.nextDouble();
		System.out.print("Informe sua segunda nota: ");
		nota2 =scanner.nextDouble();
		System.out.print("Informe sua terceira nota: ");
		nota3 =scanner.nextDouble();
		System.out.print("Informe sua quarta nota: ");
		nota4 =scanner.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		if(media< 7) {
			System.out.println("Sua nota foi "+media+" .Voce foi reprovado");
		}else if(media>= 7 && media <10) {
			System.out.println("Sua nota foi "+media+" .Voce foi aprovado");
		}else {
			System.out.println("Aprovado com honra, media "+media);
		}
		
		
	}

}
