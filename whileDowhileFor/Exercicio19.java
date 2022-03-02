package whileDowhileFor;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int n,cont=0, soma=0,media=0, notas;
		
		System.out.println("Quantas notas deseja calcular?");
		n= scan.nextInt();
		
		if(n==0) {
			System.out.println("Programa encerrado");
		}else {
		
		/*do {
			cont++;
			System.out.println("Digite a nota "+cont);
			notas = scan.nextInt();
			soma+=notas;
			media=soma/cont;
			
		}while(cont<n);
		
		System.out.println("Média: "+ media);*/
		
		
		for(int i=0;i<n;i++) {
			cont++;
			System.out.println("Digite a nota "+cont);
			notas = scan.nextInt();
			soma+=notas;
			media=soma/cont;
		}
		System.out.println("Média: "+ media);
		
		}
	}

}
