package EntradaSaidaDados;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main (String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
		//Area do quadrado é o valor de um dos lados ao quadrado;
		
		//Faça um programa que calcule a area de um quandrado depois mostre o dobro desta area.
		
		Double lado, area, dobro;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o valor de um dos lados do quadrado: ");
		lado = input.nextDouble();
		
		area = Math.pow(lado, 2);
		dobro = area*2;
		
		System.out.println("O dobro desta area é de: "+ dobro);
		
		
	}

}
