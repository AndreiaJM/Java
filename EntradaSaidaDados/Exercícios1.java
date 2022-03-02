package EntradaSaidaDados;

import java.util.Scanner;

public class Exercícios1 {
	
	public static void main(String args[]) {
	
	//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
	
	//5) faça um programa que converta metros para centímetros.
		
	int metros, centimetros;
	Scanner input = new Scanner (System.in);
	
	System.out.println("Digite quantos metros deseja converter para centímetros: ");
	metros = input.nextInt();
	
	centimetros = metros*100;
	
	System.out.println(metros + " metro(s) é igual há "+ centimetros + " centrimetros ");
	
	}

}
