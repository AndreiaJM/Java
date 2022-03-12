package Exceptions01;

public class MultiplosCatchJava7 {

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
				//colocar as exce��es de mesma familia juntas no catch apenas a partir do java 7
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) { 
				System.out.println("Erro ao dividir por zero (Primeira exce��o capturada)");
			}

		}

		//apos a captura do erro o programa continuou sendo executado;

	}

}
