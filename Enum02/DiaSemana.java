package Enum02;

public enum DiaSemana {
	
	//ja com construtor
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor;
	
	//O contrutor não pode ser encapsulado
	DiaSemana(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}

}
