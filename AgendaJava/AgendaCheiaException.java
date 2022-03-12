package AgendaJava;

public class AgendaCheiaException extends Exception{
	
	@Override
	public String getMessage() {
		
		return "Agenda ja esta cheia";
	}
	

}
