package com.nt.constructorEx;

public class RecursiveConstuctorCall {
	
	public RecursiveConstuctorCall() {
		System.out.println("Constructor");
		RecursiveConstuctorCall rcc= new RecursiveConstuctorCall();
	}

	public static void main(String[] args) {
		System.out.println("Main");
		RecursiveConstuctorCall rcc= new RecursiveConstuctorCall();
		
		
	}

}
