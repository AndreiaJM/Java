package whileDowhileFor;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int n1,n2, soma=0;
		
		System.out.println("Digite uma numero inteiro: ");
		n1=scan.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		n2=scan.nextInt();
		
		for(int i=n1;i<=n2;i++) {
			soma+=i;
		}
		System.out.println("A soma é: "+soma);
	}

}
