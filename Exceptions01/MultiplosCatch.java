package Exceptions01;

public class MultiplosCatch {
	
	public static void main(String args[]) {
		
		/*Try
		 * catch
		 * Throwable ->captura de exce��o generica, superclasse das classes de erros e exce��es
		 * 
		 * */
		
		int[] numeros ={4,8,16,32,64,128};
		int[] demon ={2,0,4,8,0};
		
		for(int i=0;i<numeros.length;i++) {
			
			try {
				System.out.println(numeros[i]+"/"+demon[i]+"="+(numeros[i]/demon[i]));
			}catch(ArithmeticException e) {
				System.out.println("Erro ao dividir por zero (Primeira exce��o capturada)");
			}catch(Throwable e) {
				System.out.println("Posi��o do array invalida, Segunda exce��o capturada "+e);
			}
			
		}
		
		/*A ordem da exce��o declarada � a ordem da exce��o capturada.
		 * A exe��o expecifica deve vir antes da generica (Throwable)
		 * */
		//apos a captura do erro o programa continuou sendo executado;
		
	}

}
