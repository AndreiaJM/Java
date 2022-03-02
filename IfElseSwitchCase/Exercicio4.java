package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String args[]){

		String letra;
		Scanner scan = new Scanner (System.in);

		//http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		/* Faça um programa que verifique se uma letra digitada é vogal ou consoante
		 *  
		 *  Da para fazer com if else e com switch case
		 */
		
		
		System.out.println("Digite uma letra para ser verficada se é vogal ou consoante");
		letra = scan.nextLine();
		
		/*if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
			|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("Vogal");
		}
		else {
			System.out.println("Consoante");
		}*/
		
		if (letra.length()>1) {
			System.out.println("Você digitou mais de uma letra");
		}
		else {
		
		switch(letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u": 
		case "A": 
		case "E": 
		case "I": 
		case "O": 
		case "U": System.out.println("Vogal"); break;
		default : System.out.println("Consoante");
		}
		
		}
		
	}
}
