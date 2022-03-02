package Vetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		DecimalFormat formatar = new DecimalFormat("###,###.###");
		
		Scanner scan = new Scanner(System.in);
		
		Double[] vetorA = new Double[4];
		Double[] vetorB = new Double[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição: "+ i);
			vetorA[i]=scan.nextDouble();
			
			vetorB[i]=vetorA[i]*i;
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
