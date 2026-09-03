package com.fundamentals;

public class LibraryBook1 {

	static String bookTitle = "Vcube";
	static int bookId;

	int availableCopies;
	String libraryName;
	String libraianname;
	String authorName;

	static {
		System.out.println(" Welcome to Library ");
		bookId = 0;
	}

	{
		bookId++;
	}

	static void displaybookTitle() {
		System.out.println("bookTitle : " + bookTitle);
		System.out.println("bookId : " + bookId);
	}

	void displaylibrary() {
		System.out.println("availableCopies : " + availableCopies);
		System.out.println("libraryName : " + libraryName);
		System.out.println("libraianname  " + libraianname);
		System.out.println("authorName : " + authorName);
	}

	public static void main(String[] args) {

		LibraryBook1 l1 = new LibraryBook1();

		l1.availableCopies = 21;
		l1.libraryName = "Vishva Kavi";
		l1.libraianname = " Kimidi sai";
		l1.authorName = "yesu";

		LibraryBook1 l2 = new LibraryBook1();

		l2.availableCopies = 22;
		l2.libraryName = "Adhi Kavi";
		l2.libraianname = "  sai";
		l2.authorName = "murali";
		
		displaybookTitle();

		l1.displaylibrary();
		l2.displaylibrary();

	}

}
