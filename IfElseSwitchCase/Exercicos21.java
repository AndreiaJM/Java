package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicos21 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner scan = new Scanner(System.in);
		int combustivel, litros,desconto=0;
		Double preco=0.0, precoDesc ;
		
		System.out.println("Digite 1 para colocar Alcool ou 2 para colocar gasolina?");
		combustivel = scan.nextInt();
		System.out.println("Quantos litros deseja colocar?");
		litros = scan.nextInt();
		
		switch(combustivel) {
		case 1: System.out.println("Alcool");
			preco=2.99;
			if(litros<=20) {
				System.out.println("O desconto sera de 3% por litro");
				desconto = 3;
			}else {
				System.out.println("O desconto sera de 5% por litro");
				desconto = 5;
			}break;
		case 2: System.out.println("Gasolina");
		preco=3.99;
		if(litros<=20) {
			System.out.println("O desconto sera de 4% por litro");
			desconto = 4;
		}else {
			System.out.println("O desconto sera de 6% por litro");
			desconto = 6;
		}break;
		}
		
		precoDesc=(preco*litros)-(preco/100*desconto);
		
		System.out.println("Preço por litro "+preco);
		System.out.println("Valor total a pagar com desconto: "+ precoDesc);
		
		
		
	}

}
