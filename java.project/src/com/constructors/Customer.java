package com.constructors;

public class Customer {

	int id;
	String name;
	
	
// No Arg Constructor	
	 Customer() {
		 System.out.println("No arg constructor called ");
		 id = 100;
		 name = "unknown";
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Customer c1 = new Customer();
		c1.show();
		
		Customer c2 = new Customer();
		c2.show();
		
		System.out.println("main method ended ");
	}

	void show() {
		System.out.println("customer id : "+ id);
		System.out.println("customer name : "+ name);
		
	}
	
}
