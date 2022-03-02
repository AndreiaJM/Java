package whileDowhileFor;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		boolean continuar=false;
		int cont=0, pA,tA,pB,tB;
		
		do {
		System.out.println("Digite a população da cidade A:");
		pA = scan.nextInt();
		System.out.println("Digite a taxa de crescimento da cidade A:");
		tA = scan.nextInt();
		System.out.println("Digite a população da segunda cidade B:");
		pB = scan.nextInt();
		System.out.println("Digite a taxa de crescimento da cidade B:");
		tB = scan.nextInt();
		
		while(pA<pB) {
			pA+=(pA/100*tA);
			pB+=(pB/100*tB);
			
			cont++;
		}
		
		System.out.println("A cidade A, alcançara a cidade B em "+ cont+" anos");
		
		System.out.println("Deseja continuar?");
		System.out.println("");
		continuar = scan.nextBoolean();
		
		}while(continuar==true);
		
	}

}
