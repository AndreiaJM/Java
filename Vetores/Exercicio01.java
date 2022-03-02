package Vetores;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-19
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] vetorA=new int[5];
		int[] vetorB=new int[5];
		
		for(int i=0;i<vetorA.length;i++) {
			
			System.out.println("Digite o valor da posição:"+i);
			vetorA[i]=scan.nextInt();
			
			vetorB[i]=vetorA[i];
		}
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println("");
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorB[i]+" ");
		}
		
	}

}
