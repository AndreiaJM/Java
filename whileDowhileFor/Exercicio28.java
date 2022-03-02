package whileDowhileFor;

import java.util.Scanner;

public class Exercicio28 {
	
	public static void main(String args[]) {
		
		//https://loiane.com/2015/02/curso-java-basico-correcao-exercicios-aula-15-if-else-e-switch-case/
		
		Scanner scan = new Scanner(System.in);
		int num;
		boolean primo=true;
		
		System.out.println("Digite o numero que deseja verificar: ");
		num = scan.nextInt();
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				primo=false;
			}
		}
		if(primo==false) {
			System.out.println(num+" NÃO é numero primo");
		}else {
			System.out.println(num+" é numero primo");
		}
	}

}
