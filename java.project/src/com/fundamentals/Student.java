package com.fundamentals;

public class Student {
	
	int student_id;
	String studentname;
	int student_age;
	void hello() {
		System.out.println("hello Vcube");
	}

	public static void main(String[] args) {
		Student s1= new Student();
		s1.hello();
       System.out.println("main method started");
       
       System.out.println(s1.student_id);
       System.out.println(s1.studentname);
       System.out.println(s1.student_age);
       
       System.out.println("main method ended");
	}

}
