package com.fundamentals;

class Student1 {
	int sid;
	String sname;
	Address address;
}

class Address {
	String city;
	String state;
	String country;
}

public class TestDataTypesDemo3 {

	public static void main(String[] args) {

		Student1 s1 = new Student1();

		s1.sid = 101;
		s1.sname = "Paparao";
		s1.address = new Address();

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address);

		s1.address.city = "Akividu";
		s1.address.state = "Andra Pradesh";
		s1.address.country = "India";

		System.out.println(s1.address.city);
		System.out.println(s1.address.state);
		System.out.println(s1.address.country);

	}
}
