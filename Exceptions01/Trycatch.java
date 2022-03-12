package Exceptions01;

public class Trycatch {
	
	public static void main(String[] args) {
			
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Esse texto agora sera impresso, exceção tratada "+e);
		}
		
		System.out.println("Apos tratado a exeção o programa continua rodando ");
		
		//Não tratar os erros/exeções faz com que a execução seja interrompida
		
		
		//exceção: ArrayIndexOutOfBoundsException
	}

}
