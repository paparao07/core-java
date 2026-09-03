package com.operators;

// 3) unary Operator

// +  -  ++  --

public class TestUnaryOpDemo {

	public static void main(String[] args) {

		System.out.println("main method started ");

		int a = 5;
		int b = 6;

		System.out.println(+a);// Unary +
		System.out.println(-b);// Unary -

		System.out.println(++a);//a = a+1 ==> 6  pre increment
		System.out.println(--b);//b = a-1 ==> 5  pre decrement
		System.out.println(a++);//6 ===>  a= a+1 ==> 7  post increment
		System.out.println(b--);//5 ===>  b= b-1 ==> 4  post decrement
		
		
		System.out.println(++a);
		System.out.println(b--);
		System.out.println(a++);
		System.out.println(b++);
		System.out.println(++b);

System.out.println(++a + b++ + a-- + b--);
 

		
		
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);


	}

}
