/*Faça um Programa que peça os 3 lados de um triângulo.
O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes; */

package listaDeExercicios;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		double lado1, lado2, lado3;
		System.out.println("Informe os lados do trangulo:");
		lado1 = scanner.nextDouble();
		lado2 = scanner.nextDouble();
		lado3 = scanner.nextDouble();
		
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.println("Este eh um triangulo equilatero");
		}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Este eh um triangulo isosceles");
		}else {
			System.out.println("Este eh um triangulo escaleno");
		}
		
		
	}
	
	

}
