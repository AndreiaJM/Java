package Vetores;

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int menor=Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int indexMaior=0, indexMenor=0;
		
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com a idade: "+ i+1);
			vetorA[i]=scan.nextInt();
		}
		
		for(int i=0;i<vetorA.length;i++) {
			if(vetorA[i]<menor) {
				menor=vetorA[i];
				indexMenor=i;
			}else if(vetorA[i]>maior) {
				maior=vetorA[i];
				indexMaior=i;
			}
		}
		System.out.println("Menor idade: "+menor+ " esta na posição: "+indexMenor);
		System.out.println("Menor idade: "+maior+ " esta na posição: "+indexMaior);
		
		
	}

}
