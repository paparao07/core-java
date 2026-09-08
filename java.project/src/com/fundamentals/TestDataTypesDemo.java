package com.fundamentals;

public class TestDataTypesDemo {

	byte b = 127;
// -128,-127,-126,-125.....0,1,2,3,.....125,126,127	
	byte b1 = (byte) 257; // -126 // int to byte convertion --> Explicit Type casting

//short means 2 bytes --> 16 bits=2^15  = -32768 to 32767	
//Type mismatch: cannot convert from int to short	
	short s = 32767;
	short s1 = (short) 40000;

// int means 4 bytes --> 32 bits = 2^31 =-2147483648 to 2147483647
//The literal 2147483648 of type int is out of range 	
	int i = 2147483647;
//	int i1 = 2147483648;

//	long means 8 bytes --> 64 bits 2^63 =9223372036854775807
	long l = 9223372036854775807L;
	long phone = 9553787189L;
	
	long l1 =i;// int -->long --> conversion --> Implicit type casting 
	
// float is for decimal point data representation
//By default RHS decimal point is double	
//Type mismatch: cannot convert from double to float	
	float f =5.9F ;
	double d = 75.5;
	
	float f1 = 7576.2638484888593229263F;
	double d1 = 7576.2638484888593229263;

	// char means 2 bytes =  -32768 + 32767 = 65535
	//char range is 0 to 65535
	char c = 'A'; // single quote characters
	char c1 =65 ;// ASCII values 65 to 90 -->A -->Z
	char c2 = 97;// ASCII VALUE 91 TO 96 --> special characters 97 to 122-->a -->z
	
	char c3 = 77;
	char c4 = 6553;
	int i3 = 'A';
	
	boolean boo = true;

	public static void main(String[] args) {

		System.out.println("Main method started");

		TestDemoDataTypes t = new TestDemoDataTypes();

		System.out.println("byte values : " + t.b);
		System.out.println("byte values : " + t.b1);

		System.out.println("short value : " + t.s);
		System.out.println("short value : " + t.s1);

		System.out.println( "int value : " +t.i);
		
		System.out.println("long value : " + t.l);
		System.out.println("long value : " +t. phone);

		System.out.println( "float value : " +t.f);
		System.out.println("double value : " +t.d);

		
		System.out.println( "float value : " +t.f1);
		System.out.println("double value : " +t.d1);

		
		System.out.println("char value : " +t.c);
		System.out.println("char value : " +t.c1);
		System.out.println("char value : " +t.c2);
		System.out.println("char value : " +t.c3);
		System.out.println("char value : " +t.c4);
		System.out.println("char value : " +t.i3);




		System.out.println("boolean value : "+t.boo);
		
		if(t.boo) {
			System.out.println("good morning !!");

		}

		System.out.println("Main method Ended");

	}

}
