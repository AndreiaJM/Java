package HerancaePolimorfismo03;

public class Teste {
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
	
	public static void main(String[] args) {
		
		System.out.println("******Jardim**Zoologico******");
		System.out.println();
		
		//camelo, tubarão, urso do canada
		
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setPatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		Mamifero UrsoDoCanada = new Mamifero();
		UrsoDoCanada.setNome("Urso-do-Canada");
		UrsoDoCanada.setComprimento(180);
		UrsoDoCanada.setPatas(4);
		UrsoDoCanada.setCor("Vermelho");
		UrsoDoCanada.setVelocidade(0.5);
		UrsoDoCanada.setAlimento("Mel");
		
		Animal[] animais = new Animal[3];
		
		animais[0]=camelo;
		animais[1]= tubarao;
		animais[2]=UrsoDoCanada;
		
		for(int i=0;i<animais.length;i++) {
			System.out.println(animais[i]+"\n");
			System.out.println("-----------------");
		}
		
		
	}

}
