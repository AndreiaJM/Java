package whileDowhileFor;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int num=0, soma=0, media=0;
		
		for(var i=0;i<5;i++) {
			System.out.println("Digite um numero");
			num = scan.nextInt();
			
			soma+=num;
			media=soma/5;
			
		}
		
		System.out.println("Soma: "+soma);
		System.out.println("Media: "+media);
	}

}
