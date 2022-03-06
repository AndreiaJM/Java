package ConstutoresEncapsulamentoSobrecarga01;

public class Lampada {
	
	//https://pt.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-28-a-33
	
	private String tipo;
	private String corLuz;
	private String voltagem;
	private int potencia;
	private boolean ligada;
	
	public Lampada(String tipo, String corLuz, String voltagem, int potencia, boolean ligada) {
		
		this.tipo = tipo;
		this.corLuz = corLuz;
		this.voltagem = voltagem;
		this.potencia = potencia;
		this.ligada = ligada;
	}
	
	public Lampada() {
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getCorLuz() {
		return corLuz;
	}
	
	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public boolean getLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public boolean ligarLamp() {
		return ligada=true;
	}
	public boolean desligar() {
		return ligada=false;
	}
	
	public void mudarEstado() {
		
		if(ligada==true) {
			desligar();
		}else {
			ligarLamp();
		}
	}

}
