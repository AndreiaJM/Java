package Interface01;

public class Quadrado extends Figura2D{
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-44-a-46
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		double areaQuadrado = Math.pow(lado, 2);
		
		return areaQuadrado;
	}


	

}
