package Exceptions01;

public class FinallyPegadinha {
	
	public static void main(String[] args) {
		
		int[] numeros ={4,8,16,32,64,128};
		int[] demon ={2,0,4,8,0};
		
		for(int i=0;i<numeros.length;i++) {
			
			try {
				System.out.println(numeros[i]+"/"+demon[i]+"="+(numeros[i]/demon[i]));
			}catch(ArithmeticException e) {
				System.out.println("Erro ao dividir por zero (Primeira exce��o capturada)");
				System.exit(0); //ENCERRA O PROGRAMA E O FINALLY N�O � EXCUTADO
			}catch(Throwable e) {
				System.out.println("Posi��o do array invalida, Segunda exce��o capturada ");
				System.exit(0);
				//O finally sempre � executado
			}finally { 
				System.out.println("Essa linha sempre � impressa depois do try E do catch");
			}
			
		}
	}

}
