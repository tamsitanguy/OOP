package myAssignment;

import java.io.Serializable;

public class Cat extends Pet implements Animal, Serializable {
    
	public static double speed = 0;
	
	public Cat(String cName, int cAge, double cWeight) {
		super(cName, cAge, cWeight);
		speed++;
	}
	
	public Cat(String name, int age) {
		super(name, age);
		speed++;
		
	}
	
	public Cat(String name) {
		super(name);
		speed++;
	}
	
	public Cat() {
		speed++;
	}
	
	public void meow() {
		
		System.out.println(this.getpName()+"is making a sound");
	}
	
}
