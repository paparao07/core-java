package com.fundamentals;


public class StudentNumber {
	
	Integer sid;
	String sname;
	String gender;
	String branch;
	String collegename;
	
	
	void displayStudentNumber() {
		System.out.println("student id :"+ sid);
		System.out.println("student name  :" + sname);
		System.out.println("gender :" + gender);
		System.out.println("branch : " + branch);
		System.out.println("collegev name :"+ collegename);
		System.out.println("---------------------------------");

	}

	public static void main(String[] args) {
		
		System.out.println("main method started ");
		
		StudentNumber s1 = new StudentNumber();
		StudentNumber s2 = new StudentNumber();

		s1.sid = 101;
		s1.sname = "kimidi";
		s1.gender = "male";
		s1.branch = "CSE";
		s1.collegename = "Vcube";
		
		
		s2.sid = 102;
		s2.sname = "sai";
		s2.gender = "female";
		s2.branch = "CSE";
		s2.collegename = "Vcube";
		
		s1.displayStudentNumber();
		s2.displayStudentNumber();
		
		System.out.println("main method ended ");

		
	}

}
