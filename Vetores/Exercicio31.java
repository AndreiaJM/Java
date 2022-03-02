package Vetores;

import java.util.Scanner;

public class Exercicio31 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		int posiB=0;
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length]; 
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor do Vetor A da posição "+(i+1)+":");
			vetorA[i]=scan.nextInt();
		}
		for(int i=0;i<vetorA.length;i++) {
			
			if(vetorA[i]%2==0) {
				vetorB[posiB]=vetorA[i];
				posiB++;
			}
		}
		for(int i=0;i<vetorA.length;i++) {
			
			if(vetorA[i]%2!=0) {
				vetorB[posiB]=vetorA[i];
				posiB++;
			}
		}
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
			}
		System.out.println();
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorB[i]+" ");
				
			}
		}
	}

