package com.nt.constructorEx;

public class Test01 {
	private String name;
	private int age;
	
	
	// Default Constructor (automatically provided if no constructors are defined)
    public Test01() {
        // No need to explicitly define this constructor.
        // The compiler provides it, and it initializes attributes to default values.
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Test01 ts= new Test01();
		System.out.println("Name :"+ts.getName());
		System.out.println("Age :"+ts.getAge());
	}
	
}
