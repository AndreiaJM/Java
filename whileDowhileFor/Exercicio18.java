package whileDowhileFor;

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int n; 
		boolean primo=true;
		
		System.out.println("Informe um numero verificar se é primo: ");
		n = scan.nextInt();
		
		int result;
		
		/*for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("Não é numero primo");break;
			}else {
				System.out.println("é numero primo");break;
			}
		}*/
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				primo=false;
			}
		}
		
		if(primo) {
			System.out.println("é numero primo");
		}else {
			System.out.println("Não é numero primo");
		}
	}

}
