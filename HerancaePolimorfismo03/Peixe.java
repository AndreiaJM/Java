package HerancaePolimorfismo03;

public class Peixe extends Animal{
	
	//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
	
	private String caracteristicas;
	
	public Peixe() {
		
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.caracteristicas="Barbatanas e cauda";
		
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s+="Caracteristicas:"+caracteristicas;
		
		return s;
	}
	
	

}
