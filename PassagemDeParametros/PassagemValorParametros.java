package PassagemDeParametros;

public class PassagemValorParametros {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato("Contato 1", "1234-1234", "contato@email.com");
		
		int valor=10;
		
		System.out.println("****Valor original");
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("****Exemplo 1");
		
		testePassagemValorReferencia(valor,contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("****Exemplo 2");
		
		testePassagemValorReferencia2(valor,contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
	}
	
	private static void testePassagemValorReferencia(int valor, Contato contato){

		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");//Alterando a referencia localmente
		
	}

	private static void testePassagemValorReferencia2(int valor, Contato contato){

		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato"+novoValor); //alterando a referencia globalmente
	}

}
