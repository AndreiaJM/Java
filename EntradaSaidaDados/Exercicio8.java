package EntradaSaidaDados;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
		//Fa�a um programa que pergunte quanto voc� ganha por hora e o numero de horas trabalhadas no m�s
		//Calcule e mostre o total de seu salario referido no mes.
		
		Double salarioHora, salarioMes, horasTrabalhada;
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Digite quanto voc� ganha por hora: ");
		salarioHora = input.nextDouble();
		System.out.println("Quantas horas voc� trabalhou este m�s? ");
		horasTrabalhada = input.nextDouble();
		
		salarioMes = salarioHora * horasTrabalhada;
		
		System.out.println("Seu salario do m�s � de: "+ salarioMes);
		
		
	}

}
