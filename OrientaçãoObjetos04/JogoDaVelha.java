package OrientaçãoObjetos04;

public class JogoDaVelha {
	
	int[][] jogo = new int[3][3];
	int jogada=1;
	
	boolean validarJogada(int linha, int coluna, char sinal) {
		
		if(jogo[linha][coluna]==sinal || jogo[linha][coluna]=='O') {
			return false;
		}else {
			jogo[linha][coluna]=sinal;
			jogada++;
			return true;
		}
	}
	
	void imprimirTabuleiro() {
		for(int i=0;i<jogo.length;i++) {
			System.out.println();
			for(int j=0;j<jogo[i].length;j++) {
				System.out.print("["+jogo[i][j]+ "]"); 
			}
		}
	}
	
	boolean verificarGanhador(char sinal) {
		if((jogo[0][0]==sinal && jogo[0][1]==sinal && jogo[0][2]==sinal
				|| jogo[1][0]==sinal && jogo[1][1]==sinal && jogo[1][2]==sinal
				|| jogo[2][0]==sinal && jogo[2][1]==sinal && jogo[2][2]==sinal
				|| jogo[0][0]==sinal && jogo[1][0]==sinal && jogo[2][0]==sinal
				|| jogo[0][1]==sinal && jogo[1][1]==sinal && jogo[2][1]==sinal
				|| jogo[0][2]==sinal && jogo[1][2]==sinal && jogo[2][2]==sinal
				|| jogo[0][2]==sinal && jogo[1][1]==sinal && jogo[2][0]==sinal
				|| jogo[0][0]==sinal && jogo[1][1]==sinal && jogo[2][2]==sinal)) {
			return true;
			
		}
		return false;
		
	}
	
	boolean vezJogador1() {
		
		if(jogada%2==1) {
			return true;
		}
			return false;
	}
}
