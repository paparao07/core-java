package com.fundamentals;

public class LibraryBook2 {
	
    // Book-specific variables
	int bookid;
	String booktitle;
	String authorname;
	int availablecopies;

    // Common library variables
	static String libraryname;
	static String librarianname;

	   // Method to display book details
	void displayBookDetails() {
		System.out.println("bookid : " + bookid);
		System.out.println("booktitle : " + booktitle);
		System.out.println("authorname :" + authorname);
		System.out.println("availablecopies : " + availablecopies);
	}
	
    // Method to display library details
	static void displayLibraryDetails() {
		System.out.println("Libraryname     : " + libraryname);
		System.out.println("Librarianname   : " + librarianname);
	}

	// Method to issue a book
	void issueBook() {
		if (availablecopies > 0) {
			availablecopies--;
			System.out.println("Book issued successfully.");
		} else {
			System.out.println("Book is not available.");
		}
	}

	// Method to change librarian
	static void changeLibrarian(String newLibrarian) {
		librarianname = newLibrarian;
	}

	public static void main(String[] args) {

        // Assign common library details
		libraryname = "City Central Library";
		librarianname = "Ramesh";
		
		
		 // Create  objects
		LibraryBook2 book1 = new LibraryBook2();

		book1.bookid = 101;
		book1.booktitle = "Java Programming";
		book1.authorname = "James Gosling";
		book1.availablecopies = 5;

		LibraryBook2 book2 = new LibraryBook2();

		book2.bookid = 102;
		book2.booktitle = "Python Basics";
		book2.authorname = "Guido van Rossum";
		book2.availablecopies = 3;

		// Display library details
		System.out.println("===== LIBRARY DETAILS =====");
		LibraryBook2.displayLibraryDetails();

		// Display book details
		System.out.println("\n===== BOOK 1 DETAILS =====");
		book1.displayBookDetails();

		System.out.println("\n===== BOOK 2 DETAILS =====");
		book2.displayBookDetails();

		// Issue one copy of each book
		System.out.println("\n===== ISSUING BOOKS =====");
		book1.issueBook();
		book2.issueBook();

		// Display updated book details
		System.out.println("\n===== UPDATED BOOK DETAILS =====");

		System.out.println("\nBook 1:");
		book1.displayBookDetails();

		System.out.println("\nBook 2:");
		book2.displayBookDetails();

		System.out.println("\n===== CHANGING LIBRARIAN =====");
		LibraryBook2.changeLibrarian("Suresh");
		LibraryBook2.displayLibraryDetails();

		System.out.println("\n===== CHANGING LIBRARIAN =====");
		LibraryBook2.changeLibrarian("KIMIDI");
		LibraryBook2.displayLibraryDetails();
	}
}
