package HerancaePolimorfismo.copy;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno(); //objeto
		
		aluno.setNome("Andreia");
		aluno.setMatricula("1234");
		
		Professor professor = new Professor();//objeto
		
		professor.setNome("Loiane");
		
		aluno.setProfessor(professor);
		
		Materia materia = new Materia(); //objeto
		
		materia.setNomeMateria("Programação");
		materia.setCargaHoraria("2horas");
		
		professor.setMateria(materia);
		
		Materia[] materias = new Materia[3];
		
		Materia materia2 = new Materia(); //objeto
		
		System.out.println("****Dados do aluno******");
		
		
		
		for(int i=0;i<materias.length;i++) {
			
			System.out.println("Digite o nome da materia: ");
			String nomeMateria = scan.next();
			materia2.setNomeMateria(nomeMateria);
			System.out.println("Digite a carga horaria da materia: ");
			String carHoraria = scan.next();
			materia2.setCargaHoraria(carHoraria);
	
			materias[i] = materia2;
			
		}
		aluno.setMaterias(materias);
		
		System.out.println(professor);
		
		System.out.println(aluno);
		
		
		
		
		
		
		
	}

}
