package Wrappers01;

public class TesteWrappers {
	
	public static void main(String[] args) {
		
		/*Java não é 100% orientado a objeto por causas desses tipos primitivos
		 *  	
		 * */
		
		//Numeros inteiros
		short num1 = 1; //vai ate 127 //mundando outra variavel para ele pode se perder valor
		byte num2 = 10;
		int num3 = 100;
		long num4 = 1000l;
		
		//Numeros de ponto flutuante
		float num5 = 3.5f;
		double num6 = 3.55555;
		
		boolean flag = true; 
		char a = 'a'; //um caracter ou numero que a letra representa da tabela ascii
		
		/*A partir do java 5 foi implementado as classes Wrappers que representam
		 * os tipos primitivos conforme abaixo
		 * */
		
		Short num7 = new Short((short) 1); //casting
		Byte num8 = new Byte((byte) 10); //casting
		Integer num9 = new Integer( 100); //casting
		Long num10 = new Long(10000l);
		
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		//Integer num13 = new Integer("1000bbbb"); //pode disparar uma exceção pois pode ser colocado letras
		Integer num13 = new Integer("1000bbbb"); 
		//Double num14 = new Double("3,5555");//NumberFormatException
		Double num14 = new Double("3.5555");
		
		/**As classe wrapper possuem metodos que retornam valores**/
		
		
		//classe wrappers podem ser convertidas de um tipo para outro conforme abaixo: 
		
		System.out.println(num13.intValue()); //Integer passou para int
		System.out.println(num13.longValue());//Integer passou para long
		
		Long num15 = num13.longValue();//Integer atribuiu para long
		
		/*Transformar valor de String e valor numerico atraves do metodo parse: 
		 * que as  classes wrappers numericas possuem
		 * */
		
		//Dispara exeção pois não esta sendo passado numero: Integer.parseInt("b");
		
		Integer.parseInt("1000");
		Float.parseFloat("1000");
		
		double num17 = Double.parseDouble("3.555");
		System.out.println(num17);
		
		Integer num18 = Integer.valueOf(1234); //Numero vira uma instancia da classe
		System.out.println(num18);
		
		/*Só podemos comparar com == as variaveis do tipo primitivo 
		 * As wrappers não se comparam com ==
		 * */
		
		
		
		
	}

}	
