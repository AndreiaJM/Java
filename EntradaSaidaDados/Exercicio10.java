package EntradaSaidaDados;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
		//Faça um programa que peça a temperatura e graus Celsius e mostre em Fahrenheit 
		
		
		Double celsius, Fahrenheit;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite a tmperatura em graus Celsius: ");
		celsius = input.nextDouble();
		
		Fahrenheit = ((celsius*1.8)+32);
		
		System.out.println("A temperatura "+ celsius + " em graus celsius é igual a "+ Fahrenheit+ " e Fahrenheit");
		
	}

}
