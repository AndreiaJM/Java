package Metodos02;

import java.util.Scanner;

public class TesteContaCorrente {
	
	//https://pt.slideshare.net/loianeg/curso-java-basico-exercicios-aula-25-a-27?next_slideshow=47696447
	
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		
		c1.numero=123456;
		c1.agencia=1234;
		c1.saldo=-10;
		c1.especial=true;
		c1.limiteEspecial=1000.0;
		c1.especialUsado=0;
		
		c2.numero=654321;
		c2.agencia=6543;
		c2.saldo=10;
		c2.especial=false;
		c2.limiteEspecial=0;
		
		
		//Sacando dinheiro
		if(c1.sacar(20)==false) {
			System.out.println("Saldo insulficiente");
			c1.consultaSaldo();
		}else {
			System.out.println("Saque feito com sucesso");
			c1.consultaSaldo();
			
		}
		//Sacando dinheiro
		if(c1.sacar(30)==false) {
			System.out.println("Saldo insulficiente");
			c1.consultaSaldo();
		}else {
			System.out.println("Saque feito com sucesso");
			c1.consultaSaldo();
		}
		
		//depositando
		System.out.println("Depositando 100 reais");
		c1.depositar(100);
		System.out.println("Após o deposito ficou: ");
		c1.consultaSaldo();
		
		if(c1.sacar(30)==false) {
			System.out.println("Saldo insulficiente");
			c1.consultaSaldo();
		}else {
			System.out.println("Saque feito com sucesso");
			c1.consultaSaldo();
			
		}
		
		if(c1.usandoCheque()) {
			System.out.println("Esta usando o chequeespecial");
		}else {
			System.out.println("Não esta usando o cheque especial");
		}
		
		if(c1.sacar(30)==false) {
			System.out.println("Saldo insulficiente");
			c1.consultaSaldo();
		}else {
			System.out.println("Saque feito com sucesso");
			c1.consultaSaldo();
		}
		
		if(c1.usandoCheque()) {
			System.out.println("Esta usando o cheque especial");
		}else {
			System.out.println("Não esta usando o cheque especial");
		}
		
	}

}
