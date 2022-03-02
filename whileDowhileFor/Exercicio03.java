package whileDowhileFor;

import java.util.Scanner;

public class Exercicio03 {
	
	//https://loiane.com/2015/02/curso-java-basico-correcao-exercicios-aula-15-if-else-e-switch-case/
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		boolean valida = false;
		String nome="", estado="",sexo="", genero = null,estadociv = null;
		int idade=0;
		Double salario=0.0;
		
		do {
			
			System.out.println("Digite o seu nome");
			nome = scan.nextLine();
			if(nome.length()<0 || nome.length()<=3 ) {
				valida=true;
				System.out.println("Nome deve conter mais que 3 caracteres");
			
			}else {
				valida=false;
			}
			
		}while(valida==true);
		
		valida = false;
		
		do {
			
			System.out.println("Digite o sua idade");
			idade = scan.nextInt();
			if(idade>150) {
				valida=true;
				System.out.println("Idade inválida");
			}else {
				valida=false;
			}
			
		}while(valida==true);
		
		valida = false;
		
		do {
			
			System.out.println("Digite o seu salario");
			salario = scan.nextDouble();
			if(salario<0) {
				valida=true;
				System.out.println("Salario deve ser positivo");
			}else {
				valida=false;
			}
			
		}while(valida==true);
		
		valida = false;
		
		do {
			
			System.out.println("Qual sexo digite f para feminino e m para masculino ");
			sexo = scan.next();
			if(sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("m")) {
				valida=true;
				
				if(sexo.equalsIgnoreCase("f")) {
					genero="feminino";
				}else if(sexo.equalsIgnoreCase("m")) {
					genero="masculino";
				}
			}else {
				System.out.println("Valor indevido, tente novamente");
			}
			
		}while(!valida);
		
		valida = false;
		
		do {
			
			System.out.println("Estado civil, digite s para solteiro, c para casado, v para viuvo, d para divorciado ");
			estado = scan.next();
			if(estado.equalsIgnoreCase("s")|| 
					estado.equalsIgnoreCase("c")||
					estado.equalsIgnoreCase("v")|| 
					estado.equalsIgnoreCase("d")) {
				valida=true;
				
				if(estado.equalsIgnoreCase("s")) {
					estadociv="Solteiro";
				}else if(estado.equalsIgnoreCase("c")) {
					estadociv="Casado";
				}else if(estado.equalsIgnoreCase("v")) {
					estadociv="Viuvo";
				}else if(estado.equalsIgnoreCase("d")) {
					estadociv="divorciado";
				}
				
			}else {
				System.out.println("Valor indevido, tente novamente");
			}
			
		}while(!valida);
		
		System.out.println("Dados: ");
		System.out.println("Nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("salario: "+salario);
		System.out.println("genero: "+genero);
		System.out.println("Estado civil: "+estadociv);
		
	}	

}
