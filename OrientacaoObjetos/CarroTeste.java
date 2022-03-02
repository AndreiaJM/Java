package OrientacaoObjetos;

public class CarroTeste {
	
	public static void main(String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-24
		
		Carro van = new Carro();
		Carro fusca = new Carro();
		
		van.marca="Fiat";
		van.modelo="Ducato";
		van.numPassageiros=10;
		van.capCombustivel=100;
		van.consCombustivel=0.2;
		
		fusca.marca="Volkswagen";
		fusca.modelo="Fusca";
		fusca.numPassageiros=4;
		fusca.capCombustivel=30;
		fusca.consCombustivel=0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		System.out.println();
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		
		
	}

}
