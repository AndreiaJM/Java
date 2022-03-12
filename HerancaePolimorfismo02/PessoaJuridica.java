package HerancaePolimorfismo02;

import java.text.DecimalFormat;

public class PessoaJuridica extends Contribuinte{
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
	
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		double renda = (this.getRendaBruta()/100)*10;
		return renda;
	}
	
	@Override
	public String toString() {
		String s = "***Dados da pessoa juridica***"+"\n";
		s+="Cnpj: "+ cnpj+"\n";
		s+=super.toString();
		return s;
	}
	
	

}
