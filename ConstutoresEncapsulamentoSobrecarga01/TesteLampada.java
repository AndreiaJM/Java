package ConstutoresEncapsulamentoSobrecarga01;

public class TesteLampada {
	
	//https://pt.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-28-a-33
	
	public static void main(String[] args) {
		
		Lampada l1 = new Lampada();
		
		l1.ligarLamp();
		System.out.println("Ligada? "+l1.getLigada());
		
		l1.setLigada(false);
		System.out.println("Ligada? "+ l1.getLigada());
		
		l1.desligar();
		System.out.println("Ligada? "+ l1.getLigada());
		
		l1.mudarEstado();
		System.out.println("Ligada? "+l1.getLigada());
		
		l1.mudarEstado();
		System.out.println("Ligada? "+l1.getLigada());
		
	}

}
