package whileDowhileFor;

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		
		int primeiro=1, segundo=1, resultado=0;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		while(resultado<=500) {
			
			resultado=primeiro+segundo;
			primeiro=segundo;
			segundo=resultado;
			
			System.out.println(resultado);
		}
		
		
	}

}
