package Enum01;

public class Teste {
	
	public static void main(String[] args) {
		
		
		usandoConstantes();
		
		System.out.println();
		
		usandoEnum();
		
	}
	
	private static void usandoConstantes() {
		
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("Teste utilizando constantes no java");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	
	private static void imprimeDiaSemana(int dia) {
		switch(dia) {
		case 1: System.out.println("Segunda-feira");
		break;
		case 2: System.out.println("Terça-feira");
		break;
		case 3: System.out.println("Quarta-feira");
		break;
		case 4: System.out.println("Quinta-feira");
		break;
		case 5: System.out.println("Sexta-feira");
		break;
		case 6: System.out.println("Sabado-feira");
		break;
		case 7: System.out.println("Domingo-feira");
		break;
		}
	}
	
	//A vantagem de se usar Enum esta no controle do código de forma
	//  que limita valores que precisam ser especificos como segunda a sexta
	
	private static void usandoEnum() {
		//para declarar um Enum é iniciado com o tipo do enum
		
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("Teste utilizando Enum no java");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	
	private static void imprimeDiaSemana(DiaSemana dia) {
		switch(dia) {
		case SEGUNDA: System.out.println("Segunda-feira");
		break;
		case TERCA: System.out.println("Terça-feira");
		break;
		case QUARTA: System.out.println("Quarta-feira");
		break;
		case QUINTA: System.out.println("Quinta-feira");
		break;
		case SEXTA: System.out.println("Sexta-feira");
		break;
		case SABADO: System.out.println("Sabado-feira");
		break;
		case DOMINGO: System.out.println("Domingo-feira");
		break;
		}
	}

}
