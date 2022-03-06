package OrientaçãoObjetos04;

import java.util.Scanner;

public class JogoDaVelhaTeste {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		
		System.out.println("Jogador 1 =X");
		System.out.println("Jogador 2 =O");
		
		boolean ganhou =false;
		char sinal;
		int linha =0, coluna=0;
		
		while(!ganhou) {
			
			if(jogoDaVelha.vezJogador1()) { //JOGADOR 1
				System.out.println("Vez do jogador 1, escolha linha e coluna (1-3)");
				sinal='X';
			}else {//JOGADOR 2
				System.out.println("Vez do jogador 2, escolha linha e coluna (1-3)");
				sinal='O';
			}
			
		}
	}

}
