package Metodos02;

public class ContaCorrente {
	
	//https://pt.slideshare.net/loianeg/curso-java-basico-exercicios-aula-25-a-27?next_slideshow=47696447
	
	int numero;
	int agencia;
	double saldo;
	boolean especial;
	double especialUsado;
	double limiteEspecial;
	
	boolean sacar(double valor) {
		
		if(saldo>=valor) {
			saldo-=valor;
			return true;
		}else {
			if(especial) {
				especialUsado+=limiteEspecial+saldo;
				if(especialUsado>=valor) {
					saldo-=valor;
					return true;
				}else {
					 return false;
				}
				
			}else {
				return false;
			}
		}
	}
	
	void depositar(double valorDep) {
		saldo+=valorDep;
	}
	
	void consultaSaldo() {
		System.out.println("Saldo em conta: "+saldo);
	}
	
	boolean usandoCheque() {
		if(saldo<0) {
			return true;
		}else {
			return false;
		}
	}

}
