package OrientacaoObjetos06;

public class TesteLivraria {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-24
		
		LivroLivraria livro1 = new LivroLivraria();
		LivroLivraria livro2 = new LivroLivraria();
		
		livro1.nome="A megera Domada";
		livro1.autor="William Shakespeare";
		livro1.preco=15.00;
		livro1.estoque=true;
		
		livro2.nome="Entrevista com vampiro";
		livro2.autor="Anne Rice";
		livro2.preco=10.00;
		livro2.estoque=false;
		
		System.out.println(livro1.nome);
		System.out.println(livro1.preco);
		System.out.println();
		System.out.println(livro2.nome);
		System.out.println(livro2.autor);
		
		
	}

}
