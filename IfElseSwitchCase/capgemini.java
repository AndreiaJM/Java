package IfElseSwitchCase;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class capgemini {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String senha="";
		boolean achouNumero;
		
		System.out.println("Digite uma sennha para cadastro:");
		senha = scan.nextLine();
		
		if(senha.length()<6) {
			System.out.println("A senha deve conter no minimo 6 caracteres");
		}else {
			for (char c : senha.toCharArray()) {
		         if (c >= '0' && c <= '9') {
		             achouNumero = true;
		             System.out.print(achouNumero);
		}
		         
	}
			
}
	}
}
