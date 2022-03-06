package Metodos01;

public class TesteLampada {
	
	public static void main(String[] args) {
		
		//https://pt.slideshare.net/loianeg/curso-java-basico-exercicios-aula-25-a-27?next_slideshow=47696447
		
		Lampada l1 = new Lampada();
		Lampada l2 = new Lampada();
		
		l1.tipo="";
		l1.corLuz="";
		l1.voltagem="220w";
		l1.potencia=9;
		
		l1.ligarLampada();
		
		l1.estado();
		
		l1.apagarLampada();
		
		l1.estado();
		
		l1.mudarEstado();
		
		l1.mudarEstado();
		
		
		
		
		
	}

}
