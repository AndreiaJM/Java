package AgendaJava;

public class ContatoNaoExisteException extends Exception{
	
	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	} 
	
	@Override
	public String getMessage() {
		return "Contato: "+nomeContato+" Não existe na agenda";
	}
	
	

}
