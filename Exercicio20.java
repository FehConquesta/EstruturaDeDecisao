/*Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar:
A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
A mensagem "Aprovado com Distinção", se a média for igual a 10.*/

package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		double nota1, nota2, nota3, nota4, media;
		System.out.println("Informe suas quatro notas");
		nota1 = scanner.nextDouble();
		nota2 = scanner.nextDouble();
		nota3 = scanner.nextDouble();
		nota4 = scanner.nextDouble();
		media =(nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Sua media final foi: "+media);
		if(media >= 7 && media <10) {
			System.out.println("Você foi aprovado.");
		}else if(media <7){
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado com Distinção");
		}
		
	}

}
