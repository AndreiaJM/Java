package Wrappers02;

public class TesteAutoboxing {
	
	public static void main(String[] args) {
		
		/*Autoboxing e Unboxing é o processo de transformar um tipo primitivo em 
		 * tipo objeto e vice versa
		 * */
		
		//Autoboxing
		Short num7 = 1;//new Short((short) 1);
		Byte num8 = 10;//new Byte((byte) 10);
		Integer num9 = 100; //new Integer( 100);
		Long num10 = 10000l; //new Long(10000l);
		
		Float num11 = 3.5f; //new Float(3.5f);
		Double num12 = 3.5555; //new Double(3.5555);
		Boolean flag2 = true; //new Boolean(true);
		Character d = 'b'; //new Character('b');
		
		//Auto Unboxing
		int num13 = num9; //Tipo classe(num9) transformada em tipo primitivo
		//num9.intValue(); //AutoUnboxing
		
		//Autoboxing em expressões: 
		num9++; //tipo Integer
		System.out.println(num9);
		
		//auto unboxing num9(tipo Integer) -> autoboxing num13/num9 -> num14 
		Integer num14 = num13/num9;
		
		//mau uso
		//Quando trabalhamos com expressões é melhor usar somente os tipos primitivos
		
		Double a, b, c;
		
		a=10.0;
		b=12.2;
		c=4.7;
		
		Double media = (a+b+b)/3;
		System.out.println(media);
		
		
	}

}
