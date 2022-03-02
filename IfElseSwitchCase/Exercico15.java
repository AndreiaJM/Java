package IfElseSwitchCase;

import java.util.Scanner;

public class Exercico15 {
	
	public static void main(String[] args) {
		
		//www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triangulo");
		int l1 = scan.nextInt();
		System.out.println("Digite o segundo lado do triangulo");
		int l2 = scan.nextInt();
		System.out.println("Digite o terceiro lado do triangulo");
		int l3 = scan.nextInt();
		
		if(l1+l2>l3) {
			System.out.println("É um triangulo");
			
			if(l1==l2 && l2==l3) {
				System.out.println("Triangulo Equilatero");
			}else if(l1==l2 || l1==l3) {
				System.out.println("Triangulo Isóseles");
			}else if(l1!=l2 && l1!=l3) {
				System.out.println("Triangulo escaleno");
			}
		}else {
			System.out.println("Não é um triangulo");
		}
		
	}

}
