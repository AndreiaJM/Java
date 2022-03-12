package Interface01;

public class Cubo extends Figura3D{
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-44-a-46
	
	private double lado; 
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {
		double volume = Math.pow(lado, 3);
		return volume;
	}

	@Override
	public double calcularArea() {
		double areaCubo = (Math.pow(lado, 2)*6);
		return areaCubo;
	}

}
