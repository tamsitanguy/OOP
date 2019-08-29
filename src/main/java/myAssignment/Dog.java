package myAssignment;

import java.io.Serializable;

public class Dog extends Pet implements Serializable {
	
	public static int dogNumb = 0;//counting the number of dogs
	
	public Dog(String name, int age, double weight) {
		super(name, age, weight);
		dogNumb = dogNumb+1;
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
	public static void showPop() {
		if(dogNumb == 0) {
			System.out.println("missing espace "+dogNumb);
		}
		else {
			System.out.println("existing espace: "+dogNumb);
		}
		
	}
	
	@Override
	public void train() {
		System.out.println(this.getpName()+ " is in training");
	}
	

	

}
