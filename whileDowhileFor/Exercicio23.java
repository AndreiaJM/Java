package whileDowhileFor;

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int tabela=50; 
		Double preco=1.99, qtd=1.0;
		
		
		for(int i=1;i<=tabela;i++){
			
			qtd=preco*i;
			System.out.println(i+" R$"+qtd);
		}
	}

}
