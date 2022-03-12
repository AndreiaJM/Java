package HerancaePolimorfismo02;

public class Teste {
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
	
	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Maria");
		p1.setRendaBruta(2000);
		p1.setCpf("25874435808");
		
		PessoaFisica p2 = new PessoaFisica();
		p2.setNome("João");
		p2.setRendaBruta(5000);
		p2.setCpf("14412897206");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Jose");
		p3.setRendaBruta(4500);
		p3.setCpf("12027931260");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Josefina");
		p4.setRendaBruta(3987);
		p4.setCnpj("86.527.901/0001-51");
		
		PessoaJuridica p5 = new PessoaJuridica();
		p5.setNome("Mario");
		p5.setRendaBruta(2876);
		p5.setCnpj("60.990.315/0001-55");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Joana");
		p6.setRendaBruta(9568);
		p6.setCnpj("14.875.878/0001-85");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		
			contribuintes[0]=p1;
			contribuintes[1]=p2;
			contribuintes[2]=p3;
			contribuintes[3]=p4;
			contribuintes[4]=p5;
			contribuintes[5]=p6;	
			
			for(int i=0;i<contribuintes.length;i++) {
				System.out.println(contribuintes[i]);
				System.out.println();
			}
	}

}
