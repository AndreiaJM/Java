package Vetores;

import java.util.Scanner;

public class Exercicio29 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[20];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor do Vetor A da posição "+(i+1)+":");
			vetorA[i]=scan.nextInt();
		}
		for(int i=0;i<vetorB.length;i++) {
			System.out.println("Digite o valor do Vetor B da posição "+(i+1)+":");
			vetorB[i]=scan.nextInt();
		}
		
		for(int i=0;i<vetorA.length;i++) {
			vetorC[i]=vetorA[i];
			vetorC[vetorA.length+i]=vetorB[i];
		}
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.println();
		for(int i=0;i<vetorB.length;i++) {
			System.out.print(vetorB[i]+" ");
		}
		System.out.println();
		for(int i=0;i<vetorC.length;i++) {
			System.out.print(vetorC[i]+" ");
		}
	}

}
