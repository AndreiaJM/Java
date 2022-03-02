package Matrizes;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner scan = new Scanner(System.in);
		
		String[][][]agenda = new String[12][30][8];
		boolean sair=false;
		int opcao=0, dia=0, hora=0, mes=0;
		
		System.out.println("Bem vindo a sua agenda!");
		
		do {
				System.out.println("Entre com 1 para adicionar um compromisso.");
				System.out.println("Entre com 2 para verifica um compromisso.");
				System.out.println("Entre com 0 para sair.");
				opcao = scan.nextInt();

			if(opcao==1) {
				
				System.out.println("Digite o mes: ");
				mes = scan.nextInt();
				
				while(mes<1 || mes>12){
					
					System.out.println("Mes inválido, digite novamente!");
					System.out.println("Digite o mes: ");
					mes = scan.nextInt();
					
				}
				System.out.println("Digite o dia: ");
				dia = scan.nextInt();
				
				while(dia<1 || dia>30){
					
					System.out.println("Dia inválido, digite novamente!");
					System.out.println("Digite o dia: ");
					dia = scan.nextInt();
					
				}
				System.out.println("Digite a hora: ");
				hora = scan.nextInt();
				
				while(hora<1 || hora>8){
					
					System.out.println("Hora inválida, digite novamente!");
					System.out.println("Digite a hora: ");
					hora = scan.nextInt();
					
				}
				
				System.out.println("Digite o seu compromisso: ");
				agenda[mes][dia][hora] = scan.next();
				
			}else if(opcao==2) {
				
				System.out.println("Digite o mes que deseja verificar: ");
				mes = scan.nextInt();
				
				while(mes<1 || mes>12){
					
					System.out.println("Mes inválido, digite novamente!");
					System.out.println("Digite o mes: ");
					mes = scan.nextInt();
					
				}
				
				System.out.println("Digite o dia que deseja verificar: ");
				dia = scan.nextInt();
				
				while(dia<1 || dia>30){
					
					System.out.println("Dia inválido, digite novamente!");
					System.out.println("Digite o dia: ");
					dia = scan.nextInt();
					
				}
				System.out.println("Digite a hora que deseja verificar: ");
				hora = scan.nextInt();
				
				while(hora<1 || hora>8){
					
					System.out.println("Hora inválida, digite novamente!");
					System.out.println("Digite a hora: ");
					hora = scan.nextInt();
					
				}
				
				System.out.println(agenda[mes][dia][hora]);

			}else if(opcao==0) {
				sair=true;
			}else {
				System.out.println("Opção inválida, tente novamente ou digite 0 para sair");
			}
			
		}while(!sair);
		
	}

}
