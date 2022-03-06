package Metodos01;

public class Lampada {
	
	//https://pt.slideshare.net/loianeg/curso-java-basico-exercicios-aula-25-a-27?next_slideshow=47696447
	
	String tipo;
	String corLuz;
	String voltagem;
	int potencia;
	boolean ligada;
	
	void ligarLampada() {
		
		 ligada=true;
	}
	
	void apagarLampada() {
		
		ligada=false;
	}
	
	void estado() {
		
		if(ligada) {
			System.out.println("A lampada esta ligada");
		}else {
			System.out.println("A lampada esta desligada");
		}
	}
	
	void mudarEstado() {
		 if(ligada) {
			 
			 apagarLampada();
			 System.out.println("Apaguei");
		 }else {
			 ligarLampada();
			 System.out.println("Acendi");
		 }
	}
	

}
