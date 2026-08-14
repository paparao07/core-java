package com.fundamentals;

public class Movie {
	
	String moviename;
	int releasedyear;
	int tecketprice;

	public static void main(String[] args) {
		
		System.out.println("*************Welcome To Telugu Movies**************");
		
		Movie m1 = new Movie();
		
		m1.moviename = "KGF";
		m1.releasedyear = 2018;
		m1.tecketprice = 150;
		
		System.out.println("moviename : "+ m1.moviename);
		System.out.println("releasedyear : "+ m1.releasedyear);
		System.out.println("tecketprice : "+ m1.tecketprice );
		
        Movie m2 = new Movie();
		
		m2.moviename = "RRR";
		m2.releasedyear = 2022;
		m2.tecketprice = 200;
		
		System.out.println("moviename : "+ m2.moviename);
		System.out.println("releasedyear : "+ m2.releasedyear);
		System.out.println("tecketprice : "+ m2.tecketprice );
		
        Movie m3 = new Movie();
		
		m3.moviename = "PUSHPA";
		m3.releasedyear = 2021;
		m3.tecketprice = 250;
		
		System.out.println("moviename : "+ m3.moviename);
		System.out.println("releasedyear : "+ m3.releasedyear);
		System.out.println("tecketprice : "+ m3.tecketprice );
		



	}

}
