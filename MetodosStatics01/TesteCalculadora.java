package MetodosStatics01;

import java.util.Scanner;

public class TesteCalculadora {
	
	public static void main(String[] args) {
		
		System.out.println(Calculadora.somar(2, 2));
		System.out.println(Calculadora.subtrair(2, 1));
		System.out.println(Calculadora.multiplica(2, 3));
		System.out.println(Calculadora.dividir(4, 2));
		System.out.println(Calculadora.potencia(2, 3));
		
		
		Scanner scan = new Scanner(System.in);
		int num=0;
		
		do {
			
			System.out.println("Digite um numero positivo: ");
			num = scan.nextInt();
			if(num<0) {
				System.out.println("Numero invalido, tente novamente!");
			}
			
		}while(num<0);
		
		System.out.println(Calculadora.fatorial(num));
	}

}
