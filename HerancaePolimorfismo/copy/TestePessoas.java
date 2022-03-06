package HerancaePolimorfismo.copy;

import java.util.Scanner;

public class TestePessoas {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa: ");
		String nomePessoa = scan.next();
		System.out.println("Digite a idade da pessoa: ");
		String idadePessoa = scan.next();
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome(nomePessoa);
		pessoa1.setIdade(idadePessoa);
		
		Contato[] contatos = new Contato[3];
		

		for(int i=0;i<contatos.length;i++) {
			System.out.println("Entre com as informações do contato "+ (i+1));
			
			Contato c = new Contato();
			
			System.out.println("Digite o nome: ");
			String nomeContato = scan.next();
			c.setNome(nomeContato);
			System.out.println("Digite a idade: ");
			String emailContato = scan.next();
			c.setEmail(emailContato);
			System.out.println("Digite o e-mail: ");
			String telefoneContato = scan.next();
			c.setTelefone(telefoneContato);
			
			contatos[i] = c;
			
		}
		
		pessoa1.setContatos(contatos);
		
		System.out.println(pessoa1);
		
		
		
		
		
	}

}
