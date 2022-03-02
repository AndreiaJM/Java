package Vetores;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
		
		Scanner scan = new Scanner(System.in);
		
		
		float[] n1 = new float[4];
		float[] n2 = new float[n1.length];
		float[] result = new float[n1.length];
		
		for(int i=0;i<n1.length;i++) {
				
				System.out.println("Digite a primeira nota: ");
				n1[i] = scan.nextFloat();
				System.out.println("Digite a Segunda nota: ");
				n2[i] = scan.nextFloat();
				
				result[i]= ((n1[i]+n2[i])/2);
				
				}
		
			for(int i=0;i<n1.length;i++) {
				
			System.out.print("Nota 1:"+ n1[i]+" ");
			System.out.print("Nota 2:"+ n2[i]+" ");
			System.out.print("Media: ");
			System.out.print(result[i]+" ");
			
			if(result[i]>=7) {
				System.out.println("Aluno Aprovado");
			}else {
				System.out.println("Aluno Repovado");
			}
			
			}
			
	}

}
