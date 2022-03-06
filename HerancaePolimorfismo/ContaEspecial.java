package HerancaePolimorfismo;

public class ContaEspecial extends ContaBancaria{
	
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
