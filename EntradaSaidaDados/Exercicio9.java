package EntradaSaidaDados;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main (String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
		//Faça um programa que pergunte a temperatura em Fahrenheit e converta para Celsius
		//Para converter graus Fahrenheit em graus Celsius, subtraia 32 e divida por 1,8.
		
		Double fahrenheit, celsius;
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Digite a temperatuda em Fahrenheit: ");
		fahrenheit = input.nextDouble();
		
		celsius = ((fahrenheit-32)/1.8);
		
		System.out.println("A temperatura "+ fahrenheit+ " em Fahrenheit é igual a "+ celsius + " em celsius");
		
	}

}
