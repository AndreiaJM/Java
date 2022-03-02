package Vetores;

import java.util.Scanner;

public class Exercicio24 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		boolean palidromo=true;
		
			for(int i=0;i<vetorA.length;i++) {
				System.out.println("Digite o valor da posição "+(i+1)+":");
				vetorA[i]=scan.nextInt();
			}
			for(int i=0;i<vetorA.length;i++) {
			
			if(vetorA[i]!=vetorA[vetorA.length-1-i]) {
				palidromo=false;
			}else {
				palidromo=true;
			}
		}
			if(palidromo) {
				System.out.println("Numero palindromo");
			}else {
				System.out.println("Não é palindromo");
			}
	}

}
