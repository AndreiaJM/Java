package whileDowhileFor;

import java.util.Scanner;

public class Exercicio24 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		Double preco; 
		
		System.out.println("Informe o pre�o do p�o: ");
		preco = scan.nextDouble();
		
		for(int i=1;i<=50;i++) {
			
			System.out.println(i+" R$"+ preco*i);
		}
	}

}
