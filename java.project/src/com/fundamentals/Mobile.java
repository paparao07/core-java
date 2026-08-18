package com.fundamentals;

public class Mobile {

	// static variables
	static String company = "samsung";
	static int totalmobiles;

	// instance variables
	String brand;
	String model;
	double price;
	int ram;

	// static block
	static {
		System.out.println("static block executed");
		totalmobiles = 0;
	}

	// instance block
	{
		System.out.println("instance block executed");
		totalmobiles++;
	}

	// static method
	static void displaycompany() {
		System.out.println("company : " + company);
		System.out.println("totalmobiles : " + totalmobiles);
	}

	// instance method
	void displaymobile() {
		System.out.println("brand : " + brand);
		System.out.println("model : " + model);
		System.out.println("price : " + price);
		System.out.println("ram : " + ram + "GB");
	}

	public static void main(String[] args) {

		// creating 1 objects

		Mobile m1 = new Mobile();

		m1.brand = "Samsung";
		m1.model = "Galaxy S24";
		m1.price = 79999;
		m1.ram = 8;

		// Calling static method
		Mobile.displaycompany();

		// Calling instance methods
		m1.displaymobile();
	}

}
