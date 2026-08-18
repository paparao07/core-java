package com.fundamentals;

public class Student {

	static int student_id;
	static String studentname;
	static int student_age;

	void $hello() {
		System.out.println("hello Vcube");
	}

	void _$welcome() {
		System.out.println("Good Morning Students");
	}

	public static void main(String[] args) {

		student_id = 07;
		studentname = "paparao";
		student_age = 22;

		Student s1 = new Student();
		s1.$hello();
		s1._$welcome();
		System.out.println("main method started");

		System.out.println("student_id:" + student_id);
		System.out.println("studentname:" + studentname);
		System.out.println("student_age :" + student_age);

		System.out.println("main method ended");

		student_id = 8;
		studentname = "prasad";
		student_age = 22;

		Student s2 = new Student();
		s2.$hello();
		s2._$welcome();
		System.out.println("main method started");

		System.out.println("student_id:" + student_id);
		System.out.println("studentname:" + studentname);
		System.out.println("student_age :" + student_age);

		System.out.println("main method ended");

	}

}
