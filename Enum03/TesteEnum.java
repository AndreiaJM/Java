package Enum03;

import Enum01.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		/***Obtendo os valores do enumerador***/
		
		//Enum � como se fosse uma cole��o de constantes
		
		//values() retona um arrays de todos os valores dentro do Enum
		DiaSemana[] dias = DiaSemana.values();
		
		for(int i=0;i<dias.length;i++) {
			System.out.println(dias[i]);
		}
		
		System.out.println();
		
		for(DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}
	}

}
