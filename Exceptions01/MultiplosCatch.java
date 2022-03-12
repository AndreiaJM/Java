package Exceptions01;

public class MultiplosCatch {
	
	public static void main(String args[]) {
		
		/*Try
		 * catch
		 * Throwable ->captura de exceção generica, superclasse das classes de erros e exceções
		 * 
		 * */
		
		int[] numeros ={4,8,16,32,64,128};
		int[] demon ={2,0,4,8,0};
		
		for(int i=0;i<numeros.length;i++) {
			
			try {
				System.out.println(numeros[i]+"/"+demon[i]+"="+(numeros[i]/demon[i]));
			}catch(ArithmeticException e) {
				System.out.println("Erro ao dividir por zero (Primeira exceção capturada)");
			}catch(Throwable e) {
				System.out.println("Posição do array invalida, Segunda exceção capturada "+e);
			}
			
		}
		
		/*A ordem da exceção declarada é a ordem da exceção capturada.
		 * A exeção expecifica deve vir antes da generica (Throwable)
		 * */
		//apos a captura do erro o programa continuou sendo executado;
		
	}

}
