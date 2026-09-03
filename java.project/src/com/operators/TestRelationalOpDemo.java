package com.operators;

// 4) Comparison Operators OR Relational Operators

// == !=  < <=  > >= ---------> resulted value is boolean expression ---> true or false

// == operator checks the data is primitive 

public class TestRelationalOpDemo {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "Java";
		
		System.out.println(s1 == s2);
		
		String s3 = "Paparao";
		String s4 = new String("Paparao");
		System.out.println(s3 == s4 );
		System.out.println(s3.equals(s4));	
		
		
		int a = 10;
		int b = 20;
		int c = 10;
		System.out.println("_______________________");

		System.out.println(a != b);
		System.out.println(a != c);
		System.out.println("_______________________");

		System.out.println( a < b);
		System.out.println( a <= b);
		System.out.println( a <= c);
		
		System.out.println( b < c);
		System.out.println( b >= c);
		System.out.println( b == c);




		System.out.println("_______________________");

		System.out.println(a == b);// false
		System.out.println(a == c);// true
		
		
		float f1 = 5.333433f;
		double f2= 5.333433f;
		
		System.out.println(f1 == f2);

		
		
	}

}
