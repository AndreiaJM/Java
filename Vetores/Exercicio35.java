package Vetores;

import java.util.Scanner;

public class Exercicio35 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor do Vetor A da posição "+(i+1)+":");
			vetorA[i]=scan.nextInt();
		}
		
		for(int i=0;i<vetorA.length;i++) {
			
			System.out.println("Analisando o numero: "+vetorA[i]);
			
			for(int j=1;j<=vetorA[i];j++) {
				
				if(vetorA[i]%j==0) {
					System.out.println("Divisivel por: "+ j);
				}
			}
			
			System.out.println();
		}
	}

}
