package ConstutoresEncapsulamentoSobrecarga02;

public class TesteContaCorrente {
	
	//https://pt.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-28-a-33
	
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente(123456,1234,-10, true,0,500);
		
		c1.sacar(20);
		System.out.println(c1.getSaldo());
		System.out.println(c1.getEspecialUsado());
		
		c1.depositar(50);
		System.out.println(c1.getSaldo());
		
		boolean verificar = c1.usandoChequeEspecial();
		
		System.out.println(verificar);
		
		c1.sacar(50);
		System.out.println(c1.usandoChequeEspecial());
		c1.consultaSaldo();
		
		
	}

}
