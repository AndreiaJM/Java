package Vetores;

import java.util.Scanner;

public class Exercicio25 {
	
	public static void main(String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<vetorA.length;i++) {
			
			System.out.println("Digite o valor da posição "+ i +":");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0;i<vetorA.length;i++) {
			
			if(vetorA[i]%2==0) {
				vetorB[i]=1;
			}else if (vetorA[i]%2!=0){
				vetorB[i]=0;
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
