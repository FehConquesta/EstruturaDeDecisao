package listaDeExercicios;

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double gas = 2.50;
		double alc = 1.90;
		char tipo;
		int litros;
		double total, totalDesc, desc;
		
		System.out.print("Informe oq deseja abastecer, A para Alcool ou G para gasolina ? ");
		tipo = scanner.next().charAt(0);
		System.out.println("Informe a quantidade de litros que deseja abastecer: ");
		litros = scanner.nextInt();
		if(tipo == 'g' || tipo == 'G') {
			if(litros <=20) {
				total = litros*gas;
				desc = total * 0.04;
				System.out.println("Voce abasteceu "+litros+ " litros de gasolina, houve o desconto de R$"+desc);
				totalDesc = total - desc;
				System.out.println("Total sem descontos, R$"+total);
				System.out.println("Total a pagar, R$"+totalDesc);
			}else if(litros >21) {
				total = litros * gas;
				desc = total * 0.06;
				totalDesc = total - desc;
				System.out.println("Voce abasteceu "+litros+ " litros de gasolina, houve o desconto de R$"+desc);
				System.out.println("Total sem descontos, R$"+total);
				System.out.println("Total a pagar, R$"+totalDesc);
			}
		}
		else if(tipo == 'A' || tipo == 'a') {
			if(litros <=20) {
				total = litros * alc;
				desc = total * 0.03;
				totalDesc = total - desc;
				System.out.println("Voce abasteceu "+litros+ " litros de alcool, houve o desconto de R$"+total*0.03);
				System.out.println("Total sem descontos, R$"+total);
				System.out.println("Total a pagar, R$"+totalDesc);
			}else if(litros >21) {
				total = litros * alc;
				desc = total * 0.05;
				totalDesc = total - desc;
				System.out.println("Voce abasteceu "+litros+ " litros de alcool, houve o desconto de R$"+total*0.05);
				System.out.println("Total sem descontos, R$"+total);
				System.out.println("Total a pagar, R$"+totalDesc);
			}
		}
							
	}
}
