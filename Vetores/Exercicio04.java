package Vetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###.###");
		
		Double[] vetorA = new Double[15];
		Double[] vetorB= new Double[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição: "+ i);
			vetorA[i]=scan.nextDouble();
			
			vetorB[i]=Math.sqrt(vetorA[i]);
		}
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<vetorB.length;i++) {
			System.out.print(formatar.format(vetorB[i])+" ");
		}
	}

}
