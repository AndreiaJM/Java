package whileDowhileFor;

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int n; 
		
		System.out.println("Informe um numero para calcular o seu fatorial: ");
		n = scan.nextInt();
		
		int fatorial=1;
		
		System.out.println("Fatorial de "+n);
		
		for(int i=n;i>0;i--) {
			
			fatorial*=i;
					
		}
		System.out.println(fatorial);
		
	}

}
