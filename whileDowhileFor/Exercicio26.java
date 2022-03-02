package whileDowhileFor;

import java.util.Scanner;

public class Exercicio26 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int num, fatorial=1;
		
		System.out.println("Entre com um numero para calcular o fatorial: ");
		num=scan.nextInt();
		
		System.out.println("Fatorial de: ");
		System.out.print(num+"!=");
		for(int i=num;i>0;i--) {
			
			
			fatorial*=i;
			System.out.print(i+"*");
			
		}
		System.out.print("="+fatorial);
		
	}

}
