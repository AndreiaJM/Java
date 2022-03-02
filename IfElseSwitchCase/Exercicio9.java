package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main (String args[]){

		//http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner input = new Scanner (System.in);
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = input.nextInt();
		System.out.println("Digite o terceiro numero: ");
		n3 = input.nextInt();
		

		if (n1<n2 && n1<n3 && n2<n3 ) {
			//maior n3
			//menor n1
			//n2
			System.out.println("");
		}
	}

}
