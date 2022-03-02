package whileDowhileFor;

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int num=0,pares=0, impares=0;
		
		for(var i=1;i<=10;i++) {
			System.out.println("Digite um numero inteiro: ");
			num=scan.nextInt();
			
		if(num%2==0) {
			pares++;
		}else {
			impares++;
		}
		
	}
		System.out.println("Pares: "+pares);
		System.out.println("Impares: "+impares);
	}

}
