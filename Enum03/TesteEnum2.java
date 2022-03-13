package Enum03;

import Enum01.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {
		
		//A superclasse Enum possue um metodo chamado valueOf();
		
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "SEGUNDA");
		
		System.out.println(dia);

	}

}
