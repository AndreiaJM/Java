package HerancaePolimorfismo03;

public class Animal {
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
	
	private String nome;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		String s = "Animal:"+ nome+"\n";
		s+="Comprimento:"+ comprimento+" cm"+"\n";
		s+="Patas: "+ patas+"\n";
		s+="Cor: "+cor+"\n";
		s+="Ambiente: "+ambiente+"\n";
		s+="Velocidade: "+velocidade+" m/s"+"\n";
		return s;
	}
	
	

}
