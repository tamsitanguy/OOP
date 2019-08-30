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
	//constructor accepting 3 parameters
	public Pet(String name, int age, double weight) {
		super();
		this.pName = name;
		this.pAge = age;
		this.pWeight = weight;
	}
	
	//This constructor overloads the 1st one and accepts 2 parameters
	public Pet (String pName, int pAge) {
		this(pName, pAge, 45.5);
	}
	
	//That constructor accepts 1 parameter.
	public Pet(String name) {
		this(name, 8);
	}
	
	//No-parameter constructor
	 public Pet() {
		 this("Caniche");
	 }
	 
	 //run()
	 public void run() {
		 System.out.println(this.pName+ " is running");
	 }
	 
	 public abstract void train();
	// public abstract void hunt();
	 
	
	 @Override
	 public String toString() {
		 return "Pet name:"+pName+ "   pet Age:"+pAge+ " Pet weight:"+ pWeight;
		 
	 }
	public void train(Hunt h) {
		// TODO Auto-generated method stub
		System.out.println(this.pName+ "is hunting");
		
	}

}
