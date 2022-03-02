package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main (String args[]){
		
		
		//http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		//Faça um programa que leia 3 numeros e mostre o maior deles
		
		int n1, n2, n3;
		Scanner scan = new Scanner (System.in);

		System.out.println("Digite o primeiro numero: ");
		n1 = scan.nextInt();
		System.out.println("Digite o primeiro numero: ");
		n2 = scan.nextInt();
		System.out.println("Digite o primeiro numero: ");
		n3 = scan.nextInt();
		
		
		if(n1>n2 && n1>n3){
			System.out.println(n1 + " é o maior numero");
		}else if(n2>n1 && n2>n3) {
			System.out.println(n2 + " é o maior numero");
		}else {
			System.out.println(n3 + " é o maior numero");
		}
		}

}
