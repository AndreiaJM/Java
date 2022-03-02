package Vetores;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma=0,contPar=0, contImpar=0;
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição: "+ i);
			vetorA[i]=scan.nextInt();
		}
		for(int i=0;i<vetorA.length;i++) {
			
			if(vetorA[i]%2==0) {
				contPar++;
			}else {
				contImpar++;
			}
		}
		
		System.out.println("Soma dos impares: "+((contPar*100)/vetorA.length)+"% são pares");
		System.out.println("Soma dos impares: "+((contImpar*100)/vetorA.length)+"% são impares");
		
		
	}

}
