package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio18 {
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println("Numero par");
		}else {
			System.out.println("Não é par");
		}
		
	}

}
