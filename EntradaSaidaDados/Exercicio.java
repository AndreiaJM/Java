package EntradaSaidaDados;

import java.util.Scanner;

public class Exercicio {
	
	public static void main(String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
		
		//Faça um programa que peça o tamanho de um arquivo para download em MB 
		// E a velocidade de um link de internet em Mbps, calcule e informe o tempo aproximado de download do arquivo.
		Double velocidade, tamanho, tempo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("O tamanho do arquivo:  ");
		tamanho = scan.nextDouble();
		System.out.println("Digite a velocidade da sua internet:  ");
		velocidade = scan.nextDouble();
		
		tempo = ((velocidade/8)/tamanho);
		
		System.out.println("o tempo de dowload é de: "+tempo);
		
		
		
		
	}

}
