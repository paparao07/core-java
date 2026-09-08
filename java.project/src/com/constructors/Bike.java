package com.constructors;

public class Bike {

	String model;
	String brand;
	double price;
	int year;
	String color;

	public Bike() {
		this("unknown", "unknown");
		System.out.println("no arg constructor called ");
	}

	public Bike(String model, String brand) {
		this(model, brand, 10000.00);
		System.out.println("2 arg constructor called ");
	}

	public Bike(String model, String brand, double price) {
		this(model, brand, price, 2026);
		System.out.println("3 arg constructor called ");
	}

	public Bike(String model, String brand, double price, int year) {
		this(model, brand, price, year, "black");
		System.out.println("4 arg constructor called ");

	}

	public Bike(String model, String brand, double price, int year, String color) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.color = color;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Bikes Showroom  !! ");

		Bike fz = new Bike("FZ-S", "YAMAHA", 100000.00, 2020, "blue");
		fz.Bikeinfo();

		Bike b1 = new Bike("classic", "royal");
		b1.Bikeinfo();

		Bike b2 = new Bike();
		b2.Bikeinfo();

	}

	void Bikeinfo() {
		System.out.println("bike model is : " + model);
		System.out.println("bike brand is : " + brand);
		System.out.println("bike price is : " + price);
		System.out.println("bike year is : " + year);
		System.out.println("bike color is : " + color);
		System.out.println("*******************************");

	}

}
