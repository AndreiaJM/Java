package Enum04;

public enum TipoDocumento {
	
	//Como ja aprendemos Enum podem ter atributos, metodos, construtores, 
	//e na aula de hoje metodos abstratos que podem ser de interfaces 
	//ou declarado no proprio enum;
	
	CPF {
		@Override
		public String geraNumeroTeste() {
			
			return GerarCpfCnpj.cpf();
		}
	}, CNPJ {
		@Override
		public String geraNumeroTeste() {
			
			return GerarCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraNumeroTeste();

}
