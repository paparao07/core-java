package com.constructors;

public class Car {

	String model;
	String brand;
	double price;
	int year;
	String color;
	
//No arg-constructor 	
	Car(){
		System.out.println("no arg constructor called ");
		model ="unknown";
		brand = "unknown";
		price = 100;
		year = 2003;
		color = "Unknown";
		
	}
	
//  2-arg Parameterized Constructor	
	Car(String model,String brand){
		this.model = model;
		this.brand = brand;
		
	}
	
//  3-arg Parameterized Constructor	
	Car(String model,String brand,double price){
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
//  4-arg Parameterized Constructor	
	Car(String model,String brand,double price,int year){
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
	}
	
//  5-arg Parameterized Constructor	
	Car(String model,String brand,double price,int year,String color){
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.color = color;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to cars Showroom !!");
		
		Car c1 = new Car();
       c1.Carinfo();
       
       Car c2 = new Car("Swift" ,"Maruti Suzuki");
       c2.Carinfo();
       
       Car c3 = new Car("selctos","KIA",130000);
       c3.Carinfo();
       
       Car c4 = new Car("Nexon","TATA",130000,2026);
       c4.Carinfo();
       
       Car c5 = new Car("Nexon","TATA",130000,2026,"white");
       c5.Carinfo();
       
	}

	void Carinfo() {
		System.out.println("car model is : "+ model);
		System.out.println("car brand is : "+ brand);
		System.out.println("car price is : "+ price);
		System.out.println("car year is : "+ year);
		System.out.println("car color is : "+ color);
		System.out.println("*******************************");

	}
}
