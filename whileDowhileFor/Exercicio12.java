package whileDowhileFor;

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int num, result;
		
		System.out.println("Informe o numero da tabuada que deseja: ");
		num = scan.nextInt();
		
		for(int i=0;i<=10;i++) {
			result = num*i;
			System.out.println(num+"*"+i+"="+result);
			
		}
	}

}
