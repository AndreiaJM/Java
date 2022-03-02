package Matrizes;

import java.util.Random;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		/*int[][] matriz = new int[4][4];
		int maiorN = Integer.MIN_VALUE;*/
		
		/*for(int i=0;i<matriz.length;i++) {
			
			for(int j=0;j<matriz[i].length;j++) {
				
				matriz[i][j]=(int) Math.round(Math.random()*9);
			}
		}
		
		for(int i=0;i<matriz.length;i++) {
			System.out.println();
			for(int j=0;j<matriz[i].length;j++) {
				
				System.out.print("["+matriz[i][j]+"]");
			}
		}
		
		for(int i=0;i<matriz.length;i++) {
			
			for(int j=0;j<matriz[i].length;j++) {
				
				if(matriz[i][j]>maiorN) {
					maiorN=matriz[i][j];
					
					System.out.println("Maior numero: "+ maiorN+" linha "+i+ " coluna "+j);
				}
			}
			
			
		} */
		
		Random sorteio = new Random();
		
		int[][] matriz = new int[4][4];
		int maiorN = Integer.MIN_VALUE;
		int linha=0, coluna=0;
		
			for(int i=0;i<matriz.length;i++) {
			
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j] = sorteio.nextInt(100);
				if(matriz[i][j]>maiorN) {
					maiorN = matriz[i][j];
					linha=i;
					coluna=j;
				}
			}
		}
			for(int i=0;i<matriz.length;i++) {
				System.out.println();
				for(int j=0;j<matriz[i].length;j++) {
					System.out.print("["+matriz[i][j]+"]");	
				}
			}
			
			System.out.println("\n Maior numero: "+ maiorN);
			System.out.println("Linha "+linha);
			System.out.println("Coluna "+coluna);
		
		
	}

}
