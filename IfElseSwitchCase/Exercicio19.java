package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = scan.nextInt();
		System.out.println("Digite outro numero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Qual operaçao deseja realizar? ");
		System.out.println("Digite 1 para + ");
		System.out.println("Digite 2 para - ");
		System.out.println("Digite 3 para *");
		System.out.println("Digite 4 para / ");
		int op = scan.nextInt();
		
		int resultado=0;
		
		switch(op) {
		case 1: resultado= num1+num2;break;
		case 2: resultado= num1-num2;break;
		case 3: resultado= num1*num2;break;
		case 4: resultado= num1/num2;break;
		default: System.out.println("Não é uma opção valida");
		}
		
		System.out.println("Resultado da operação "+resultado);
				
		if(resultado%2==0) {
		System.out.println("Numero par");
		}else {
		System.out.println("Não é par");
		}
		
		if(resultado<0) {
			System.out.println("Numero negativo");
		}else {
			System.out.println("Numero positivo");
		}
		
		
		
	}

}
