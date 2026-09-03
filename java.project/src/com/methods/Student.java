package com.methods;
// no return type + with parameter

public class Student {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("main method called");
		
//   call by value		
		s1.getStudent("Paparao");// arguments
		s1.getStudentid(107);
		s1.getStudentphone(9553787189l);
		s1.getStudentcollege("DNR College");
		s1.getStudentHeight(5.9f);
		s1.getStudentsalary(220000);
		s1.getStudentDno(120);
		s1.getStudentweight(56.55d);
		s1.getStudentaddar(645817651773l);
		s1.Studentgender('M');
		s1.getStudentage((byte) 22);
		s1.getStudentmarks((short) 25000);
		s1.getPancard(324455555);
		System.out.println("main method ended");
	}

	// parameters 
	void getStudentage(byte age) {
		System.out.println("student age :" + age);
	}
	void getStudentmarks(short marks) {
		System.out.println("student marks :" + marks);
	}
	
	 void Studentgender(char gender) {
		System.out.println(" gender :" + gender);
	}

	void getStudent(String name) {
		System.out.println("Student name : " + name);
	}

	void getStudentid(int id) {
		System.out.println("Student id :" + id);
	}

	void getStudentphone(long phone) {
		System.out.println("phone number : " + phone);

	}

	void getStudentcollege(String college) {
		System.out.println("college name :" + college);
	}

	void getStudentHeight(float height) {
		System.out.println("student height :" + height);
	}

	void getStudentsalary(double salary) {
		System.out.println("student salary : " + salary);
	}

	void getStudentDno(int Dno) {
		System.out.println("student Drno  : " + Dno);
	}
	void getStudentweight( double weight) {
		System.out.println("student weight :" + weight);	
	}
	void getStudentaddar(long addar) {
		System.out.println("adar number :"+ addar);
	}
	void getPancard(int pan) {
		System.out.println("pan card number :"+pan);
	}
	

}
