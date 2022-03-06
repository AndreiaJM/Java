package Recursividade;

public class Calculadora {
	
	//Método fatorial recursivo
	
	public static int fatorialRecursivo(int num) {
		
		if(num==0) {
			return 1;
		}
		
		return num*fatorialRecursivo(num-1);
	}
	
	public static int fibonacci(int num) {
		
		if(num<2) {
			return 1;
		}
		
		return fibonacci(num-1) + fibonacci(num-2);
	}
	
	public static int soma(int num) {
		
		if(num==1) {
			return 1;
		}
		
		return num+soma(num-1);
	}

}
