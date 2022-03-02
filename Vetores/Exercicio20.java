package Vetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat format = new DecimalFormat("###,###.###");
		
		
		float[] vetor = new float[20];
		float contacao;
		
		System.out.println("Informe a cotação do dolar: ");
		contacao = scan.nextFloat();
		
		for(int i=0;i<vetor.length;i++) {
			vetor[i] = contacao*(i+1);
			System.out.print(format.format(vetor[i])+" ");
		}
		
	}

}
