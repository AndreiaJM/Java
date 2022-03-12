package HerancaePolimorfismo02;

import java.text.DecimalFormat;

public class PessoaFisica extends Contribuinte{
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
	
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public double calcularImposto() {
		
		double renda=this.getRendaBruta();
		double imposto;
		
		if(renda<=1400) {
			
			return 0;
		}
		else if(renda<=2100){
			
			return (renda/100*10)-100;
		}
		else if(renda<=2800) {
			
			return (renda/100*15)-270;
		}
		else if(renda<=3600) {
			
			return (renda/100*25)-500;
		}
		
		//>3600
		return (renda/100*30)-700;
	}
	
	@Override
	public String toString() {
		String info="****Dados da pessoa fisica****"+"\n";
		info+="CPF: "+ cpf+"\n";
		info+=super.toString();
		
		return info;
	}
	
}
