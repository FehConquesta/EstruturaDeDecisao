package listaDeExercicios;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ano;
		System.out.println("Informe um ano, que verificarei se eh bissexto: ");
		ano = scanner.nextInt();
		if( ano%400==0 && ano%4==0 || ano%100!=0) {
			System.out.println("bissexto");
		}else {
			System.out.println("nao bissexto");
		}
	}

}
