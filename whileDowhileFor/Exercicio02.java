package whileDowhileFor;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		//https://loiane.com/2015/02/curso-java-basico-correcao-exercicios-aula-15-if-else-e-switch-case/
		
		Scanner scan =new Scanner(System.in);
		String usuario, senha;
		boolean inforValids=false;
		
		/*System.out.println("Digite seu usuario:");
		usuario = scan.nextLine();
		System.out.println("Digite a sua senha:");
		senha = scan.nextLine();
		
			//comparando strings
			while(usuario.matches(senha)) {
				System.out.println("Usuario não pode ser igual a senha, tente novamente");
				System.out.println("Digite seu usuario:");
				usuario = scan.nextLine();
				System.out.println("Digite a sua senha:");
				senha = scan.nextLine();
			}
		
			System.out.println("Logado com sucesso");*/
		
			do {
				
				System.out.println("Digite seu usuario:");
				usuario = scan.nextLine();
				System.out.println("Digite a sua senha:");
				senha = scan.nextLine();
				
				if(usuario.matches(senha)) {
					inforValids=true;
					System.out.println("Dados invalidos, tente novamente");
				}else {
					inforValids=false;
					System.out.println("Logado com sucesso");
				}
				
			}while(inforValids==true);
		
		}
		
	}


