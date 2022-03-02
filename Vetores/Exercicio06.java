package Vetores;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		Double[] vetorA = new Double[10];
		Double[] vetorB = new Double[10];
		Double[] vetorC = new Double[10];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição: "+ i+" do vetor A");
			vetorA[i]=scan.nextDouble();
		}
		
		for(int i=0;i<vetorB.length;i++) {
			System.out.println("Entre com o valor da posição: "+ i+" do vetor B");
			vetorB[i]=scan.nextDouble();
		}
		
		for(int i=0;i<vetorC.length;i++) {
			vetorC[i]=vetorA[i]+vetorB[i];
		}
		
		System.out.println("Vetor C:");
		for(int i=0;i<vetorC.length;i++) {
			System.out.println(vetorC[i]+" ");
		}
		
		
		
		
		
		
	}

}
