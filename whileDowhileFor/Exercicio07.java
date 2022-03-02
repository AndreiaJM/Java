package whileDowhileFor;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int num=0;
		int maior= Integer.MIN_VALUE;
		
		for(int i=0;i<5;i++) {
			System.out.println("Digite um numero");
			num = scan.nextInt();
			
			if(num>maior) {
				maior=num;
			}
		}
		
		System.out.println("O maior numero é o: "+maior);
	}

}
