package HerancaePolimorfismo.copy;

public class Pessoa {
	
	private String nome;
	private String idade;
	private Contato[] contatos;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	@Override
	public String toString() {
		String s="****Dados da pessoa**** ";
		s+="Nome: "+ nome;
		s+="Idade: "+ idade;
		for(int i=0;i<3;i++) {
			System.out.println("Contatos: "+contatos[i].getNome()+" E-mail "+contatos[i].getEmail());
		}
		return s;
	}
	
	
	

}
