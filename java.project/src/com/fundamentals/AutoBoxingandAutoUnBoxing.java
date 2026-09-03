package com.fundamentals;

public class AutoBoxingandAutoUnBoxing {

	public static void main(String[] args) {
		
		
		// Primitive int variable
		int num = 100;
		
		 // Autoboxing: int -> Integer
		Integer obj = num;
		
		 // Autounboxing: int -> Integer
		int value = obj;
		
		System.out.println("Primitive int value: " + num);
		System.out.println("Integer object value :"+ obj );
		System.out.println("After unboxing value :"+ value);
	}

}
