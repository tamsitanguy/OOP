package myAssignment;

import java.io.Serializable;

public class Cat extends Pet implements Animal, Serializable, Comparable<Cat> {
    
	//public static double dogNumb = 0;
	
	public Cat(String cName, int cAge, double cWeight) {
		super(cName, cAge, cWeight);
		//dogNumb++;
	}
	
	public Cat(String name, int age) {
		super(name, age);
		//dogNumb++;
		
	}
	
	public Cat(String name) {
		super(name);
		//dogNumb++;
	}
	
	public Cat() {
		//dogNumb++;
	}
	
	public void meow() {
		
		System.out.println(this.getpName()+"is making a meow sound");
	}
	
	//@Override
	public void train() {
		System.out.println(this.getpName()+ "needs to be trained");
	}
	
	@Override
	public void train(Hunt h) {
		System.out.println(this.getpName()+ "is trained to shoot");
	}
	
	public int compareTo(Cat c) {
		
		return this.getpName().compareTo(c.getpName());
	}
}
