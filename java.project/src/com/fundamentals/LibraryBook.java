package com.fundamentals;

public class LibraryBook {

   static int bookId;
   static String bookTitle;
   static String authorName;
   
   int availableCopies;
   String libraryName;
   String libraianname;
   
	public static void main(String[] args) {
			
	LibraryBook b1 = new LibraryBook();

	 bookId = 1;
	 bookTitle = "Vcube";
	 authorName = "Srikanth";
	 
	 b1.availableCopies = 10;
	 b1.libraryName = "java";
	 b1.libraianname = "vishvanadh";
	 
	 
	 System.out.println("*********Library Details********");
	 
	 System.out.println("bookId : " + bookId);
	 System.out.println("bookTitle : "+ bookTitle);
	 System.out.println("authorName : "+ authorName);
	 
	 
	 System.out.println("*********Library Details********");
	 
	 
	 System.out.println("availableCopies : "+ b1.availableCopies);
	 System.out.println("libraryName : "+ b1.libraryName);
	 System.out.println("libraianname : "+ b1.libraianname);

	}

}
