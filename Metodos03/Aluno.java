package Metodos03;

public class Aluno {
	
	String nome;
	String matricula;
	String curso;
	String [] diciplina = new String[3];
	double [][] nota = new double[3][4];
	
	void mostraInfo() {
		System.out.println("Nome: "+nome);
		System.out.println("Matricula: "+matricula);
		System.out.println("Curso: "+ curso);
		
		for(int i=0;i<nota.length;i++) {
			System.out.println();
			for(int j=0;j<nota[i].length;j++) {
				
				System.out.print(nota[i][j]+" ");
			}
		}
		
		
	}
		void media(int indice) {
			
			double soma=0, media=0;
		
		for(int i=0;i<nota[indice].length;i++) {
			
			soma+=nota[indice][i];
			media=soma/4;
		}
		if(media>=7) {
			System.out.println("Aluno Aprovado "+ diciplina[indice]);
		}else {
			System.out.println("Aluno reprovado em "+ diciplina[indice]);
		}
		
	}
	
	

}
