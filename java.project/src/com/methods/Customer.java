package com.methods;

// no return type + with parameter 

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id :");
		int id = sc.nextInt();
		
		System.out.println(" Enter name :");
		String name = sc.next();
		
		System.out.println("enter phone number :");
		long number = sc.nextLong();
		
		System.out.println(" enter gender : ");
		char gen = sc.next().charAt(0);
		
		
		System.out.println("_______________________________");
		getCustomerid(id);
		getCustomername(name);
       	getCustomernumber(number);
       	getCustomergender(gen);
		System.out.println("_______________________________");

		System.out.println("main method ended ");
	}
	 
	 static void getCustomernumber(long number) {
System.out.println("Customer phone number :"+ number);		
	}

	static void getCustomerid(int id) {
		System.out.println("Customer id is :" + id);
	}
	 
	static void getCustomername(String name) {
		System.out.println(" customer name is :"+ name);
	}
	static void getCustomergender(char gender) {
		System.out.println("customer gender is  :" + gender);
	}
	
	

}
