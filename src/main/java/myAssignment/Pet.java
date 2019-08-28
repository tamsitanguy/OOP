package myAssignment;

public abstract class Pet {
	
	private String pName;
	private int pAge;
	private double pWeight;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public double getpWeight() {
		return pWeight;
	}
	public void setpWeight(double pWeight) {
		this.pWeight = pWeight;
	}
	
	//chaining overloaded constructors
	
	public Pet(String name, int age, double weight) {
		super();
		this.pName = name;
		this.pAge = age;
		this.pWeight = weight;
	}
	
	public Pet (String pName, int pAge) {
		this(pName, pAge, 45.5);
	}
	
	public Pet(String name) {
		this(name, 3);
	}
	 public Pet() {
		 this("Caniche");
	 }
	 
	 @Override
	 public String toString() {
		 return "Pet name: "+pName+ "pAge Age: "+pAge+ "Pet weight: "+ pWeight;
		 
	 }

}
