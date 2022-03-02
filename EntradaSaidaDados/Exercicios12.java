package EntradaSaidaDados;

import java.util.Scanner;

public class Exercicios12 {
	
	public static void main (String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
		//Tendo como base a altura de uma pessoa calcule como base o seu peso ideal ultilizando a formula: 
		//((72.7*altura)-58)
		
		float altura, pesoIdeal;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite a sua altura: ");
		altura = input.nextFloat();
		
		pesoIdeal = (float) ((72.7*altura)-58);
		
		System.out.println("O seu peso ideal é de: "+pesoIdeal);
		
		
	}

}
