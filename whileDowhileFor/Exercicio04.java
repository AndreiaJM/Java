package whileDowhileFor;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		
		int pA=80000, pB=200000;
		int cont=0;
		
		while(pA<pB) {
			pA+=(pA/100*3);
			pB+=(pB/100*1.5);
			
			cont++;
		}
		
		System.out.println(cont);
		System.out.println(pA);
		System.out.println(pB);
		
	}

}
