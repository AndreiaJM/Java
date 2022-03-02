package whileDowhileFor;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int n1,n2, result=1;
		
		System.out.println("Digite o numero base: ");
		n1=scan.nextInt();
		System.out.println("Digite a potencia: ");
		n2=scan.nextInt();
		
		for(int i=1; i<=n2;i++) {
			result*=n1;
		}
		
		System.out.println("Resultado: "+result);
	}

}
