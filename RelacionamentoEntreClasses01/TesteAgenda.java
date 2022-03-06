package RelacionamentoEntreClasses01;

import java.util.Scanner;

public class TesteAgenda {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
		
		
		System.out.println("Entre com o nome da agenda: ");
		String nomeAgenda = scan.nextLine();
		
		agenda.setNome(nomeAgenda);
		
		Contato[] contatos = new Contato[3];
		
			for(int i=0;i<contatos.length;i++) {
			System.out.println("Entre com as informações do contato "+ (i+1));
			
			Contato c = new Contato();
			
			System.out.println("Entre com o nome: ");
			String nome = scan.nextLine();
			c.setNome(nome);
			System.out.println("Entre com o telefone: ");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			System.out.println("Entre com o e-mail: ");
			String email = scan.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
			
			agenda.setContatos(contatos);
			
			if(agenda!=null) {
				System.out.println(agenda.obterInfo());
			}
			
		
	}

}
