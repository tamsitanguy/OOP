package myAssignment;

public class AgeException extends RuntimeException{
	public AgeException() {
		this("pet age cannot be less that zero");
	}
	
	public AgeException(String myMsg) {
		super(myMsg);
	}

}
