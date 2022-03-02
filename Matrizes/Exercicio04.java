package Matrizes;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner scan = new Scanner(System.in);
		
		String[][] agenda = new String[30][24];
		int dia=0,hora=0, entrar=0;
		boolean sair=false;
		
		do {
			System.out.println("Entre com 1 para adicionar um compromisso.");
			System.out.println("Entre com 2 para verifica um compromisso.");
			System.out.println("Entre com 0 para sair.");
			entrar = scan.nextInt();
			
			if(entrar==1) {
				
				System.out.println("Qual dia do mes deseja do mês deseja alterar?");
				dia = scan.nextInt();
				System.out.println("E qual hora deseja alterar?");
				hora = scan.nextInt();
				System.out.println("Digite o seu compromisso: ");
				agenda[dia][hora]=scan.next();
				
			}else if(entrar==2) {
				
				System.out.println("Qual dia do mes deseja consultar?");
				dia = scan.nextInt();
				System.out.println("E qual hora desse dia?");
				hora = scan.nextInt();
				System.out.println(agenda[dia][hora]);
				
			}else if(entrar==0) {
				sair=true;
			}
			
		}while(!sair);
		
		
		
		
	}

}
