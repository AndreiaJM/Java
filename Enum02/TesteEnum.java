package Enum02;

public class TesteEnum {
	
	public static void main(String[] args) {
		
		//Enum extends javalangEnum
		//Podem ser comparados com == //diferente das classe que usa-se o metodo equals em compara��o
		//N�o podem ser instanciados com o new
		//Podem implementar interfaces mas n�o classes
		//
		
		DiaSemana dia = DiaSemana.SEGUNDA;
		
		//toString() neste caso chama o proprio nome do Enum;
		System.out.println(dia.toString()+" - "+dia.getValor());
		
		Data data = new Data(12,03,2022,DiaSemana.SABADO);
		
		
		
	}

}
