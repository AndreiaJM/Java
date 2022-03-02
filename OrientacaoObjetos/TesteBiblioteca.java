package OrientacaoObjetos;

public class TesteBiblioteca {
	
	public static void main(String args[]) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-24
		
		LivroBiblioteca livro1 = new LivroBiblioteca();
		LivroBiblioteca livro2 = new LivroBiblioteca();
		
		livro1.nome="Malala";
		livro1.emprestado=true;
		livro1.disponível=false;
		
		livro2.nome="Gotico Nodestino";
		livro2.emprestado=false;
		livro2.disponível=true;
		
		System.out.println(livro1.nome);
		System.out.println("Emprestado: "+livro1.emprestado);
		System.out.println();
		System.out.println(livro2.nome);
		System.out.println("Emprestado: "+livro2.emprestado);
	}

}
