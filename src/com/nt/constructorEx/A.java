package com.nt.constructorEx;

public class A {
	static void m1() {
		System.out.println("m1");
		m1();
		
	}
	public static void main(String[] args) {
		System.out.println("Main");
		m1();
	}

}
