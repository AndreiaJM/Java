package AgendaJava;

public class ContatoNaoExiste extends Exception{
	
	private String nomeContato;
	
	public ContatoNaoExiste(String nome) {
		
		this.nomeContato = nome;
	}
	
	
	@Override
	public String getMessage() {
		
		return "Contato"+ nomeContato+" não existe";
	}
	

}
