package EntradaSaidaDados;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
		//Faça um programa que pergunte quanto você ganha por hora e o numero de horas trabalhadas no mês
		//Calcule e mostre o total de seu salario referido no mes.
		
		Double salarioHora, salarioMes, horasTrabalhada;
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Digite quanto você ganha por hora: ");
		salarioHora = input.nextDouble();
		System.out.println("Quantas horas você trabalhou este mês? ");
		horasTrabalhada = input.nextDouble();
		
		salarioMes = salarioHora * horasTrabalhada;
		
		System.out.println("Seu salario do mês é de: "+ salarioMes);
		
		
	}

}
