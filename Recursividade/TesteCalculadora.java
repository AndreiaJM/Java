package Recursividade;

public class TesteCalculadora {
	
	public static void main(String[] args) {
		
		int fatorial = Calculadora.fatorialRecursivo(5);
		System.out.println(fatorial);
		
		System.out.println();
		
		for(int i=0;i<10;i++) {
			System.out.print(Calculadora.fibonacci(i)+" ");
		}
		
		System.out.println();
		System.out.println(Calculadora.soma(5));
		
		
	}
	
	

}
