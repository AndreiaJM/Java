package whileDowhileFor;

import java.util.Scanner;

public class Exercicio30 {
	
	public static void main(String[] args) {
		
		//https://loiane.com/2015/02/curso-java-basico-correcao-exercicios-aula-15-if-else-e-switch-case/
		
		Scanner scan = new Scanner(System.in);
		int tabuada, inicio, fim, tab;
		
		System.out.println("Digite o numero na tabuada que deseja: ");
		tabuada = scan.nextInt();
		System.out.println("Digite o numero que ela ira começar: ");
		inicio = scan.nextInt();
		System.out.println("Digite aonde ira terminar: ");
		fim = scan.nextInt();
		
		while(fim<inicio) {
			System.out.println("Valor final menor que o inicial, tente novamente: ");
			System.out.println("Digite o numero que ela ira começar: ");
			inicio = scan.nextInt();
			System.out.println("Digite aonde ira terminar: ");
			fim = scan.nextInt();
			
		}
		
		System.out.println("Vou montar a tabuada do "+tabuada+" começando em "+inicio+" e terminando em "+ fim);
		
		for(int i=inicio;i<=fim;i++) {
			
			tab=tabuada*i;
			
			System.out.println(tabuada+"X"+i+"="+tab);
		
		}
	}

}
