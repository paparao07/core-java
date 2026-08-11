package com.project;

class A{
	B b;
}
class B{

A a;
}
public class GarbagCollector {
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
	
	public static void main(String[] args) {

		System.out.println("main method started");
		A obj1 = new A();
		B obj2 = new B();
		
		obj1=null;
		obj2=null;
		
		System.gc();
		
		
	}

}
