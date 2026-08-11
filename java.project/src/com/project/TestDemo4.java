package com.project;

public class TestDemo4 {
	
//static method
// JVM calls main method to execute !!
	static void hello() {
		System.out.println("Hello guys,Good morning !");
		System.out.println("Hello guys,Good morning !");
		System.out.println("Hello guys,Good morning !");
	
	}
	
// static main method
	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(Thread.currentThread());
		
		TestDemo4 t= new TestDemo4();
		
//calling the static method directiy		
		hello();
		
// calling the instance method by useing object reference variable.	
		t.welcome();
		
		System.out.println("main method ended ");

	}
 // instance method  
	void welcome() {
		System.out.println("Welcome to Vcube !! ");
		System.out.println("Welcome to Vcube !! ");
		System.out.println("Welcome to Vcube !! ");
	}
}
