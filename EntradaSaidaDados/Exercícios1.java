package EntradaSaidaDados;

import java.util.Scanner;

public class Exerc�cios1 {
	
	public static void main(String args[]) {
	
	//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
	
	//5) fa�a um programa que converta metros para cent�metros.
		
	int metros, centimetros;
	Scanner input = new Scanner (System.in);
	
	System.out.println("Digite quantos metros deseja converter para cent�metros: ");
	metros = input.nextInt();
	
	centimetros = metros*100;
	
	System.out.println(metros + " metro(s) � igual h� "+ centimetros + " centrimetros ");
	
	}

}
