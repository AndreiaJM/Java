package whileDowhileFor;

import java.util.Scanner;

public class Exercicio36 {
	
	public static void main(String[] args) {
		
		//https://loiane.com/2015/02/curso-java-basico-correcao-exercicios-aula-15-if-else-e-switch-case/
		
		float h=1,n,soma=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de n:");
		n=scan.nextInt();
		
		for(int i=2;i<=n; i++) {
			
			System.out.print(h+"/"+i+" + ");
			soma+=h/i;
		}
		System.out.println("Resultado"+soma);
	}

}
