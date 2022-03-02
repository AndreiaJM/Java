package Vetores;

import java.util.Scanner;

public class Exercicio27 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
			for(int i=0;i<vetorA.length;i++) {
			
			System.out.println("Digite o valor da posição "+ i +":");
			vetorA[i] = scan.nextInt();
		}
			for(int i=0;i<vetorA.length;i++) {
				
				if(vetorA[i]<7) {
					vetorB[i]='a';
				}else if(vetorA[i]==7) {
					vetorB[i]='b';
				}else if(vetorA[i]>7 && vetorA[i]<10) {
					vetorB[i]='c';
				}else if(vetorA[i]==10) {
					vetorB[i]='d';
				}else if(vetorA[i]>10) {
					vetorB[i]='e';
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
