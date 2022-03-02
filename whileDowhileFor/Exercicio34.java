package whileDowhileFor;

import java.util.Scanner;

public class Exercicio34 {
	
	public static void main(String[] args) {
		
		//https://loiane.com/2015/02/curso-java-basico-correcao-exercicios-aula-15-if-else-e-switch-case/
		
		Scanner scan = new Scanner(System.in);
		
		float soma=0,n, h=1;
		
		System.out.print("Digite o numero de n:");
		n= scan.nextInt();
		
		for(int i=2;i<=n;i++) {
			
			System.out.print(h+"/"+i+" + ");
			soma+=h/i;
		}
		
		System.out.println("Resultado:"+soma);
		
		
	}

}
