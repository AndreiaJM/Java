package HerancaePolimorfismo;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	
	private double diaRendimento;

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	@Override
	public String toString() {
		String s = "Conta Poupança"+"\n";
		s+="Dia rendimento "+ diaRendimento+"\n";
		s+=super.toString();
		return s;
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance(); //Classe do java util que pega a data de hoje
		
		if(diaRendimento ==hoje.get(Calendar.DAY_OF_MONTH)) {
			//saldo+=saldo*taxaRendimento; não usa-se += com metodo get
			this.setSaldo(this.getSaldo()+this.getSaldo()*taxaRendimento);
			return true;
		}
		return false;
	}
	
	
}
