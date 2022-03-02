package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String args[]) {
		
		//http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		//Entrar no link acima para ver a questão
		
		Scanner input = new Scanner (System.in);
		Double salario, valoraumento,novosalario;
		int percentagem;
		
		System.out.println("Digite o seu salario:");
		salario = input.nextDouble();
		
		
		
		if(salario<280) {
			percentagem=20;
		}else if(salario>=280 && salario<700) {
			percentagem=15;
		}else if(salario>=700 && salario<1500) {
			percentagem=10;
		}else {
			percentagem=5;
		}
		
		valoraumento=salario/100*percentagem;
		novosalario=salario+valoraumento;
	
		System.out.println("Seu salario era:"+ salario 
				+ " e teve um aumento de: "+percentagem
				+"%"+" que ficou em "+valoraumento
				+" e seu novo salario ficou em "+ novosalario);
		
	}

}
