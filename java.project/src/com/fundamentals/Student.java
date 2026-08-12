package com.fundamentals;

public class Student {
	
	 static int student_id;
	static String studentname;
	static int student_age;
	void hello() {
		System.out.println("hello Vcube");
	}

	
	public static void main(String[] args) {
		Student s1= new Student();
		student_id = 07;
		studentname = "paparao";
		student_age =22;
		s1.hello();
       System.out.println("main method started");
       
       System.out.println("student_id:" + student_id);
       System.out.println("studentname:" + studentname);
       System.out.println("student_age :" +student_age);
       
       System.out.println("main method ended");
	}

}
