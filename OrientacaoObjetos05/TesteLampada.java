package OrientacaoObjetos05;

public class TesteLampada {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-24
		
		Lampada l1 = new Lampada();
		Lampada l2 = new Lampada();
		
		l1.tipo="LED";
		l1.corLuz="Branca";
		l1.voltagem="bivolt";
		l1.formato="Tradicional";
		l1.potencia=9;
		
		l2.tipo="Luminatti ";
		l2.corLuz="Amarela";
		l2.voltagem="bivolt";
		l2.formato="Bolinha ";
		l2.potencia=4;
		
		System.out.println(l1.corLuz);
		System.out.println(l1.formato);
		System.out.println();
		System.out.println(l2.corLuz);
		System.out.println(l2.formato);
		
	}

}
