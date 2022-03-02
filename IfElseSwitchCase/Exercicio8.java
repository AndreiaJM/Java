package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String args[]){

		//http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		//Escreva um programa que pergunte o preço de 3 produtos e informe qual produto você deve comprar, 
		//sabendo que a decisão é sempre pelo mais barato
		
		Scanner input = new Scanner (System.in);
		double p1, p2, p3;
		
		System.out.println("Qual o preço do primeiro produto? ");
		p1 = input.nextDouble();
		System.out.println("Qual o preço do segundo produto? ");
		p2 = input.nextDouble();
		System.out.println("Qual o preço do terceiro produto? ");
		p3 = input.nextDouble();
		
		if(p1<p2 && p2<p3) {
			System.out.println("O primeiro produto é o mais barato");
		}
		else if(p2<p1 && p2<p3) {
			System.out.println("O segundo produto é o mais barato");
		}
		else {
			System.out.println("O terceiro produto é o mais barato");
		}
		
	}

}
