package OrientacaoObjetos03;

public class TesteContaCorrente {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-24
		
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();
		ContaCorrente conta3 = new ContaCorrente();
		
		conta1.numero=123456;
		conta1.saldo=2.00;
		conta1.status=false;
		conta1.limite=100;
		
		conta2.numero=234567;
		conta2.saldo=50.00;
		conta2.status=false;
		conta2.limite=1000;
		
		conta3.numero=345678;
		conta3.saldo=100.00;
		conta3.status=true;
		conta3.limite=10000;
		
		System.out.println("Saldo 1: "+conta1.saldo);
		System.out.println();
		System.out.println("Saldo 2: "+conta2.saldo);
		System.out.println();
		System.out.println("Saldo 3: "+conta3.saldo);
		
		
	}

}
