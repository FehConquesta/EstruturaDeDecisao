//Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.

package listaDeExercicios;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Irei de perguntar uma data, comece falando o dia(dd), apos o mes(mm) e o ano(aaaa)");
		int dia, mes, ano;
		dia = scanner.nextInt();
		mes = scanner.nextInt();
		ano = scanner.nextInt();
		
		if(dia > 0 && dia <= 31) {
			if(mes >0 && mes <=12) {
				if(ano > 0) {
					System.out.println("A data informada foi "+dia+"/"+mes+"/"+ano);
				}else {
					System.out.println("Data invalida");
				}
			}else {
				System.out.println("Data invalida");
			}
			}
		else {
			System.out.println("Data invalida");
		}
	}
}
