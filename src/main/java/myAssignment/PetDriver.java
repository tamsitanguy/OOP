package myAssignment;


public class PetDriver {

	public static void main(String[] args) {
	
		System.out.println(new Cat());
		Cat c = new Cat();
		c.meow();
		Dog d = new Dog();
		d.train();
		System.out.println(c);
		System.out.println(d);
		
	}

}
