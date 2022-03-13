package PassagemDeParametros;

public class Contato {
	
	private String nome;
	private String contato;
	private String email;
	
	public Contato() {
		super();
		
	}

	public Contato(String nome, String contato, String email) {
		super();
		this.nome = nome;
		this.contato = contato;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", contato=" + contato + ", email=" + email + "]";
	}
	
	
	
	

}
