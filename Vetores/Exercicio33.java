package Vetores;

import java.util.Scanner;

public class Exercicio33 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		boolean primo;
		String msg="";
		
		int[] vetorA = new int[10];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor do Vetor A da posição "+(i+1)+":");
			vetorA[i]=scan.nextInt();
		}
		
		for(int i=0;i<vetorA.length;i++) {
			
			primo=true;
			
			for(int j=2;j<vetorA[i];j++) {
				
				if(vetorA[i]%j==0) {
					primo=false;
					break;
				}
			}
				if(primo) {
					msg="Primo";
				}else{
					msg="Não Primo";
				}
				
				System.out.println(vetorA[i]+" "+msg);
		}
		
		}
		
	}


