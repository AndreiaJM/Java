package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main(String[] args) {
		
		//Exercicio 13
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Que dia � hoje?");
		System.out.println("Digite 1 para Domingo");
		System.out.println("Digite 2 para Segunda");
		System.out.println("Digite 3 para Ter�a");
		System.out.println("Digite 4 para Quarta");
		System.out.println("Digite 5 para Quinta");
		System.out.println("Digite 6 para Sexta");
		System.out.println("Digite 7 para Sabad");
		int dia = scan.nextInt();
		
		switch(dia) {
		
		case 1: System.out.println("Hoje � Domingo");break;
		case 2: System.out.println("Hoje � Segunda");break;
		case 3: System.out.println("Hoje � Ter�a");break;
		case 4: System.out.println("Hoje � Quarta");break;
		case 5: System.out.println("Hoje � Quinta");break;
		case 6: System.out.println("Hoje � Sexta");break;
		case 7: System.out.println("Hoje � Sabado");break;
		default:System.out.println("N�o � um dia v�lido");
		
		}
		
	}

}
