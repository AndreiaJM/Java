package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio20 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a vitima?");
		String resp1 = scan.nextLine();
		System.out.println("Esteve no local do crime?");
		String resp2 = scan.nextLine();
		System.out.println("Mora perto da vitima?");
		String resp3 = scan.nextLine();
		System.out.println("Devia para a vitima?");
		String resp4 = scan.nextLine();
		System.out.println("Ja trabalhou com a vitima?");
		String resp5 = scan.nextLine();
		
		int cont=0;
		
		if(resp1.equalsIgnoreCase("s")) {
			cont++;
		}
		if(resp2.equalsIgnoreCase("s")) {
			cont++;
		}
		if(resp3.equalsIgnoreCase("s")) {
			cont++;
		}
		if(resp4.equalsIgnoreCase("s")) {
			cont++;
		}
		if(resp5.equalsIgnoreCase("s")) {
			cont++;
		}
		
		if(cont==0) {
			System.out.println("Inocente");
		}else if(cont==2){
			System.out.println("Suspeito");
		}else if(cont==3 || cont==4){
			System.out.println("Cumplice");
		}else if(cont==5){
			System.out.println("Assassino");
		}
	}

}
