package EntradaSaidaDados;

import java.util.Scanner;

public class Exercicio13 {
	
public static void main (String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
		/*Fa�a um programa que pergunte quanto voc� ganha por hora e o numero de horas trabalhadas no m�s,
		 * sabendo que s�o desontados 11% para seu imposto de renda, 8% para o seu inss e 5% para seu sindicato 
		 * fa�a um programa que nos d�: 
		 *1) quanto pagou ao inss
		 * 2) quanto pagou ao sindicato
		 * 3) o salario liquido
		 *   
		 * */
	
		float salarioHora, trabalhouHora, salarioBruto, salarioLiquido ,impostoRenda, inss, sindicato ;
		Scanner input = new Scanner(System.in);
	
		
	
		System.out.println("Digite quanto voc� ganha por hora? ");
		salarioHora = input.nextFloat();
		System.out.println("Digite quantoas horas trabalhou no m�s: ");
		trabalhouHora = input.nextFloat();
		
		salarioBruto = salarioHora * trabalhouHora;
		inss = ((salarioBruto/100)*8);
		impostoRenda =((salarioBruto/100)*11);
		sindicato= ((salarioBruto/100)*5);
		
		salarioLiquido = (salarioBruto - inss - impostoRenda - sindicato);
		
		System.out.println("Voc� pagou "+ inss + " para o inss");
		System.out.println("Voc� pagou "+ sindicato + " para o sindicato");
		System.out.println("Seu salario liquido � de "+ salarioLiquido);
		




}

}
