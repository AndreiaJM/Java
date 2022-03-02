package Vetores;

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma=0,cont=0;
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição: "+ i);
			vetorA[i]=scan.nextInt();
		}
		for(int i=0;i<vetorA.length;i++) {
			
			if(vetorA[i]%2!=0) {
				cont++;
				soma+=vetorA[i];
			}
		}
		System.out.println("Media simples dos impares: "+soma/cont);
	}

}
