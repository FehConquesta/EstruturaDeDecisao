/*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".*/


package listaDeExercicios;
import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iremos fazer 5 perguntas para determinar o assassino...");
		System.out.println("Responda S para sim ou N para nao");
		char resposta;
		int cont = 0;
		System.out.println("Telefonou para a vitima ? ");
		resposta = scanner.next().charAt(0);
		if(resposta == 'S') {
			cont ++;
		}
		System.out.println("Esteve no local do crime ?");
		resposta = scanner.next().charAt(0);
		if(resposta == 'S') {
			cont ++;
		}
		System.out.println("Mora perto da vitima ?");
		resposta = scanner.next().charAt(0);
		if(resposta == 'S') {
			cont ++;
		}
		System.out.println("Devia para a vitima ? ");
		resposta = scanner.next().charAt(0);
		if(resposta == 'S') {
			cont ++;
		}
		System.out.println("Ja trabalhou com a vitima ? ");
		resposta = scanner.next().charAt(0);
		if(resposta == 'S') {
			cont ++;
		}
		System.out.println("");
		if(cont == 2) {
			System.out.println("Voce eh suspeito");
		}else if(cont ==3 || cont ==4) {
			System.out.println("Voce eh cumplice do assassinato");
		}else if(cont == 5) {
			System.out.println("Voce eh o assassino");
		}else {
			System.out.println("Voce eh inocente");
		}
		
}
}