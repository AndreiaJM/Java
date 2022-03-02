package whileDowhileFor;

import java.util.Scanner;

public class Exercicio29 {
	
	public static void main(String[] args) {
		
		//https://loiane.com/2015/02/curso-java-basico-correcao-exercicios-aula-15-if-else-e-switch-case/
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Digite o numero maximo de numeros primo:");
		num = scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			boolean primo=true;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					primo=false;
				}
			}
			if(primo) {
				System.out.println(i);
			
			}
		}
	}

}
