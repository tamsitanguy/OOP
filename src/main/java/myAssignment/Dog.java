package myAssignment;

import java.io.Serializable;

public class Dog extends Pet implements Serializable {
	
	public static double speed = 0.0;//in mph
	
	public Dog(String name, int age, double weight) {
		super(name, age, weight);
		speed = speed+1;
	}
	
	public Dog(String name, int age) {
		this(name, age, 0.0);
	}
	
	public Dog(String dName) {
		this(dName, 6);
	}
	
	public Dog() {
		this("kiwi");
	}
	//running speed must be at least 10mph
	public static void showSpeed() {
		if(speed<10) {
			System.out.println("This dog is not running"+speed);
		}
		else {
			System.out.println("This dog is running at :"+speed +" mph");
		}
		
//		@Override
//		public void grow() {
//			System.out.println(this.getpName());
//		}
	}
	

	

}
