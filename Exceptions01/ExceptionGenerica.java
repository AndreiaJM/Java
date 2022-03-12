package Exceptions01;

public class ExceptionGenerica {
	
	public static void main(String[] args) {
		
		int[] numeros ={4,8,16,32,64,128};
		int[] demon ={2,0,4,8,0};
		
		for(int i=0;i<numeros.length;i++) {
			
			try {
				System.out.println(numeros[i]+"/"+demon[i]+"="+(numeros[i]/demon[i]));
			}catch(Exception e) {
				
				//Dessa forma obtemos as informações do erro sem parar a execusão do programa
				System.out.println(e.getMessage());//Mensagem da exceção
				e.printStackTrace();//Linha em que ocorreu a exceção
			}
			
		}
	}

}
