package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String args[]){

		//http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		//Escreva um programa que pergunte o pre�o de 3 produtos e informe qual produto voc� deve comprar, 
		//sabendo que a decis�o � sempre pelo mais barato
		
		Scanner input = new Scanner (System.in);
		double p1, p2, p3;
		
		System.out.println("Qual o pre�o do primeiro produto? ");
		p1 = input.nextDouble();
		System.out.println("Qual o pre�o do segundo produto? ");
		p2 = input.nextDouble();
		System.out.println("Qual o pre�o do terceiro produto? ");
		p3 = input.nextDouble();
		
		if(p1<p2 && p2<p3) {
			System.out.println("O primeiro produto � o mais barato");
		}
		else if(p2<p1 && p2<p3) {
			System.out.println("O segundo produto � o mais barato");
		}
		else {
			System.out.println("O terceiro produto � o mais barato");
		}
		
	}

}
