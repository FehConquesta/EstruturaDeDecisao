/*Faça um programa para o cálculo de uma folha de pagamento
Sabendo que os descontos são do Imposto de Renda
que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto,
mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% 
Imprima na tela as informações */


package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio12 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		double valorHora, ir, inss, sindicato,  fgts, salarioBruto, salarioLiquido, descontos;
		int horasTrabalhadas;
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = scanner.nextInt();
		System.out.print("Informe o valor hora: ");
		valorHora = scanner.nextDouble();
		salarioBruto = horasTrabalhadas * valorHora;
		fgts = salarioBruto* 0.11;
		sindicato = salarioBruto * 0.03;
		inss = salarioBruto*0.1;
		if(salarioBruto <= 900) {
			ir = 0;
			descontos = sindicato + inss + ir;
			salarioLiquido = salarioBruto - descontos;
			System.out.println("Salario Bruto ("+horasTrabalhadas+"* R$"+valorHora+"): R$"+salarioBruto);
			System.out.println("(-)IR :ISENTO");
			System.out.println("(-)INSS(10%) :R$"+inss);
			System.out.println("(-)SINDICATO(3%): R$"+sindicato);
			System.out.println("FGTS :R$"+fgts);
			System.out.println("Total de descontos: R$"+descontos);
			System.out.println("Salario Liquido: R$"+salarioLiquido);
		}else if (salarioBruto >= 901 && salarioBruto <= 1500) {
			ir = salarioBruto * 0.05;
			descontos = sindicato + inss + ir;
			salarioLiquido = salarioBruto - descontos;
			System.out.println("Salario Bruto ("+horasTrabalhadas+"* R$"+valorHora+"): R$"+salarioBruto);
			System.out.println("(-)IR(5%) :R$"+ir);
			System.out.println("(-)INSS(10%) :R$"+inss);
			System.out.println("(-)SINDICATO(3%): R$"+sindicato);
			System.out.println("FGTS :R$"+fgts);
			System.out.println("Total de descontos: R$"+descontos);
			System.out.println("Salario Liquido: R$"+salarioLiquido);
		}else if (salarioBruto >= 1501 && salarioBruto <= 2500) {
			ir = salarioBruto * 0.1;
			descontos = sindicato + inss + ir;
			salarioLiquido = salarioBruto - descontos;
			System.out.println("Salario Bruto ("+horasTrabalhadas+"* R$"+valorHora+"): R$"+salarioBruto);
			System.out.println("(-)IR(10%): R$"+ir);
			System.out.println("(-)INSS(10%) :R$"+inss);
			System.out.println("(-)SINDICATO(3%): R$"+sindicato);
			System.out.println("FGTS :R$"+fgts);
			System.out.println("Total de descontos: R$"+descontos);
			System.out.println("Salario Liquido: R$"+salarioLiquido);
		}else {
			ir = salarioBruto *0.2;
			descontos = sindicato + inss + ir;
			salarioLiquido = salarioBruto - descontos;
			System.out.println("Salario Bruto ("+horasTrabalhadas+"* R$"+valorHora+"): R$"+salarioBruto);
			System.out.println("(-)IR(20%): R$"+ir);
			System.out.println("(-)INSS(10%) :R$"+inss);
			System.out.println("(-)SINDICATO(3%): R$"+sindicato);
			System.out.println("FGTS :R$"+fgts);
			System.out.println("Total de descontos: R$"+descontos);
			System.out.println("Salario Liquido: R$"+salarioLiquido);
		}
		
		
	}

}
