package Enum02;

public class Formulario {
	
	
	//Enum pode ser declarado como classe ou detro de uma
	enum Genero{
		FEMININO('F'), MASCULINO('F');
		
		private char valor; //precisa de um atributo que passara o valor para seu construtor
		
		Genero(char valor){
			this.valor = valor;
		}
	}
	
	private String nome;
	private Genero genero;

}
