package com.fundamentals;

public class Employee {

	int employeeID;
	String employeename;
	int salary;
	byte experince;
	char grade;
	boolean permanentstatus;

	void display() {
		System.out.println("employeeID : " + employeeID);
		System.out.println("employeename : " + employeename);
		System.out.println("salary : " + salary);
		System.out.println("experince : " + experince+ "years");
		System.out.println("grade : " + grade);
		System.out.println("permanentstatus : " + permanentstatus);
		System.out.println("________________________________");

	}

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.employeeID = 101;
		e1.employeename = "KIMIDI";
		e1.salary = 50000;
		e1.experince = 5;
		e1.grade = 'B';
		e1.permanentstatus = true;
		
		
		Employee e2 = new Employee();

		e2.employeeID = 102;
		e2.employeename = "KANNATI";
		e2.salary = 60000;
		e2.experince = 6;
		e2.grade = 'B';
		e2.permanentstatus = true;
		
		Employee e3 = new Employee();

		e3.employeeID = 103;
		e3.employeename = "PALA";
		e3.salary = 65000;
		e3.experince = 3;
		e3.grade = 'B';
		e3.permanentstatus = true;



		e1.display();
		e2.display();
		e3.display();
	}

}
