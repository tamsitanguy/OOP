package myAssignment;

import java.io.Serializable;

public class Dog extends Pet implements Serializable {
	
	public static double speed = 0;//in mph
	
	public Dog(String name, int age, double weight) {
		super(name, age, weight);
	}
	
	public Dog(String name, int age) {
		this(name, age, 0.0);
	}
	
	//public Dog(String dName) {
		//this(dName, "gentil");
	//}
	
	//running speed must be at least 10mph
	public static void showSpeed() {
		if(speed<10) {
			System.out.println("This dog is not running"+speed);
		}
		else {
			System.out.println("This dog is running at :"+speed +"mph");
		}
	}
	

	

}
