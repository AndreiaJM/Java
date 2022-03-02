package Vetores;

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int contZero=0, contUm=0;
		
		for(int i=0;i<vetorA.length;i++) {
			
			vetorA[i]=(int) Math.round(Math.random()*1);
			
			if(vetorA[i]==0) {
				contZero++;
			}else {
				contUm++;
			}
		}
		System.out.println("Percentagem de zeros: "+(contZero*100/vetorA.length));
		System.out.println("Percentagem de Um: "+(contUm*100/vetorA.length));
		
	}

}
