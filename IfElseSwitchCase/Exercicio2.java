package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main (String args[]){
		

		Scanner scan = new Scanner (System.in);

		//http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		// Escreva um programa que pe�a um numero e informe se ele � negativo ou positivo;
		int n=0;
		
		System.out.println("digite um numero");
		n = scan.nextInt();
		
		if(n<0) {
			System.out.println("Numero negativo");
		}else {
			System.out.println("Numero positivo");
		}
	}

}
