package Matrizes;

import java.util.Scanner;

public class JogodaVelha {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner scan = new Scanner(System.in);
		
		char[][] jogo = new char[3][3];
		boolean vencedor = false;
		int jog = 1, linha=0, coluna=0, jogada=0;
		char sinal;
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		while(!vencedor) { //Looping 
			
			if(jog%2==1) { //JOGADOR 1
				System.out.println("Vez do jogador 1, escolha linha e coluna (1-3)");
				sinal='X';
			}else {//JOGADOR 2
				System.out.println("Vez do jogador 2, escolha linha e coluna (1-3)");
				sinal='O';
			}
			
			//Validando a linha
			boolean linhaValida=false;
			
			while(!linhaValida) {
				System.out.println("Ecolha a linha da jogada: 1,2 ou 3 ");
				linha = scan.nextInt();
				
				if(linha>=1 && linha<=3) {
					linhaValida=true;
				}else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			
			//Validando a coluna
			boolean colunaValida=false;
			
			while(!colunaValida) {
				System.out.println("Ecolha a coluna da jogada: 1,2 ou 3  ");
				coluna = scan.nextInt() ;
				
				if(coluna>=1 && coluna<=3) {
					colunaValida=true;
				}else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			linha--; //tirando 1 do index digitado
			coluna--;//tirando 1 do index digitado
			if(jogo[linha][coluna]=='X' || jogo[linha][coluna]=='O') {
				System.out.println("Linha ja usada, tente novamente");
			}else {
				jogo[linha][coluna]=sinal;
				jog++;
			}
			
			//tabuleiro
			for(int i=0;i<jogo.length;i++) {
				System.out.println();
				for(int j=0;j<jogo[i].length;j++) {
					System.out.print("["+jogo[i][j]+ "]"); 
				}
			}
			
			//verificar ganhador
			
			if((jogo[0][0]=='X' && jogo[0][1]=='X' && jogo[0][2]=='X'
					|| jogo[1][0]=='X' && jogo[1][1]=='X' && jogo[1][2]=='X'
					|| jogo[2][0]=='X' && jogo[2][1]=='X' && jogo[2][2]=='X'
					|| jogo[0][0]=='X' && jogo[1][0]=='X' && jogo[2][0]=='X'
					|| jogo[0][1]=='X' && jogo[1][1]=='X' && jogo[2][1]=='X'
					|| jogo[0][2]=='X' && jogo[1][2]=='X' && jogo[2][2]=='X'
					|| jogo[0][2]=='X' && jogo[1][1]=='X' && jogo[2][0]=='X'
					|| jogo[0][0]=='X' && jogo[1][1]=='X' && jogo[2][2]=='X')) {
				vencedor=true;
				System.out.println("Parabens, jogador 1 ganhou");
				
			}else if((jogo[0][0]=='O' && jogo[0][1]=='O' && jogo[0][2]=='O'
					|| jogo[1][0]=='O' && jogo[1][1]=='O' && jogo[1][2]=='O'
					|| jogo[2][0]=='O' && jogo[2][1]=='O' && jogo[2][2]=='O'
					|| jogo[0][0]=='O' && jogo[1][0]=='O' && jogo[2][0]=='O'
					|| jogo[0][1]=='O' && jogo[1][1]=='O' && jogo[2][1]=='O'
					|| jogo[0][2]=='O' && jogo[1][2]=='O' && jogo[2][2]=='O'
					|| jogo[0][2]=='O' && jogo[1][1]=='O' && jogo[2][0]=='O'
					|| jogo[0][0]=='O' && jogo[1][1]=='O' && jogo[2][2]=='O')) {
				vencedor=true;
				System.out.println();
				System.out.println("Parabens, jogador 2 ganhou");
				
			}else if(jogada>9) {
				vencedor=true;
				System.out.println("Ninguem ganhou");
			}
			System.out.println();
		}
	}

}
