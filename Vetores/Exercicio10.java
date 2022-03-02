package Vetores;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		Double[] vetorA= new Double[10];
		Double[] vetorB= new Double[10];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição: "+ i);
			vetorA[i]=scan.nextDouble();
			
			vetorB[i]=vetorA[i]%2;
		}
		
		System.out.println("Vetor B: ");
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println(vetorB[i]+" ");
			
		}
	}

}
