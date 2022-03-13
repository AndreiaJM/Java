package Varargs;

public class ExemplosVarargs {
	
	public static void main(String[] args) {
		
		System.out.println(soma(2,2));
		System.out.println(soma(2,2,2));
		
		int [] vetor = {1,2,3,4,5};
		System.out.println(soma(vetor)); //metodo recebendo vetor
		
		/*A parti do java 5 foi adicionado o Varargs*/
		//Não é nescessario a criação do vetor utilizando varargs
		System.out.println(soma(1,2,3,4,5,6,7,8));
		
		
	}
	
	static int soma(int a, int b) {
		return a+b;
	}
	
	static int soma(int a, int b,int c) {
		return a+b+c;
	}
	
	static int soma(int[] vetor) { //metodo que recebe vetor como parametro pode receber infinitos numeros
		
		int total = 0;
		
		for(int i=0;i<vetor.length;i++) {
			total+=vetor[i];
		}
		
		return total;
	}
	
	//precisa ser tipo objeto, ... -> indica infinitos numeros + nome da variavel
	//O varargs deve ser o ultimo dos parametros ex(int a, int b, Integer... vetor)
		static int soma(Integer... vetor) { 
		
		int total = 0;
		
		for(int i=0;i<vetor.length;i++) {
			total+=vetor[i];
		}
		
		return total;
	}

}
