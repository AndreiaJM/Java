package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String args[]){

		//http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		//Escreva um programa que pergunte o periodo em que você estuda, peça para digitar 
		//M - matutino, V - vespertino, N - noturno
		//Imprima a mensagem Bom dia, Boa tarde ou Boa Noite ou valor inválido conforme o caso.
		
		Scanner input = new Scanner (System.in);
		String periodo;
		
		System.out.println("Em qual periodo você estuda? ");
		System.out.println("Digite M para matutino");
		System.out.println("Digite V para vespertino");
		System.out.println("Digite N para noturno");
		periodo = input.nextLine();
		
		if(periodo.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
			
		}
		else if(periodo.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
		}
		else if (periodo.equalsIgnoreCase("N")){
			System.out.println("Boa noite");
		}
		else {
			System.out.println("Valor inválido!");
		}
		
		switch(periodo) {
		case "M" : System.out.println("Bom dia!");break;
		case "V" : System.out.println("Boa tarde!");break;
		case "N" : System.out.println("Boa noite!");break;
		case "m" : System.out.println("Bom dia!");break;
		case "v" : System.out.println("Boa tarde!");break;
		case "n" : System.out.println("Boa noite!");break;
		default : System.out.println("Valor inválido");
		
		
	}

}}
