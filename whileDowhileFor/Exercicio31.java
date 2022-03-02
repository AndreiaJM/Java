package whileDowhileFor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {
	
	public static void main(String[] args) {
		
		//https://loiane.com/2015/02/curso-java-basico-correcao-exercicios-aula-15-if-else-e-switch-case/
		
		Scanner scan = new Scanner(System.in);
		Double salario=1000.0;
		Double perc=1.5;
		int hoje=2022;
		
		DecimalFormat format = new DecimalFormat("###,###.###");
		
		salario+=(salario/100)*1.5;
		
		for(int i=1997;i<=hoje;i++) {
			
			perc*=2;
			salario+=(salario/100)*perc;
			
			System.out.println("No ano de "+ i+ " teve um aumento de: "+perc+" e o salario foi de: "+format.format(salario));
		}
		
		
		
	}

}
