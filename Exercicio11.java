/*As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% 
Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento. */


package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		double salario, bonus, novoSalario;
		System.out.print("Informe o seu salario: ");
		salario = scanner.nextDouble();
		System.out.println("Calculando bonificacao....");
		if(salario <= 280) {
			bonus = salario *0.2;
			novoSalario = salario+bonus;
			System.out.println("Seu salario eh R$"+salario);
			System.out.println("Houve um aumento de 20%");
			System.out.println("O valor de bonus foi R$"+bonus);
			System.out.println("Seu novo salario ficou R$"+novoSalario);
		}else if(salario >= 281 && salario <= 700) {
			bonus = salario *0.15;
			novoSalario = salario + bonus;
			System.out.println("Seu salario eh R$"+salario);
			System.out.println("Houve um aumento de 15%");
			System.out.println("O valor de bonus foi R$"+bonus);
			System.out.println("Seu novo salario ficou R$"+novoSalario);
		}else if (salario >= 701 && salario <=1500) {
			bonus = salario *0.1;
			novoSalario = salario + bonus;
			System.out.println("Seu salario eh R$"+salario);
			System.out.println("Houve um aumento de 10%");
			System.out.println("O valor de bonus foi R$"+bonus);
			System.out.println("Seu novo salario ficou R$"+novoSalario);
		}else {
			bonus = salario * 0.05;
			novoSalario = salario + bonus;
			System.out.println("Seu salario eh R$"+salario);
			System.out.println("Houve um aumento de 5%");
			System.out.println("O valor de bonus foi R$"+bonus);
			System.out.println("Seu novo salario ficou R$"+novoSalario);
		}
		
	}

}
