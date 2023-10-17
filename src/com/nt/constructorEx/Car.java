package com.nt.constructorEx;

public class Car {
	private String make;
	private String model;
	private int year;
	
	// Constructor 1: No arguments (default constructor)
	//The first constructor (public Car()) is a no-argument constructor, also known as the default constructor. It initializes the make, model, and year attributes to default values.
	public Car() {
		make="Unknown";
		model="Unknown";
		year=0;
	}
	 // Constructor 2: Accepts make and model
	//The second constructor (public Car(String make, String model)) accepts two arguments (make and model) and initializes those attributes while setting the year attribute to a default value.
	public Car(String make, String model) {
		this.make=make;
		this.model=model;
		year=0;
	}
	// Constructor 3: Accepts make, model, and year
	//The third constructor (public Car(String make, String model, int year)) accepts all three attributes and initializes them based on the provided arguments.
	public Car(String make,String model, int year) {
		   this.make=make;
		   this.model=model;
		   this.year=year;
	   }
	   
	   public void displayInfo() {
		   System.out.println("Make :" +make);
		   System.out.println("Model :" +model);
		   System.out.println("Year :" +year);
	   }
	   
	   public static void main(String[] args) {
		   Car car1= new Car();
		   Car car2=new Car("Toyota", "Camry");
		   Car car3=new Car("Honda", "Civic", 2022);
		   
		   car1.displayInfo();
		   car2.displayInfo();
		   car3.displayInfo();
	   }

}
