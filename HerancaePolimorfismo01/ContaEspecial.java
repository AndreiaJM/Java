package HerancaePolimorfismo01;

public class ContaEspecial extends ContaBancaria{
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
	
	private Double limite;

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		String s="Conta Especial: ";
		s += "Limite :" + limite+"\n";
		s+= super.toString();
		
		return s;
	}

	@Override
	public boolean sacar(double valor) {
		
		Double saldoComLimite = this.getSaldo()+limite;
		if((saldoComLimite-valor)>=0) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		return false;
	}
	
	

}
