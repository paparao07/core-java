package com.methods;

import java.util.Scanner;

//with return type + no parameter

public class EmpolyeeDetails {

	Scanner sc = new Scanner(System.in);
	

	String getEmpname() {
		System.out.println("enter your name :");
		String name = sc.nextLine();
		return name ;
	}

	int empAge() {
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		return age;
	}
	
	char empGender() {
		System.out.println("enter your gender :");
		char gender = sc.next().charAt(0);
		return gender; 
	}
	
	float empHeight() {
		System.out.println("Enter your height ;");
		float height = sc.nextFloat();
		return height;
	}
	int getEmpId() {
		System.out.println("Enter your Id :");
		int Id = sc.nextInt();
		return Id;
	}
	byte getEmpExperience() {
		System.out.println("Enter your experience");
		byte Exp = sc.nextByte();
		return Exp;
	}
	
	long getPhonenumber() {
		System.out.println("enter your phone number :");
		long phone = sc.nextLong();
		return phone;
		
	}
	

    boolean getStatus() {
        System.out.println("Enter employee status (true/false):");
        boolean status = sc.nextBoolean();
        return status;
    }
	
	double getBasicSalary() {
		System.out.println("enter your basic salary :");
		double sal = sc.nextDouble();
		return sal;
	}

	double getHRA() {
		System.out.println("Enter your HRA :");
		double hra = sc.nextDouble();
		return hra;
	}
	
	double getBouns() {
		System.out.println("enter your bouns :");
		double bonus = sc.nextDouble();
		return bonus;
	}
	  void main(String[] args) {

		System.out.println("main method strted ");
		
		String name =getEmpname();
		int age = empAge();
		int Id = getEmpId();
		char gender = empGender();
		float heihght = empHeight();
		byte Exp =  getEmpExperience();
		boolean status = getStatus();
		long phone = getPhonenumber();
		double sal = getBasicSalary();
		double hra = getHRA();
		double bonus = getBouns();
		
		System.out.println("-----------------------------------");
		System.out.println("Empolyee name is :" + name );
		System.out.println("Empolyee age is :" + age );
		System.out.println("Empolyee Id is :" + Id );
		System.out.println("Empolyee Gender is: " + gender );
		System.out.println("Empolyee Height is :" + heihght );
		System.out.println("Empolyee Experience is :" + Exp  );
        System.out.println("Employee Status is : " + status);
		System.out.println("Empolyee phone number is :" + phone );
		System.out.println("Empolyee salaray is: " + sal );
		System.out.println("Empolyee hra is :" + hra );
		System.out.println("Empolyee bouns is: " + bonus );
		System.out.println("-----------------------------------");  
		System.out.println("Enter total salary :" +(sal + hra + bonus ));
		
		
		System.out.println("main method strted ");


	}

}
