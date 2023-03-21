//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

package listaDeExercicios;
import java.util.Locale;
import java.util.Scanner;


public class Exercicio08 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		float preco1, preco2, preco3;
		System.out.print("Informe o valor do primeiro produto: ");
		preco1 = scanner.nextFloat();
		System.out.print("Informe o valor do segundo produto: ");
		preco2 = scanner.nextFloat();
		System.out.print("Informe o valor do terceiro produto: ");
		preco3 = scanner.nextFloat();
		
		if(preco1 < preco2 && preco1 <preco3) {
			System.out.println("Compre o primeiro produto pois eh mais barato ");
		}else if(preco2 <preco1 && preco2 < preco3) {
			System.out.println("Compre o segundo produto pois eh o mais barato");
		}else {
			System.out.println("Compre o terceiro produto, ele eh mais em conta");
		}
	}
}
