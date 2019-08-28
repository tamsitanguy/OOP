package myAssignment;

import java.io.Serializable;

public class Dog extends Pet implements Serializable {
	
	public static double speed = 0;//in mph
	
	public Dog(String name, int age, double weight) {
		super(name, age, weight);
	}
	
	//running speed must be at least 10mph
	public static void showSpeed() {
		if(speed<10) {
			System.out.println("This dog is not running");
		}
		else {
			System.out.println("This dog is running at :"+speed);
		}
	}
	

}
