package whileDowhileFor;

import java.util.Scanner;

public class Exercicio33 {
	
	public static void main(String[] args) {
		
		//https://loiane.com/2015/02/curso-java-basico-correcao-exercicios-aula-15-if-else-e-switch-case/
		
		Scanner scan = new Scanner(System.in);
		int n, soma=0;
		
		
		System.out.println("Digite o valor de n");
		n = scan.nextInt();
		
		for(int i=1, j=1; i<=n;i++,j+=2) {
			System.out.print(i+"/"+j+" + ");
			
			soma+=i/j;
		}
		System.out.println("Total:"+soma);
	}

}
