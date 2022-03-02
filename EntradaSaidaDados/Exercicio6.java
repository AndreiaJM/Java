package EntradaSaidaDados;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
		
		//Faça um programa que peça  raio de um cículo e calcule a sua area.
		//Area do cículo é igual a ((pi*raio) elevado ao quadrado)
		
		
		int raio;
		Double area;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o raio do círculo: ");
		raio = input.nextInt();
		
		area =Math.pow((3.14*raio), 2);
		
		System.out.println("Este círculo possui "+ area +" de área");
		
		
		
	}

}
