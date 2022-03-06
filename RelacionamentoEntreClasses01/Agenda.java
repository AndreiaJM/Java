package RelacionamentoEntreClasses01;

public class Agenda {
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-36
	
	private String nome;
	private Contato[] contatos;
	
	public Agenda(String nome, Contato[] contatos) {
		super();
		this.nome = nome;
		this.contatos = contatos;
	}
	
	public Agenda() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String obterInfo() {
		String info ="Nome ="+nome+"\n";
			
		if(contatos!=null) {
			for(Contato c : contatos) {
				info+=c.mostrarInfo() + "\n";
			}
		}
		return info;
	}
	
	
	

}
