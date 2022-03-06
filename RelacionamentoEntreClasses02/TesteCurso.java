package RelacionamentoEntreClasses02;

import java.util.Scanner;

public class TesteCurso {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome do curso: ");
		String nomeCurso = scan.nextLine();
		System.out.println("Entre com o horario do curso: ");
		String horarioCurso = scan.nextLine();
		System.out.println();
		System.out.println("Entre com o nome do professor: ");
		String nomePro = scan.nextLine();
		System.out.println("Entre com o departamento do professor: ");
		String departamento = scan.nextLine();
		System.out.println("Entre com o e-mail do professor: ");
		String email = scan.nextLine();
		
		Professor professor = new Professor();
		professor.setNome(nomePro);
		professor.setDepartamento(departamento);
		professor.setEmail(email);
		
		
		Curso curso= new Curso();
		curso.setNome(nomeCurso);
		curso.setHorario(horarioCurso);
		curso.setProfessor(professor);
		
		
		System.out.println("-----Alunos-------");
		
		Aluno[] alunos = new Aluno[5];
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Entre com o nome do aluno: "+(i+1));
			String nomeAluno = scan.next();
			System.out.println("Entre com a matricula do aluno: ");
			String matricula = scan.next();
			
			double[]notas=new double[4];
			
			for(int j=0;j<4;j++) {
				
				System.out.println("Digite a nota "+ (j+1));
				notas[j]=scan.nextDouble();
				
			}
			 
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matricula);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}
		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());
		
		
		
		
	}

}
