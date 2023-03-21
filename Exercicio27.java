/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
                      Até 5 Kg           Acima de 5 Kg
Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
receberá ainda um desconto de 10% sobre este total. 
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.*/


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
