package EntradaSaidaDados;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
		
		//Fa�a um programa que pe�a  raio de um c�culo e calcule a sua area.
		//Area do c�culo � igual a ((pi*raio) elevado ao quadrado)
		
		
		int raio;
		Double area;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o raio do c�rculo: ");
		raio = input.nextInt();
		
		area =Math.pow((3.14*raio), 2);
		
		System.out.println("Este c�rculo possui "+ area +" de �rea");
		
		
		
	}

}
