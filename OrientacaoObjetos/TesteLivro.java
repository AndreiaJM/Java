package OrientacaoObjetos;

public class TesteLivro {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-24
		
		
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		
		l1.nome="Memórias Postumas";
		l1.tipo="literatura";
		l1.autor="Machado de Assis";
		l1.editora="Saraiva";
				
		l2.nome="O mistério da casa verde";
		l2.tipo="Suspense";
		l2.autor="Moacyr Scliar";
		l2.editora="Atica";
		
		System.out.println(l1.autor);
		System.out.println(l1.nome);
		System.out.println();
		System.out.println(l2.nome);
		System.out.println(l2.editora);
	}

}
