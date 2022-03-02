package Vetores;

import java.util.Scanner;

public class Exercicio36 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		Double[] vetorA = new Double[11];
		
		for(int i=0;i<vetorA.length;i++) {
			vetorA[i]=Math.pow(2, i);
		}
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
		}
	}

}
