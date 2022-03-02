package Vetores;

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA= new int[4];
		int soma=0;
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição: "+ i);
			vetorA[i]=scan.nextInt();
			
			soma+=vetorA[i];
		}
		
		System.out.println("Total: "+ soma);
	}

}
