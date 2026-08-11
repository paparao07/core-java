package com.project;

public class TestDemo5 {

// in static area, we cannot call Instance methods dierectiy,
// So i am cerating object to call instance methods.
	static void method1() {
		TestDemo5 t = new TestDemo5();
		t.method2();
		System.out.println("method1 called ");
	}

// In instance, we can call static methods directly.
	void method2() {
		System.out.println("method2 called ");
		method3()
	}

// in static area, we cannot call Instance methods dierectiy,
// So i am cerating object to call instance methods.
	static void method3() {
		System.out.println("method3 called ");
		TestDemo5 t = new TestDemo5();
		t.method4();
	}

// In instance, we can call static methods directly	
	void method4() {
		System.out.println("method4 called ");
		method5();
	}

	void method5() {
		System.out.println("method5 called ");
	}

//In static, we can call static directly.	
	public static void main(String[] args) {
		System.out.println("main method started ");

		method1();

		System.out.println("main method ended");
	}

}
