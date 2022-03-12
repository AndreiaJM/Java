package AgendaJava;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-47-a-52
		
		Scanner scan = new Scanner (System.in);
		
		Agenda agenda = new Agenda();
		
		int opcao=1;
		
		while(opcao!=3) {
		 opcao = obterOpcaoMenu(scan);
		 
		 if(opcao==1) {
				consultarContato(scan, agenda);
			}else if(opcao==2){
				adicionarContato(scan, agenda);
			}
		}
		/*if(opcao==1){
			System.exit(0);//Termina o programa
			//Nao é boa pratica, usado apenas em sistemas de exemplo
		}*/
		
		

	}
	
	public static void consultarContato(Scanner scan, Agenda agenda) {
		
		String nomeContato = lerInformacaoString(scan, "Entre com o nome do contato a ser pesquisado");
		try {
			if(agenda.consultaContatoPorNome(nomeContato)>=0) {
				System.out.println("Contato existe");
			}
		} catch (ContatoNaoExisteException e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		
		try {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacaoString(scan, "Entre com o nome do contato");
		String telefone = lerInformacaoString(scan, "Entre com o numero do contato");
		String email = lerInformacaoString(scan, "Entre com o email do contato");
		
		Contato contato = new Contato();
		
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setNome(nome);
		
		System.out.println("Contato a ser criado");
		System.out.println(contato);
		
		
		agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			
			System.out.println("Contatos da agenda: ");
			System.out.println(agenda);
		}
	}
	
	public static String lerInformacaoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}
	
	public static int obterOpcaoMenu(Scanner scan) {
		
		int opcao=3;
		boolean entradaValida = false;
		
		while(!entradaValida) {
		System.out.println("Digite a opção desejada: ");
		System.out.println("1 - Consultar contato"+"\n");
		System.out.println("2 - Adicionar Contato"+"\n");
		System.out.println("3 - Sair");
		
		try {
			String entrada = scan.nextLine();
			opcao = Integer.parseInt(entrada);
			
			if(opcao==1 || opcao==2 ||opcao==3 ) {
				
				entradaValida=true; 
			}else {
				throw new Exception("Entrada inválida");
			}
		}catch(Exception e) {
			System.out.println("Entrada inválida, digite novamente \n");
		}
		
		}
		return opcao;
	}

}
