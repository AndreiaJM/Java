package whileDowhileFor;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		//https://loiane.com/2015/02/curso-java-basico-correcao-exercicios-aula-15-if-else-e-switch-case/
		
		Scanner scan =new Scanner(System.in);
		
		int nota=0;
		
		
		System.out.println("Digite uma nota de 0 á 10");
		nota = scan.nextInt();
		
		do{
			System.out.println("Nota invalida");
			System.out.println("Digite uma nota de 0 á 10\" ");
			nota = scan.nextInt();
			
		}while(nota<0 || nota>10);
		
		System.out.println("Nota: "+ nota);
		
	}

}
