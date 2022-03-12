package Exceptions01;

public class FinallyPegadinha {
	
	public static void main(String[] args) {
		
		int[] numeros ={4,8,16,32,64,128};
		int[] demon ={2,0,4,8,0};
		
		for(int i=0;i<numeros.length;i++) {
			
			try {
				System.out.println(numeros[i]+"/"+demon[i]+"="+(numeros[i]/demon[i]));
			}catch(ArithmeticException e) {
				System.out.println("Erro ao dividir por zero (Primeira exceção capturada)");
				System.exit(0); //ENCERRA O PROGRAMA E O FINALLY NÃO É EXCUTADO
			}catch(Throwable e) {
				System.out.println("Posição do array invalida, Segunda exceção capturada ");
				System.exit(0);
				//O finally sempre é executado
			}finally { 
				System.out.println("Essa linha sempre é impressa depois do try E do catch");
			}
			
		}
	}

}
