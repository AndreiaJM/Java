package Vetores;

import java.util.Scanner;

public class Exercicio32 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor do Vetor A da posição "+(i+1)+":");
			vetorA[i]=scan.nextInt();
		}
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println();
			System.out.println("Tabuda do: "+ (i+1));
			for(int j=1;j<10;j++) {
				
				System.out.println(vetorA[i]+"*"+j+"="+vetorA[i]*j);
			}
		}
	}

}
