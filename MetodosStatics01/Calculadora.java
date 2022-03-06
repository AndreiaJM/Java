package MetodosStatics01;

public class Calculadora {
	
	public static int somar(int n1, int n2) {
		return n1+n2;
	}
	
	public static int subtrair(int n1, int n2) {
		return n1-n2;
	}
	
	public static int multiplica(int n1, int n2) {
		return n1*n2;
	}
	
	public static double dividir(double n1, double n2) {
		return n1/n2;
	}
	
	public static int potencia(int n1, int n2) {
		
		int total=1;
		
		for(int i=1;i<=n2;i++) {
			total*=n1;
		}
		return total;
	}
	
	public static int fatorial(int num) {
		
		if(num==1) {
			return 1;
		}
		int total=1;
		
		for(int i=num;i>1;i--) {
			total*=i;
		}
		return total;
	}


}
