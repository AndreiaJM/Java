package Metodos03;

import java.util.Scanner;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		
		System.out.println("Entre com o nome do aluno: ");
		aluno1.nome=scan.nextLine();
		System.out.println("Entre com a matricula: ");
		aluno1.matricula=scan.nextLine();
		System.out.println("Entre com o curso: ");
		aluno1.curso=scan.nextLine();
		
		for(int i=0;i<aluno1.diciplina.length;i++) {
			System.out.println("Entre com a diciplina "+(i+1)+":");
			aluno1.diciplina[i]=scan.nextLine();
		}
		
		for(int i=0; i<aluno1.nota.length;i++) {
			System.out.println("Obtento a nota d diciplina "+ aluno1.diciplina[i]);
			for(int j=0;j<aluno1.nota[i].length;j++) {
				System.out.println("Entre com a nota: "+ (j+1));
				aluno1.nota[i][j]=scan.nextDouble();
			}
		}
		
		aluno1.mostraInfo();
		aluno1.media(2);
	}

}
