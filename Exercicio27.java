package listaDeExercicios;

import java.util.Scanner;

public class Exercicio27 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		int kgMorango, kgMaca, totalKg;
		double precoMorango, precoMaca, totalMaca, totalMorango,valorPagar;
		System.out.println("Informe quantos quilos de morango deseja comprar: ");
		kgMorango = scanner.nextInt();
		System.out.println("Informe quantos quilos de maca deseja comprar: ");
		kgMaca = scanner.nextInt();
		totalKg = kgMaca +kgMorango;
		if(kgMorango <=5) {
			precoMorango = 2.50;
		}else {
			precoMorango = 2.20;
		}if(kgMaca <=5) {
			precoMaca = 1.80;
		}else {
			precoMaca = 1.50;
		}
		totalMorango = kgMorango*precoMorango;
		totalMaca = kgMaca * precoMaca;
		valorPagar = totalMorango + totalMaca;
		if(totalKg >8) {
			valorPagar = valorPagar -(valorPagar*0.1);
			System.out.println("Você recebeu 10% de desconto");
			System.out.println("O total deu R$"+valorPagar);
		}else {
			System.out.println("O total deu R$"+valorPagar);
		}
		
		
	}

}
