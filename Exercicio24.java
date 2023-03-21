package listaDeExercicios;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, result;
		System.out.println("Gostaria de somar(+), subtrair(-) ou multiplicar(*) ?");
		char operacao = scanner.next().charAt(0);		
		System.out.print("Informe o primeiro numero: ");
		num1 = scanner.nextInt();
		System.out.print("Informe o segundo numero: ");
		num2 = scanner.nextInt();
		if(operacao =='+' ) {
			result = num1 + num2;
			System.out.println("O resultado eh: "+result);
			if(result <0) {
				System.out.println("O numero eh negativo");
			}else {
				System.out.println("O numero eh positivo");
			}
			if(result%2 ==0) {
				System.out.println("O numero eh par");
			}else {
				System.out.println("O numero eh impar");
			}
			
		}else if(operacao == '-') {
			result = num1 - num2;
			System.out.println("O resultado eh: "+result);
			if(result <0) {
				System.out.println("O numero eh negativo");
			}else {
				System.out.println("O numero eh positivo");
			}
			if(result%2 ==0) {
				System.out.println("O numero eh par");
			}else {
				System.out.println("O numero eh impar");
			}
			
			
		}else if(operacao == '*') {
			result = num1*num2;
			System.out.println("O resultado eh: "+result);
			if(result <0) {
				System.out.println("O numero eh negativo");
			}else {
				System.out.println("O numero eh positivo");
			}
			if(result%2 ==0) {
				System.out.println("O numero eh par");
			}else {
				System.out.println("O numero eh impar");
			}
		}
	
	}

	
}
