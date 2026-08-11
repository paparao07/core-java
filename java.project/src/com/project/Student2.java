package com.project;

public class Student2 {

	int sid = 100;
	String sname = "Unknown";
	
	static int collegeId;
	static String collegename;
	
	public static void main(String[] args) {
   
   collegeId = 555;
   collegename = "Vcube";
   
   
   Student2 eswar = new Student2();
   eswar.sid = 101;
   eswar.sname = "Eswar";
   
	System.out.println("College ID:" + collegeId);
	System.out.println("College Name:" + collegename);
	System.out.println("Student id :" + eswar.sid);
	System.out.println("Student name :"+eswar.sname);
		
	Student2 ch = new Student2();
	
	   ch.sid = 102;
	   ch.sname = "charan";
	   
		System.out.println("College ID:" + collegeId);
		System.out.println("College Name:" + collegename);
		System.out.println("Student id :" + ch.sid);
		System.out.println("Student name :"+ ch.sname);
		
		
		Student2 bh = new Student2();
	// Re-initializing the data 
		collegeId =   666;
		collegename =   "VSS";
		
		 bh.sid = 103;
		 bh.sname = "bhanu";
		
		 System.out.println("College ID:" + collegeId);
		 System.out.println("College Name:" + collegename);
		 System.out.println("Student id :" + bh.sid);
		 System.out.println("Student name :"+ bh.sname);
		 
		 Student2 vr = new Student2();
		   
			System.out.println("College ID:" + collegeId);
			System.out.println("College Name:" + collegename);
			System.out.println("Student id :" + vr.sid);
			System.out.println("Student name :"+ vr.sname);

	}

}
