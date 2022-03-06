package OrientacaoObjetos01;

public class TesteAgenda {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-24
		
		Agenda contato1 = new Agenda();
		Agenda contato2 = new Agenda();
		
		contato1.nome="Thais";
		contato1.sobrenome="Oliveira";
		contato1.endereço="Rua fulana de tal";
		contato1.numFixo=12345678;
		contato1.numCel=912341234;
		
		contato2.nome="Jose";
		contato2.sobrenome="Silva";
		contato2.endereço="Rua fulana de tal dois";
		contato2.numFixo=12340987;
		contato2.numCel=909877890;
		
		System.out.println("Nome "+contato1.nome);
		System.out.println("Celular "+contato1.numCel);
		System.out.println();
		System.out.println("Nome "+contato2.nome);
		System.out.println("Celular "+contato2.numCel);
		System.out.println("Endereço "+contato2.endereço);
	}

}
