/*Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
 *e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
  Média de Aproveitamento  Conceito
  Entre 9.0 e 10.0        A
  Entre 7.5 e 9.0         B
  Entre 6.0 e 7.5         C
  Entre 4.0 e 6.0         D
  Entre 4.0 e zero        E
 */


package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;


public class Exercicio14 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		double nota1, nota2, nota3, nota4, media;
		System.out.print("Informe sua primeira nota: ");
		nota1 = scanner.nextDouble();
		System.out.print("Informe sua segunda nota: ");
		nota2 = scanner.nextDouble();
		System.out.print("Informe sua terceira nota: ");
		nota3 = scanner.nextDouble();
		System.out.print("Informe sua quarta nota: ");
		nota4 = scanner.nextDouble();
		
		media = (nota1+ nota2+ nota3+ nota4)/4;
		
		if(media > 9 && media <=10) {
			System.out.println("Parabens pela sua nota, voce recebeu um A voce foi aprovado com merito ");
		}else if (media > 7.5 && media <=9) {
			System.out.println("Sua nota foi B, voce foi aprovado ");
		}else if (media >6 && media <=7.5) {
			System.out.println("Sua nota foi C, voce foi aprovado ");
		}else if(media > 4 && media <=6) {
			System.out.println("Sua nota foi D, voce foi reprovado");
		}else if(media >0 && media <= 4) {
			System.out.println("Reprovado Nota E");
		}
		
		
		
	}
}
