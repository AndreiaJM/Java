package HerancaePolimorfismo01;

public class ContaBancaria {
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
	
	private String nomeCliente;
	private String numConta; 
	private double saldo;
	
	
	
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public ContaBancaria() {
		
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	} 
	
	@Override
	public String toString() {
		String s = "Nome cliente " + nomeCliente+"\n";
		s+= "Conta Corrente: "+ numConta+"\n";
		s+="Saldo: "+ saldo+"\n";
		
		return s;
	}
	
	public boolean sacar(double valor) {
		
		if((saldo-valor)>=0) {
			saldo-=valor;
			System.out.println("Saque de: "+ valor+ "efetuado com sucesso");
			return true;
		}else {
			return false;
		}
	}
	
	public void depositar(double valorDep) {
		saldo+=valorDep;
		System.out.println("Deposito de "+valorDep+" feito com sucesso");
	}
	
	
	

}
