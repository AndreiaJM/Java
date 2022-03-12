package Exceptions01;

public class Finally {
	
	public static void main(String[] args) {
		
		int[] numeros ={4,8,16,32,64,128};
		int[] demon ={2,0,4,8,0};
		
		for(int i=0;i<numeros.length;i++) {
			
			try {
				System.out.println(numeros[i]+"/"+demon[i]+"="+(numeros[i]/demon[i]));
			}catch(ArithmeticException e) {
				System.out.println("Erro ao dividir por zero (Primeira exce��o capturada)");
			}catch(Throwable e) {
				System.out.println("Posi��o do array invalida, Segunda exce��o capturada "+e);
				//O finally sempre � executado
			}finally { 
				System.out.println("Essa linha sempre � impressa depois do try ou do catch");
			}
			
		}
	}

}
