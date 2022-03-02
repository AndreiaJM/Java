package whileDowhileFor;

import java.util.Scanner;

public class Exercicio27 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		
		Scanner scan = new Scanner(System.in);
		int cont=0;
		Double temp,soma=0.0;
		Double maior = Double.MIN_VALUE;
		Double menor = Double.MAX_VALUE;
		
		System.out.println("Digite 0 para terminar");
		
		do {
			cont++;
			System.out.println("Digite a temperatura "+cont+":");
			temp = scan.nextDouble();
			
			if(temp<menor) {
				menor=temp;
			}else if(temp>maior){
				maior=temp;
			}
			
			soma+=temp;
			
		}while(temp==0);
		
		System.out.println("Maior temperatura: "+maior);
		System.out.println("Menor temperatua: "+ menor);
		System.out.println("Media de temperatura: "+ soma/cont);
		
		
	}

}
