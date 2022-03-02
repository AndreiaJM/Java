package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = scan.nextInt();
		
		if(ano%4==0 && ano%100!=0) {
			System.out.println("É ano bissexto");
		}else if(ano%4==0 && ano%100==0 && ano%400==0){
			System.out.println("É ano bissexto");
		}else {
			System.out.println("Não é ano bissexto");
		}
		
	}

}
