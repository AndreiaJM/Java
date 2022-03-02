package whileDowhileFor;

import java.util.Scanner;

public class Exercicio25 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		
		Double preco=0.0, soma=0.0, dinheiro=0.0;
		boolean proximacompra=false;
		
		do {
			System.out.println("Lojas tabajara\n");
		do {
			
			System.out.println("Entre com o valor do produto: ");
			preco = scan.nextDouble();
			soma+=preco;
			
		}while(preco!=0);
		
		System.out.println("Total da compra: "+soma);
		System.out.println("Qual valor em dinheiro?");
		dinheiro = scan.nextDouble();
		System.out.println("Troco "+(dinheiro-soma));
		proximacompra=true;
		
		}while(proximacompra==true);
	}

}
