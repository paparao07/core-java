package com.fundamentals;

public class Star {
	
	static String heroname;
	static int totalmovies;
	
	  int heromovieno;
	String heromoviename;


	public static void main(String[] args) {
    System.out.println("Welcome To TOllywood");
    System.out.println("main method started");
    
    heroname = "Prabhas";
    totalmovies = 24;
    
      Star pb = new Star();
    
    pb. heromovieno = 25;
    pb.heromoviename = "Sprit";
    
    System.out.println("heroname : " + heroname);
    System.out.println("totalmovies : " + totalmovies);
    
    System.out.println("hreomovieno : "+ pb.heromovieno);
    System.out.println("heromoviename : "+ pb.heromoviename);
    
    
    heroname = "RAm Charan";
    totalmovies = 16;
    
      Star rc = new Star();
    
    rc. heromovieno = 17;
    rc.heromoviename = "peddi";
    
    System.out.println("heroname : " + heroname);
    System.out.println("totalmovies : " + totalmovies);
    
    System.out.println("hreomovieno : "+ rc.heromovieno);
    System.out.println("heromoviename : "+ rc.heromoviename);
    
    System.out.println("main method ended");

	}

}
