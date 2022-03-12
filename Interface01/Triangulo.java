package Interface01;

public class Triangulo extends Figura2D implements DimensaoSuperficial{
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-44-a-46
	
	private double altura; 
	private double base; 
	
	public double getAltura() {
	return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

		@Override
	public double calcularArea() {
		double areaTri = (altura*base)/2;
		return areaTri;
	}

}
