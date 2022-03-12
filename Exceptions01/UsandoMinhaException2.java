package Exceptions01;

public class UsandoMinhaException2 {
	
	public static void main(String[] args) {
		
		try {
			teste();
		}catch(DivisaoNaoExata e) {
			e.printStackTrace();
		}
		
		
	}
	
	//metodo throws chama a exceção customizada;
	public static void teste() throws DivisaoNaoExata {
		
		int[] numeros ={4,8,5,16,32,21,64,128};
		int[] demon ={2,0,4,8,0,2,3};
		
		for(int i=0;i<numeros.length;i++) {
			
			try {
				if(numeros[i]%2!=0) {
					//instanciando a exceção criada
					throw new DivisaoNaoExata(numeros[i],demon[i]);
				}
				System.out.println(numeros[i]+" / "+demon[i]+" = "+numeros[i]/demon[i]);
				
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Aconteceu um erro");
				e.printStackTrace();
			}
			
		}
		
	}

}
