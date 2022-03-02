package IfElseSwitchCase;

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[] args) {
		
		//Exercicio 13
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		Double n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota");
		Double n2 = scan.nextDouble();
		
		Double media = (n1+n2)/2;
		String nota="";
		
		if(media>9 && media<=10) {
			nota = "A";
		}else if(media>7.5 && media<9){
			nota = "B";
		}else if(media>6 && media<7.5){
			nota = "C";
		}else if(media>4 && media<6){
			nota = "D";
		}else if(media>0 && media<4){
			nota = "E";
		}
		
		System.out.println("Nota 1 "+n1);
		System.out.println("Nota 2 "+n2);
		System.out.println("Media: "+media);
		System.out.println("Conceito: "+nota);
		
		/*switch(nota) {
		
		case "A": 
		case "B":
		case "C": System.out.println("Aprovado");break;
		case "D":
		case "E": System.out.println("Reprovado");break;
		default:System.out.println("Valor inválido");
		} */
		
		if(nota=="A" || nota == "B"|| nota =="C") {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}

}
