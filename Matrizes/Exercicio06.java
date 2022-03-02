package Matrizes;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner scan = new Scanner(System.in);
		int l, c,jog;
		String ganhou="";
		boolean ganhador=false;
		int jogador=1;
		char sinal;
		
		String[][] jogo = new String[3][3];
		
		while(!ganhador) {
			
			if(jogador%2==0) {
				
				System.out.println("Vez do jogador 1, escolha uma linha e coluna ");
				sinal='X';
			}else {
				System.out.println("Vez do jogador 2, escolha uma linha e coluna ");
				sinal='O';
			}
			
		}
		
		
		System.out.println("Jogador 1 ou 2?");
		jog = scan.nextInt();
		
		if(jog==1) {
		
		System.out.println("Jogador: 1");
		System.out.println("Digite o numero da linha: ");
		l = scan.nextInt();
		System.out.println("Digite o numero da coluna: ");
		c = scan.nextInt();
		jogo[l][c]="X";
		
		if(jogo[0][0]=="X" && jogo[0][1]=="X" && jogo[0][2]=="X"
				|| jogo[1][0]=="X" && jogo[1][1]=="X" && jogo[1][2]=="X"
				|| jogo[2][0]=="X" && jogo[2][1]=="X" && jogo[2][2]=="X"
				|| jogo[0][0]=="X" && jogo[1][0]=="X" && jogo[2][0]=="X"
				|| jogo[0][1]=="X" && jogo[1][1]=="X" && jogo[2][1]=="X"
				|| jogo[0][2]=="X" && jogo[1][2]=="X" && jogo[2][2]=="X"
				|| jogo[0][0]=="X" && jogo[1][1]=="X" && jogo[2][2]=="X") {
			
			ganhou = "Jogador 1 ganhou";
			
			ganhador=true;
			
		}else {
			ganhador=false;
		}
		
		}else if(jog==2) {
			
			System.out.println("Jogador: 1");
			System.out.println("Digite o numero da linha: ");
			l = scan.nextInt();
			System.out.println("Digite o numero da coluna: ");
			c = scan.nextInt();
			jogo[l][c]="O";
			
			if(jogo[0][0]=="O" && jogo[0][1]=="O" && jogo[0][2]=="O"
					|| jogo[1][0]=="O" && jogo[1][1]=="O" && jogo[1][2]=="O"
					|| jogo[2][0]=="O" && jogo[2][1]=="O" && jogo[2][2]=="O"
					|| jogo[0][0]=="O" && jogo[1][0]=="O" && jogo[2][0]=="O"
					|| jogo[0][1]=="O" && jogo[1][1]=="O" && jogo[2][1]=="O"
					|| jogo[0][2]=="O" && jogo[1][2]=="O" && jogo[2][2]=="O"
					|| jogo[0][0]=="O" && jogo[1][1]=="O" && jogo[2][2]=="O"
					|| jogo[2][2]=="O" && jogo[1][1]=="O" && jogo[2][0]=="O") {
				
				ganhou = "Jogador 2 ganhou";
				ganhador = true;
			}else {
				ganhador=false;
			}
		
		}
	}

}
