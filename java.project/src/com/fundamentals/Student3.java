package com.fundamentals;

public class Student3 {

	// primitive + STATIC
	static int collegeid = 555;
	// object + static
	static String collegename = "vcube";

	// primitive + instance
	int rollno = 0;
	// object + instance
	String name = "unknown";

	public static void main(String[] args) {

//     primitive + local		
		int collegeid = 666;
//     object + local		
		String collegename = "vss";
		
		int a;
	//	System.out.println(a);
		
//    1st-way : static data we can access directly
		System.out.println(collegeid);
		System.out.println(collegename);

//    2nd way : static data we can access by using class name  		
		System.out.println(collegeid);
		System.out.println(collegename);

//    3rd way : static data we can access by using object reference variable		
		Student3 s3 = new Student3();
		System.out.println(collegeid);
		System.out.println(collegename);
// but, instance data we can access only object reference variable
		System.out.println(s3.rollno);
		System.out.println(s3.name);

	}

}
