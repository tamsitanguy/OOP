package myAssignment;

import java.io.Serializable;

public class Cat extends Pet implements Animal, Serializable {

	public Cat(String cName, int cAge, double cWeight) {
		super(cName, cAge, cWeight);
	}
	public void meow() {
		
		System.out.println(this.getpName()+"is making a sound");
	}

}
