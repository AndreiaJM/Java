package Vetores;

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		int soma=0,soma2=0, soma3=0, somaVetor=0;
		
		int[] vetorA = new int[10];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição: "+ i);
			vetorA[i]=scan.nextInt();
		}
		for(int i=0;i<vetorA.length;i++) {
			
			if(vetorA[i]<15) {
				soma++;
			}else if(vetorA[i]==15){
				soma2++;
			}else if(vetorA[i]>15){
				somaVetor+=vetorA[i];
				soma3++;
			}
		}
		System.out.println("Menores que 15: "+soma);
		System.out.println("Iguais a 15: "+soma2);
		System.out.println("Maior que 15: "+somaVetor/soma3);
	}

}
