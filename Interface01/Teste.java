package Interface01;

public class Teste {
	
	public static void main(String[] args) {
		
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-44-a-46
		
		Quadrado f1 = new Quadrado();
		f1.setNome("Quadrado");
		f1.setCor("vermelho");
		f1.setLado(2);
		
		Circulo f2 = new Circulo();
		f2.setNome("Circulo");
		f2.setCor("azul");
		f2.setRaio(2);
		
		Triangulo f3 = new Triangulo();
		f3.setNome("triangulo");
		f3.setCor("rosa");
		f3.setAltura(2);
		f3.setBase(3);
		
		Piramide f4 = new Piramide();
		f4.setNome("piramide");
		f4.setCor("cinza");
		f4.setAltura(3);
		f4.setApotema(4);
		f4.setArestaBase(2);
		f4.setArestaBase(4);
		f4.setBase(f1);
		
		Cubo f5 = new Cubo();
		f5.setNome("cubo");
		f5.setCor("colorido");
		f5.setLado(3);
		
		Cilindro f6 = new Cilindro();
		f6.setNome("cilindro");
		f6.setCor("areia");
		f6.setAltura(3);
		f6.setRaioBase(2);
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6]; //upcasting
		
		figuras[0] = f1;
		figuras[1] = f2;
		figuras[2] = f3;
		figuras[3] = f4;
		figuras[4] = f5;
		figuras[5] = f6;
		
		for(FiguraGeometrica figura:figuras) {
			System.out.println("-----------------------");
			System.out.println(figura.getNome());
			
			if(figura instanceof Figura2D) {
				Figura2D f2d = (Figura2D)figura; //dowcasting
				System.out.println("Area: "+f2d.calcularArea());
			}
			if(figura instanceof Figura3D) {
				Figura3D f3d = (Figura3D)figura; //dowcasting
				System.out.println("Area: "+f3d.calcularArea()+"\n");
				System.out.println("Volume "+f3d.calcularVolume());
			}
		}
	}

}
