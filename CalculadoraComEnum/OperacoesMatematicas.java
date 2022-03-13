package CalculadoraComEnum;

public enum OperacoesMatematicas {
	
	SOMA("+") {
		@Override
		public double ExecutarOperacao(double x, double y) {
			
			return x+y;
		}
	}, SUBTRACAO("-") {
		@Override
		public double ExecutarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x-y;
		}
	}, MULTIPLICACAO("*") {
		@Override
		public double ExecutarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x*y;
		}
	}, DIVISAO("-") {
		@Override
		public double ExecutarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x/y;
		}
	};
	
	private String simbolo;
	
	OperacoesMatematicas(String simbolo){
		
		this.simbolo = simbolo;
	}
	
	public abstract double ExecutarOperacao(double x, double y);
	
	@Override
	public String toString() {
		
		return simbolo;
	}

}
