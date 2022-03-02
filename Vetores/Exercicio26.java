package Vetores;

import java.util.Scanner;

public class Exercicio26 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor do Vetor A da posição "+(i+1)+":");
			vetorA[i]=scan.nextInt();
		}
		
		for(int i=0;i<vetorB.length;i++) {
			System.out.println("Digite o valor do Vetor B da posição "+(i+1)+":");
			vetorB[i]=scan.nextInt();
			
			if(vetorA[i]>vetorB[i]) {
				vetorC[i]=1;
			}else if(vetorA[i]==vetorB[i]) {
				vetorC[i]=0;
			}else if(vetorA[i]<vetorB[i]) {
				vetorC[i]=-1;
			}
		}
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.println();
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorB[i]+" ");
		}
		System.out.println();
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorC[i]+" ");
}
		
		
	}

}
