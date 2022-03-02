package whileDowhileFor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio32 {
	
	public static void main(String[] args) {
		
		//https://loiane.com/2015/02/curso-java-basico-correcao-exercicios-aula-15-if-else-e-switch-case/
		
		Scanner scan = new Scanner(System.in);
		/*	boolean continuar=true;
		int cod, qtd;
		String produto="";
		Double preco, total=0.0, totalconta=0.0;
		
		do {
			
			System.out.println("Digite o codigo do produto e a quantidade ou digite 0 0 para sair: ");
			cod = scan.nextInt();
			qtd = scan.nextInt();
			
			if(cod==0 ||qtd==0) {
				continuar=false;
				System.out.println("Total a pagar: "+ totalconta);
			}
			
			if(cod==100){
				produto="cachorro quente";
				preco=1.20;
				total=preco*qtd;
			}else if(cod==101){
				produto="Bauru Simples";
				preco=1.30;
				total=preco*qtd;
			}else if(cod==102){
				produto="Bauru com ovo";
				preco=1.50;
				total=preco*qtd;
			}else if(cod==103){
				produto="Hamburguer";
				preco=1.20;
				total=preco*qtd;
			}else if(cod==104){
				produto="Cheeseburguer";
				preco=1.30;
				total=preco*qtd;
			}else if(cod==105){
				produto="Refrigerante";
				preco=1.00;
				total=preco*qtd;
			}
			
			totalconta+=total;
			
			System.out.println(produto+" "+cod+" "+qtd+ " "+total);
			
		}while(continuar); */
		
		
		
		boolean continuar=true;
		int cod, qtd;
		String conta="";
		Double total=0.0, soma=0.0;
		
		do {
			
			System.out.println("Digite o codigo do produto e a quantidade ou digite 0 0 para sair: ");
			cod = scan.nextInt();
			qtd = scan.nextInt();
			
			if(cod==0 || qtd==0) {
				continuar=false;
				
				System.out.println(conta);
				System.out.println("Total da conta: "+soma);
			}
			
			switch(cod) {
			
			case 100: 
				conta+="Cachorro quente 1,20 " + qtd;
				conta+=" = "+(1.20*qtd)+"\n"; 
				soma+=(1.20*qtd);break;
			case 101: 
				conta+="Bauru simples 1,30 " + qtd;
				conta+=" = "+(1.30*qtd)+"\n";
				soma+=(1.20*qtd);break;
			case 102: 
				conta+="Bauru com ovo 1,50 " + qtd;
				conta+=" = "+(1.50*qtd)+"\n";
				soma+=(1.20*qtd);break;
			case 103: 
				conta+="Hamburguer 1,20 " + qtd;
				conta+=" = "+(1.20*qtd)+"\n";
				soma+=(1.20*qtd);break;
			case 104: 
				conta+="Cheeseburguer 1,30 " + qtd;
				conta+=" = "+(1.30*qtd)+"\n";
				soma+=(1.20*qtd);break;
			case 105: 
				conta+="Refrigerante 1,00 " + qtd;
				conta+=" = "+(1.00*qtd)+"\n";
				soma+=(1.20*qtd);break;
			}
			
		}while(continuar);
		
		
		
	}

}
