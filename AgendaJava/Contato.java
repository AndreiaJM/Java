package AgendaJava;

public class Contato {
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-47-a-52
	
	/*static. É usado para a criação de uma variável que poderá ser acessada 
	por todas as instâncias de objetos desta classe como uma variável comum, 
	ou seja, a variável criada será a mesma em todas as instâncias e quando 
	seu conteúdo é modificado numa das instâncias, a modificação ocorre em todas as demais*/
	
	private static int contador=0;
	
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	public Contato() {
		contador++;
		id=contador;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	
	 @Override
	    public String toString() {
	        String s = "[";
	        s += "Id: " + id;
	        s += ", Nome: " + nome;
	        s += ", Telefone: " + telefone;
	        s += ", Email: " + email;
	        s += "]";
	        return s;
	}

}
