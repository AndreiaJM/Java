package HerancaePolimorfismo.copy;

public class Aluno {
	
	private String nome;
	private String matricula;
	private Professor professor;
	private Materia[] materias; 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
	public Materia[] getMaterias() {
		return materias;
	}
	public void setMaterias(Materia[] materias) {
		this.materias = materias;
	}
	@Override
	public String toString() {
		String info = "Nome: "+ nome + "\n";
		info+="Matricula: "+ matricula +"\n";
		info+= "Professor: " + "\n";
		info+="Nome: "+ professor.getNome()+ "\n";
		info+="Materia: "+ "\n";
		for(int i=0;i<3;i++) {
			info+= "Nome da materia: "+ materias[i].getNomeMateria()+ "\n"+"Carga Horaria: "+ materias[i].getCargaHoraria()+ "\n";
		}
		
		return info;
	}
	
	
	
	

}
