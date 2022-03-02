package Vetores;

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA=new int[10];
		int menor= Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int cont=0;
		
		for(int i=0; i<vetorA.length;i++) {
			
			System.out.println("Digite a idade da pessoa: "+ i+1);
			vetorA[i] = scan.nextInt();
		}
		for(int i=0; i<vetorA.length;i++) {
			
			if(vetorA[i]>35) {
				cont++;
			}
		}
		System.out.println(cont+" pessoas possuem mais que 35 anos");
	}

}
