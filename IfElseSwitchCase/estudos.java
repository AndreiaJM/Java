package IfElseSwitchCase;

import java.util.Scanner;

public class estudos {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int perRenda;
		
		System.out.println("Quanto ganha por hora?");
		Double salHora = scan.nextDouble();
		System.out.println("Quantas horas trabalhou no mês?");
		Double horaTra = scan.nextDouble();
		
		Double salBru = salHora*horaTra;
		
		if(salBru<900) {
			perRenda=0;
		}else if(salBru<1500) {
			perRenda=5;
		}else if(salBru<2500) {
			perRenda=10;
		}else{
			perRenda=20;
		}
		
		Double iRenda = salBru/100*perRenda;
		Double inss = salBru/100*10;
		Double fgts = salBru/100*11;
		Double totalDesc = iRenda+inss;
		Double salaLiqui = salBru - totalDesc;
		
		
		System.out.println("Salario Bruto:( "+salHora +"*"+horaTra+") :R$ "+salBru);
		System.out.println("IR( "+perRenda+"%) :R$ "+iRenda );
		System.out.println("INSS (10%)"+") :R$ "+inss);
		System.out.println("FGTS (11%)"+") :R$ "+fgts);
		System.out.println("TOTAL DE DESCONTOS :R$ "+ totalDesc);
		System.out.println("SALARIO LIQUIDO :R$ "+ salaLiqui);
	}

}
