package whileDowhileFor;

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int turmas, alunos=0,soma=0, media=0;
		
		System.out.println("Digite a quantidade de turmas:");
		turmas= scan.nextInt();
		
		for(int i=1; i<=turmas;i++) {
			
			System.out.println("Digite a quantidade de alunos da turma "+ i);
			alunos= scan.nextInt();
			
		while(alunos>40) {
			System.out.println("Cada turma deve ter menos que 40 alunos, digite novamente: ");
			alunos= scan.nextInt();
		}
			soma+=alunos;
			media=soma/i;
		}
		
		System.out.println("Media de alunos: "+media);
		
	}

}
