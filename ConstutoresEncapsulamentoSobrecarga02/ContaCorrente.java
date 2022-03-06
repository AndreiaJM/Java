package ConstutoresEncapsulamentoSobrecarga02;

public class ContaCorrente {
	
	//https://pt.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-28-a-33
	
	private int numero;
	private int agencia;
	private double saldo;
	private boolean especial;
	private double especialUsado;
	private double limiteEspecial;
	
	
	public ContaCorrente(int numero, int agencia, double saldo, boolean especial, double especialUsado,
			double limiteEspecial) {
	
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
		this.especialUsado = especialUsado;
		this.limiteEspecial = limiteEspecial;
	}
	
	public ContaCorrente() {
	
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public boolean isEspecial() {
		return especial;
	}


	public void setEspecial(boolean especial) {
		this.especial = especial;
	}


	public double getEspecialUsado() {
		return especialUsado;
	}


	public void setEspecialUsado(double especialUsado) {
		this.especialUsado = especialUsado;
	}


	public double getLimiteEspecial() {
		return limiteEspecial;
	}


	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	public boolean sacar(double valor) {
		if(saldo>=valor) {
			saldo-=valor;
			return true;
		}else {
			if(especial) {
				saldo-=valor;
				especialUsado+=limiteEspecial+saldo;
				if(especialUsado>=valor) {
				return true;
				}else {
					System.out.println("Sem limite para saque");
					return false;
				}
			}else {
				System.out.println("Sem limite para saque");
				return false;
			}
		}
	}
	
	public boolean depositar(double valorDeposito){	
		saldo+=valorDeposito;
		return true;
	}
	
	public void consultaSaldo() {
		System.out.println(saldo);
	}
	
	public boolean usandoChequeEspecial() {
		if(saldo<0) {
			return true;
		}
		return false;
	}
	
	
	
	

}
