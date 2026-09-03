package com.fundamentals;

public class TestDataTypesDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
// wrapper caching:
// if the dATA between -128 to 127 then it allocates same memory so we will get true.		
		Integer i3 = 100;
		Integer i4 = 100;
		System.out.println(i3 == i4);

// but if check more then 127 values are allocating different memory for every new value so will get false'
		Integer i5 = 200;
		Integer i6 = 200;
		System.out.println(i5 == i6);
		
		
// converting primitive values to wrapper object data will consider as auto-Boxing		
		Integer i1 = 10;
		System.out.println(i1);

//  converting wrapper object to primitive data will consider as auto-unboxing		
		int i2 = i1;
		System.out.println(i2);

		System.out.println("main method ended");

	}

}
