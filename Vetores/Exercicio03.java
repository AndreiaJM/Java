package Vetores;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] vetorA = new int[4];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length;i++) {
			
			System.out.println("Entre com o valor da posição: "+ i);
			vetorA[i]=scan.nextInt();
			
			vetorB[i]=vetorA[i]*vetorA[i];

		}
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<vetorB.length;i++) {
			System.out.print(+vetorB[i]+" ");
		}
		
		
		
	}

}
