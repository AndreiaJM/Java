package Exceptions01;

public class Trycatch {
	
	public static void main(String[] args) {
			
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Esse texto agora sera impresso, exce��o tratada "+e);
		}
		
		System.out.println("Apos tratado a exe��o o programa continua rodando ");
		
		//N�o tratar os erros/exe��es faz com que a execu��o seja interrompida
		
		
		//exce��o: ArrayIndexOutOfBoundsException
	}

}
