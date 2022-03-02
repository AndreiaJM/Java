package EntradaSaidaDados;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
		//Faça um programa que peça 2 numeros inteiros e um numero real.
		//Calcule e mostre: 
		//O produto do dobro do primeiro com metade do segundo.
		//A soma do triplo do primeiro com o terceiro.
		//O terceiro elevado ao cubo. 
		
		
		Double n1, n2, n3,calculo1,calculo2,calculo3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		n1 = input.nextDouble();
		System.out.println("Digite outro numero inteiro: ");
		n2 = input.nextDouble();
		System.out.println("Digite um numero real: ");
		n3 = input.nextDouble();
		
		calculo1 = ((n1*2)+(n2/2));
		calculo2 = ((n1*3)+n3);
		calculo3 = Math.pow(n3, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo é "+ calculo1 );
		System.out.println("A soma do triplo do primeiro com o terceiro é "+ calculo2 );
		System.out.println("O terceiro elevado ao cubo é "+ calculo3 );
		
		
		
	}

}
