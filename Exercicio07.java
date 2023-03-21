package listaDeExercicios;
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("Informe o primeiro numero: ");
		num1 = scanner.nextInt();
		System.out.print("Informe o segundo numero: ");
		num2 = scanner.nextInt();
		System.out.print("Informe o terceiro numero: ");
		num3 = scanner.nextInt();
		
		if(num1> num2 && num1 > num3) {
			System.out.println("O maior numero eh o "+num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior numero eh o "+num2);
		}else {
			System.out.println("O maior numero eh o "+num3);
		}
		if(num1 < num2 && num1 < num3) {
			System.out.println("O menor numero eh o "+num1);
		}else if (num2 < num1 && num2 <num3) {
			System.out.println("O menor numero eh o "+num2);
		}else if(num3<num1 && num3 < num2) {
			System.out.println("O menor numero eh o "+num3);
		}
		
		
		
	}	

}
