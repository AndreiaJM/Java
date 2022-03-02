package Vetores;

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main(String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com os valores do vetor: ");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i]%2!=0) {
				break;
			}
		}
		
		System.out.println("Entrou com valor impar, looping encerrado!.");
	}

}
