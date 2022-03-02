package whileDowhileFor;

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int qtd, valor,cont=0, soma=0, media=0; 
		
		System.out.println("Informe quantos CDs comprou:  ");
		qtd = scan.nextInt();
		
		/*while(cont<qtd) {
			cont++;
			System.out.println("Informe o valor do  CD "+cont);
			valor = scan.nextInt();
			soma+=qtd;
			media=soma/cont;
		}
		System.out.println("Valor investido: "+soma+"R$");
		System.out.println("Media por cd: "+media+"R$");*/
		
		for(int i=1;i<=qtd;i++) {
			
			System.out.println("Informe o valor do  CD "+i);
			valor = scan.nextInt();
			soma+=qtd;
			media=soma/i;
		}
		System.out.println("Valor investido: "+soma+"R$");
		System.out.println("Media por cd: "+media+"R$");
	}

}
