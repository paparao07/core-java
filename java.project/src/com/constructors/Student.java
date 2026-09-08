package com.constructors;

public class Student {

	int rollno;
	String sname ;
	int age;
	// No arg-Constructor
	 Student() {
		 System.out.println("No arg constructor called ");
		  rollno = 100;
		  sname = "unknown";
		  age = 18;
	 }
	 
	 // parameterized Constructor
// why we need this keyword when it is working with different parameter names...?
// For Better Readability And code Maintainability	 
	Student(int rollno, String sname, int age){
		System.out.println("parameterized Constructor ");
		
		this.rollno=rollno;
		this.sname=sname;
		this.age=age;
		
	}
	
	
	public static void main(String[] args) {

		System.out.println("main method started ");
		
		Student s = new Student();
		s.rollno= 101;
		s.sname = "kimidi";
		s.age = 23;
		s.Studentinfo();
		
		Student s1 = new Student(102, "sai",22);
		s1.Studentinfo();
		System.out.println("main method ended ");

	}

	void Studentinfo() {
		
		System.out.println("Student name : " + rollno);
		System.out.println("Name of the Student :" + sname);
		System.out.println("Student Age : " + age);
		System.out.println("*******************************");
		
	}
}
