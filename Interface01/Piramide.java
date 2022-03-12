package Interface01;

public class Piramide extends Figura3D{
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-44-a-46
	
	private double arestaBase;
	private double altura;
	private double apotema;
	
	private Figura2D base;
	private int poliBase;
	
	public double getArestaBase() {
		return arestaBase;
	}
	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	public Figura2D getBase() {
		return base;
	}
	public void setBase(Figura2D base) {
		this.base = base;
	}
	public int getPoliBase() {
		return poliBase;
	}
	public void setPoliBase(int poliBase) {
		this.poliBase = poliBase;
	}
	
	@Override
	public double calcularArea() {
		
		if(base!=null) {
			return ((poliBase*(arestaBase*apotema)/2))+base.calcularArea();
		}
		return 0;
	}

	
	@Override
	public double calcularVolume() {
		
		if(base!=null) {
			return (base.calcularArea()*altura)/3;   
		}
		return 0;
	}
	
}
