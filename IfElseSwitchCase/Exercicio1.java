package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String args[]){

		//http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		//Escreva um programa que capture 2 numeros e informe qual é meior.
		
		int n1, n2;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero: ");
		n1 = scan.nextInt();
		System.out.println("Digite o primeiro numero: ");
		n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("O numero "+ n1+" é maior que " + n2);
		}
		else {
			System.out.println("O numero "+ n2+" é maior que" + n1);
			
		}

		}

}
