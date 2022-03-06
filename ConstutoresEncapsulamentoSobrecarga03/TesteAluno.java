package ConstutoresEncapsulamentoSobrecarga03;

import java.util.Scanner;

public class TesteAluno {
	
	//https://pt.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-28-a-33
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		aluno1.setNome(scan.nextLine());
		System.out.println("Digite a matricula: ");
		aluno1.setMatricula(scan.nextLine());
		System.out.println("Digite o nome do curso");
		aluno1.setCurso(scan.nextLine());
		
		for(int i=0;i<aluno1.getDiciplina().length;i++) {
			System.out.println("Digite o nome da diciplina "+ (i+1));
			aluno1.setNomeDiciplinas(i, scan.next());
		}
		
		for(int i=0; i<aluno1.getNota().length;i++) {
			System.out.println("Obtento a nota da diciplina "+ aluno1.getDiciplina()[i]);
			for(int j=0;j<aluno1.getNota()[i].length;j++) {
				System.out.println("Entre com a nota: "+ (j+1));
				aluno1.setNotasIJ(i, j, scan.nextDouble());
			}
		}
		
		aluno1.mostraInfo();
		
		for(int i=0;i<aluno1.getNota().length;i++) {
			aluno1.media(i);
		}
		
		
	}

}
