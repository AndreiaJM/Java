package HerancaePolimorfismo.copy;

public class Professor {
	
	private String nome;
	private Materia materia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	@Override
	public String toString() {
		
		String info = "Nome Professor: "+ nome + "\n";
		info+="Materia: "+ materia.getNomeMateria() +"\n";
		
		return info;
	}
}
