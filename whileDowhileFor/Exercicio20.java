package whileDowhileFor;

import java.util.Scanner;

public class Exercicio20 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		
		int qtd, cont=0,idade=0, soma=0,media;
		
		System.out.println("Digite a quantidade de pessoas: ");
		qtd = scan.nextInt();
		
		while(cont<qtd) {
			cont++;
			System.out.println("Digite a idade da pessoa  "+ cont);
			idade = scan.nextInt();
			soma+=idade;
			media=soma/cont;
		}
		
		if(idade>0 && idade<=25) {
			System.out.println("Turma jovem");
		}else if(idade>26 && idade<=60) {
			System.out.println("Turma adulta");
		}else{
			System.out.println("Turma idosa");
		}
		
	}

}
