package HerancaePolimorfismo02;

import java.text.DecimalFormat;

public abstract class Contribuinte {
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
	
	DecimalFormat format = new DecimalFormat("###,###.###");
	
	private String nome;
	private double rendaBruta;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public abstract double calcularImposto();
	
	@Override
	public String toString() {
		String s = "Nome: "+ nome+"\n";
		s+= "Renda Bruta: "+ rendaBruta+"\n";
		s+="Imposto de Renda: "+format.format(calcularImposto());
		return s;
	}
	

}
