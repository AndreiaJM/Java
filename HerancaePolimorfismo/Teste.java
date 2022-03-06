package HerancaePolimorfismo;

public class Teste {
	
	public static void main(String[] args) {
	
		
		System.out.println("******Teste Conta Simples*******");
		
		ContaBancaria contaSimples = new ContaBancaria();
		
		contaSimples.setNomeCliente("Fulano de Tal");
		contaSimples.setNumConta("1234");
		contaSimples.setSaldo(100.00);
		
		System.out.println(contaSimples);
		
		contaSimples.depositar(100);
		
		System.out.println(contaSimples);
		
		contaSimples.sacar(50);
		
		realizarSaque(contaSimples, 40);
		
		System.out.println();
		
		System.out.println("******Teste Poupança*******");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaPoupanca.setNomeCliente("Fulano de Tal");
		contaPoupanca.setNumConta("1234");
		contaPoupanca.setSaldo(100.00);
		contaPoupanca.setDiaRendimento(5);
		
		realizarSaque(contaPoupanca, 50);
		
		System.out.println(contaPoupanca);
		
		contaPoupanca.depositar(10);
		
		realizarSaque(contaPoupanca, 100);
		
		contaPoupanca.depositar(10);
		
		System.out.println(contaPoupanca);
		
		
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo: "+ contaPoupanca.getSaldo());
		}else {
			System.out.println("Não é dia de rendimento");
			System.out.println("Dia de rendimento: "+ (int) contaPoupanca.getDiaRendimento());
		}
		
		System.out.println("******Teste Especial*******");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		
		contaEspecial.setNomeCliente("Fulano de Tal");
		contaEspecial.setNumConta("1234");
		contaEspecial.setLimite(50.00);
		
		contaEspecial.depositar(100);
		
		realizarSaque(contaEspecial, 50);
		
		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);
		
		
		
	}
		public static void realizarSaque(ContaBancaria conta, double valor) {
			
			if(conta.sacar(valor)) {
				System.out.println("Saque efetuado com sucesso, novo saldo de "+ conta.getSaldo());
			}else {
				System.out.println("Saldo insuficiente para sacar "+valor+" saldo: "+ conta.getSaldo());
			}
			
		}

}
