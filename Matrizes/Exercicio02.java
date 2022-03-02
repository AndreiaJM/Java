package Matrizes;

import java.util.Random;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Random sorteio = new Random();
		
		/*int[][]matriz = new int [10][10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for(int i=0; i<matriz.length;i++) {
			
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=sorteio.nextInt(100);
				if(matriz[5][j]>maior) {
					maior = matriz[5][j];
				}
			}	
		}
			for(int i=0; i<matriz.length;i++) {
			
			for(int j=0;j<matriz[i].length;j++) {
				if(matriz[7][j]<menor) {
					menor = matriz[7][j];
				}
			}	
		
			}
		for(int i=0;i<matriz.length;i++) {
			System.out.println();
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print("["+matriz[i][j]+"]");	
			}
		}
		System.out.println();
		System.out.println("Maior da linha 5: "+maior);
		System.out.println("Menor da linha 7: "+menor);*/
		
		int[][]matriz = new int [10][10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
			for(int i=0; i<matriz.length;i++) {
			
				for(int j=0;j<matriz[i].length;j++) {
					matriz[i][j]=sorteio.nextInt(100);
				}
			}	
			for(int i=0;i<matriz.length;i++) {
				System.out.println();
				for(int j=0;j<matriz[i].length;j++) {
					System.out.print("["+matriz[i][j]+"]");	
				}
			}
			
			for(int i=0;i<matriz[5].length;i++) {
				if(matriz[5][i]>maior) {
					maior=matriz[5][i];
				}
			}
			for(int i=0;i<matriz[7].length;i++) {
				if(matriz[7][i]<menor) {
					menor=matriz[7][i];
				}
			}
			
			System.out.println();
			System.out.println("Maior da linha 5: "+maior);
			System.out.println("Menor da linha 7: "+menor);
	}

}
