package IfElseSwitchCase;

import java.util.Scanner;

public class Exercício5 {
	
	public static void main (String args[]){

		float n1, n2, media;
		Scanner scan = new Scanner (System.in);

		//http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		/* Faça um programa para a leitura de duas notas parciais de um aluno.
		 * o programa deve calcular a media alcançada por aluno e apresentar: 
		 * A mensagem: "Aprovado" Se a media alcançada for maior ou igual a sete
		 *  A mensagem: "Reprovado" Se a media alcançada for menor do que sete
		 *   A mensagem: "Aprovado com Distinção" Se a media alcançada for igual a dez
		 * */
		
		
		System.out.println("Digite a primeira nota: ");
		n1 = scan.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = scan.nextFloat();
		
		media = ((n1+n2)/2);
		
		if(media  ==10) {
			System.out.println("Aprovado com Distinção");
		}
		else if(media >=7 && media<10) {
			System.out.println("Aluno Aprovado");
		}
		else {
			System.out.println("Aluno Reprovado");
		}
		
		

		}







}
