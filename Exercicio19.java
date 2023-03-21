/*Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16 */

package listaDeExercicios;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int numero, centena, dezena, unidade;
		System.out.print("Informe um numero maior que 0 e menor que 1000: ");
		numero = scanner.nextInt();
		
		if(numero <=999 && numero > 0) {
			centena = numero /100;
			dezena = (numero%100)/10;
			unidade = ((numero%100)%10)/1;
			if(centena == 0) {
				if(dezena == 0) {
					if(unidade == 1) {
						System.out.println(unidade+" unidade.");
					}else if(unidade >=2) {
						System.out.println(unidade+" unidades.");
					}
					
				}else if(dezena == 1) {
					if(unidade == 0) {
						System.out.println(dezena+ " dezena.");
					}else if(unidade == 1) {
						System.out.println(dezena+ " dezena e "+unidade+ " unidade.");
					}else {
						System.out.println(dezena+ " dezena e "+unidade+" unidades");
					}
				}else {
					if(unidade == 0) {
						System.out.println(dezena+" dezenas.");
					}else if(unidade == 1) {
						System.out.println(dezena+" dezenas e "+unidade+ " unidade.");
					}else{
						System.out.println(dezena+" dezenas e "+unidade+ " unidades.");
					}
				}
			}else if(centena == 1) {
				if(dezena == 0) {
					if(unidade==0) {
						System.out.println(centena+" centena.");
					}else if(unidade == 1) {
						System.out.println(centena+" centena e "+unidade+" unidade.");
					}else {
						System.out.println(centena+" centena e "+unidade+" unidades.");
					}
				}else if(dezena == 1) {
					if(unidade == 0) {
						System.out.println(centena+" centena e "+dezena+" dezena.");
					}else if(unidade == 1) {
						System.out.println(centena+" centena, "+dezena+" dezena e "+unidade+" unidade.");
					}else if(unidade >= 2) {
						System.out.println(centena+" centena, "+dezena+" dezena e "+unidade+" unidades.");
					}
				}else {
					if(unidade == 0) {
						System.out.println(centena+" centena e "+dezena+" dezenas.");
					}else if(unidade == 1) {
						System.out.println(centena+" centena, "+dezena+" dezenas e "+unidade+" unidade.");
					}else if(unidade >= 2) {
						System.out.println(centena+" centena, "+dezena+" dezenas e "+unidade+" unidades.");
					}
				}
			}else {
				if(dezena == 0) {
					if(unidade==0) {
						System.out.println(centena+" centenas.");
					}else if(unidade == 1) {
						System.out.println(centena+" centenas e "+unidade+" unidade.");
					}else {
						System.out.println(centena+" centenas e "+unidade+" unidades.");
					}
				}else if(dezena == 1) {
					if(unidade == 0) {
						System.out.println(centena+" centenas e "+dezena+" dezena.");
					}else if(unidade == 1) {
						System.out.println(centena+" centenas, "+dezena+" dezena e "+unidade+" unidade.");
					}else if(unidade >= 2) {
						System.out.println(centena+" centenas, "+dezena+" dezena e "+unidade+" unidades.");
					}
				}else {
					if(unidade == 0) {
						System.out.println(centena+" centenas e "+dezena+" dezenas.");
					}else if(unidade == 1) {
						System.out.println(centena+" centenas, "+dezena+" dezenas e "+unidade+" unidade.");
					}else if(unidade >= 2) {
						System.out.println(centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades.");
					}
				}
			}
		}
	}
}
					