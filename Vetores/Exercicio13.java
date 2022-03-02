package Vetores;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		int soma=0;
		
		int[] vetorA = new int[10];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição: "+ i);
			vetorA[i]=scan.nextInt();
		}
		
		for(int i=0;i<vetorA.length;i++) {
			if(vetorA[i]%5==0) {
				soma+=vetorA[i];
			}
		}
		System.out.println("Soma dos multiplos de 5: "+soma);
		
		
	}

}
