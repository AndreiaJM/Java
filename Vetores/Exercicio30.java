package Vetores;

import java.util.Scanner;

public class Exercicio30 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		int posiPar=0, posiImpar=0;
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length]; //par
		int[] vetorC = new int[vetorA.length]; //impar
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor do Vetor A da posição "+(i+1)+":");
			vetorA[i]=scan.nextInt();
		}
		for(int i=0;i<vetorA.length;i++) {
			
			if(vetorA[i]%2==0) {
				vetorB[posiPar]=vetorA[i];
				posiPar++;
			}else if(vetorA[i]%2!=0){
				vetorC[posiImpar]=vetorA[i];
				posiImpar++;			
			}
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
