package com.project;

//write a program to represent Only Indian Cricket team. ?
public class Cricketer {


		//Step1: declaration
		//static variabels
			static int CountryID;
			static String CountryName;

		
		//instance varibles or non-static variabels
		int jerseyNumber;
		String Cricketername;
		

		public static void main(String[] args) {
			System.out.println("Welcome to indian cricket team");

		
				
	// If we want to accesss, instance data in ststic area
	//	we must need to create Object.
			
	//Create Object of a class
			Cricketer msd =new Cricketer();
	//Step2: Initailization
			CountryID = 91;
			CountryName ="India";
			
			msd.jerseyNumber = 7;
	        msd.Cricketername = "Mahendra Singh Dhoni";

	
	  //Step3:    Accessing the static data directly  																																																
			System.out.println("Country ID : " + CountryID);
			System.out.println("Country Name :" + CountryName);

	//  Accessing instance data directly in static main method is not possible.
	//	System.out.println(jerseyNumber);
	//	System.out.println(name);

	//Accessing the instance data by useing Object Referance variable.		
		System.out.println("Jersey number : "+ msd.jerseyNumber);
		System.out.println("cricketer name : "+ msd.Cricketername); 
		
		
		Cricketer virat =new Cricketer();
		virat.jerseyNumber = 18;
        virat.Cricketername = "Virat Kohli";
		System.out.println("Jersey number : "+ virat.jerseyNumber);
		System.out.println("cricketer name : "+ virat.Cricketername); 
		
		
		Cricketer surya =new Cricketer();
		surya.jerseyNumber = 63;
        surya.Cricketername = "Surya Kumar";
		System.out.println("Jersey number : "+ surya.jerseyNumber);
		System.out.println("cricketer name : "+ surya.Cricketername); 
		
		Cricketer hardik =new Cricketer();
		
		CountryID = 92;
		CountryName ="bharat";
		
		System.out.println("Country ID : " + CountryID);
		System.out.println("Country Name :" + CountryName);

		hardik.jerseyNumber = 33;
        hardik.Cricketername = "Hardik Pandya";
		System.out.println("Jersey number : "+ hardik.jerseyNumber);
		System.out.println("cricketer name : "+ hardik .Cricketername);
		
		Cricketer rohit =new Cricketer();
		
		CountryID = 93;
		CountryName ="sai";
		
		System.out.println("Country ID : " + CountryID);
		System.out.println("Country Name :" + CountryName);


		rohit .jerseyNumber = 45;
        rohit .Cricketername = "Rohit Sharma ";
		System.out.println("Jersey number : "+ rohit .jerseyNumber);
		System.out.println("cricketer name : "+ rohit .Cricketername); 
		
		
		Cricketer vibhav =new Cricketer();
		vibhav .jerseyNumber = 03;
        vibhav .Cricketername = "Vibhav Suryavanshi ";
		System.out.println("Jersey number : "+  vibhav.jerseyNumber);
		System.out.println("cricketer name : "+ vibhav .Cricketername); 
		

		


		}

}
