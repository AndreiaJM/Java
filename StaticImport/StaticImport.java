package StaticImport;

//Import static para não precisar colocar o nome da classe no metodo estatico
import static java.lang.Math.pow;//modificador de acesso static Math.pow
import static java.lang.Math.sqrt;

// import static java.lang.Math.*; import de todos os metodos
public class StaticImport {
	
	public static void main(String[] args) {
		
		double a =2;
		double b = 3;
		double c = 4;
		
		System.out.println(Math.pow(a, b));
		
		System.out.println(Math.sqrt(c));
		
		System.out.println();
		
		//para muitos usos do mesmo metodo estatico
		System.out.println(pow(a, b));
		
		System.out.println(sqrt(c));
	}

}
