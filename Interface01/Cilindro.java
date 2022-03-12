package Interface01;

public class Cilindro extends Figura3D {
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-44-a-46

	private double raioBase;
	private double altura;
	
	public double getRaioBase() {
		return raioBase;
	}

	public void setRaioBase(double raioBase) {
		this.raioBase = raioBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {
		double volume = ((3.14*Math.pow(raioBase,2))*altura);
		return volume;
	}

	@Override
	public double calcularArea() {
		double areaLateral = ((2*3.14)*(raioBase*altura));
		double areaBase = (3.14*Math.pow(raioBase, 2));
		double areaTotal=((2*areaBase)+areaLateral);
		return areaTotal;
	}

}
