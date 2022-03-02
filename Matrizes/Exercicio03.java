package Matrizes;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner scan = new Scanner(System.in);
		
		int [][]matriz = new int[3][3];
		int somaPar=0, somaImpar=0;
		
		for(int i=0;i<matriz.length;i++) {
			
			for(int j=0;j<matriz[i].length;j++) {
				
				System.out.println("Digite o valor da linha "+ i + " e coluna "+j);
				matriz[i][j] = scan.nextInt();
			}
		}
			for(int i=0;i<matriz.length;i++) {
			
			for(int j=0;j<matriz[i].length;j++) {
				
				if(matriz[i][j]%2==0) {
					somaPar++;
				}else {
					somaImpar++;
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
			System.out.println("Quantidade de pares: "+ somaPar);
			System.out.println("Quantidade de impares: "+ somaImpar);
		
	}

}
