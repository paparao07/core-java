package com.fundamentals;

public class HospitalPatient {

	int patientid;
	String patientname;
	String disease;
	int roomnumber;

	static String hospitalname;
	static String doctorname;

	void displayPatientdetails() {

		System.out.println(" patientid: " + patientid);
		System.out.println("patientname : " + patientname);
		System.out.println("disease : " + disease);
		System.out.println("roomnumber : " + roomnumber);
	}

	void changeRoom(int newroomnumber) {
		roomnumber = newroomnumber;
		System.out.println("Room changed successfully.");
	}

	static void displayHospitaldetails() {
		System.out.println("hospitalname :" + hospitalname);
		System.out.println("doctorname : " + doctorname);
	}

	static void changeDoctor(String newDoctor) {
		doctorname = newDoctor;
	}

	public static void main(String[] args) {
		hospitalname = "City Care Hospital";
		doctorname = "Dr. Ramesh";

		HospitalPatient patient1 = new HospitalPatient();
		patient1.patientid = 101;
		patient1.patientname = "Rahul";
		patient1.disease = "Fever";
		patient1.roomnumber = 201;

		HospitalPatient patient2 = new HospitalPatient();
		patient2.patientid = 102;
		patient2.patientname = "suresh";
		patient2.disease = "cold";
		patient2.roomnumber = 202;
		
		
        System.out.println("===== HOSPITAL DETAILS =====");
        HospitalPatient.displayHospitaldetails();

        // Display patient details
        System.out.println("\n===== PATIENT 1 DETAILS =====");
        patient1.displayPatientdetails();
        
        System.out.println("\n===== PATIENT 2 DETAILS =====");
        patient2.displayPatientdetails();
        
        System.out.println("\n===== CHANGING ROOMS =====");
        patient1.changeRoom(301);
        patient2.changeRoom(302);

        System.out.println("\n===== UPDATED PATIENT DETAILS =====");

        System.out.println("\nPatient 1:");
        patient1.displayPatientdetails();   
        System.out.println("\nPatient 2:");
        patient2.displayPatientdetails();


        System.out.println("\n===== CHANGING DOCTOR =====");
        HospitalPatient.changeDoctor("Dr. Kumar");

        HospitalPatient.displayHospitaldetails();
	}

}
