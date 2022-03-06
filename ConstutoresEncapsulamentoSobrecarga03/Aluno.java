package ConstutoresEncapsulamentoSobrecarga03;

public class Aluno {
	
	//https://pt.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-28-a-33
	
	private String nome;
	private String matricula;
	private String curso;
	private String[] diciplina = new String[3];
	private double[][]nota = new double[3][4];
	
	public Aluno(String nome, String matricula, String curso, String[]diciplina,double[][] nota) {
		
		this.nome=nome;
		this.matricula=matricula;
		this.curso=curso;
		this.diciplina=diciplina;
		this.nota=nota;
		
	}
	
	public Aluno(){}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String[] getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String[] diciplina) {
		this.diciplina=diciplina;
	}
	
	public double[][] getNota(){
		return nota;
	}
	public void setNota(double[][]nota) {
		this.nota = nota;
	}
	
	void mostraInfo() {
		System.out.println("Nome: "+nome);
		System.out.println("Matricula: "+matricula);
		System.out.println("Curso: "+ curso);
		
		for(int i=0;i<nota.length;i++) {
			System.out.println();
			for(int j=0;j<nota[i].length;j++) {
				
				System.out.print(nota[i][j]+" ");
			}
		}
		
		
	}
	
	void media(int indice) {
		
		double soma=0, media=0;
	
	for(int i=0;i<nota[indice].length;i++) {
		
		soma+=nota[indice][i];
		media=soma/4;
	}
		if(media>=7) {
			System.out.println("Aluno Aprovado "+ diciplina[indice]);
		}else {
			System.out.println("Aluno reprovado em "+ diciplina[indice]);
		}
	
	}
	
	public void setNomeDiciplinas(int pos, String nomeDiciplina) {
		this.diciplina[pos]=nomeDiciplina;
	}
	public void setNotasIJ(int i, int j, double notas) {
		this.nota[i][j]= notas;
	}
	
	
	
	
}
