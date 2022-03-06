package MetodosStatics02;

public class TesteContador {
	
	public static void main(String[] args){
		
		int num=1;
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		int retorno = Contador.retornaValor();
		
		System.out.println(retorno);
		
		Contador.zerar();
		System.out.println(Contador.retornaValor());
		
		
		
		
	}

}
