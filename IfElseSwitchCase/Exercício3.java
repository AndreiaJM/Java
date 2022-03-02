package IfElseSwitchCase;

import java.util.Scanner;

public class Exercício3 {
	
	public static void main (String args[]){

		String sexo;
		Scanner scan = new Scanner (System.in);

		//http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		//Faça um programa que verifique se a letra digitada é F ou M.
		//Conforme a letra escrever F-Feminino, M-Masculino, sexo inválido.
		
		System.out.println("Digite F para feminino e M para masculino");
		sexo = scan.nextLine();
		
		if(sexo.equalsIgnoreCase("f")) {
			System.out.println("F-Feminino");
		}
		else if (sexo.equalsIgnoreCase("m")){
			System.out.println("M- masculino");
		}
		else {
			System.out.println("Sexo Inválido");
		}

		}
	
		



}
