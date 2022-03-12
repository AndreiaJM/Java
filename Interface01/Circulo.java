package Interface01;

public class Circulo extends Figura2D{
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-44-a-46
	
	private double raio; 

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double areaCir = (3.14*(Math.pow(raio, 2)));
		//Math.PI;
		return areaCir;
	}

}
