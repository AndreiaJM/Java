package HerancaePolimorfismo03;

public class Mamifero extends Animal{
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
	
	private String alimento;

	public Mamifero() {
		this.setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s+="Alimento: "+alimento;
		return s;
	}
	
	
	
	

}
