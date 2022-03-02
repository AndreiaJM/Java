package whileDowhileFor;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int num, primeiro=1, segundo=1, resultado=0;
		
		System.out.println("Digite a enésima posição da sequencia de Fibonacci:");
		num = scan.nextInt();
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for(var i=3;i<=num;i++) {
			
			resultado=primeiro+segundo;
			primeiro=segundo;
			segundo=resultado;
			
			System.out.println(resultado);
		}
		
		
	}

}
