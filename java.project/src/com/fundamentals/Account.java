package com.fundamentals;

public class Account {

	    // Static variable for automatic account number
	    static int accountNumber = 1001;

	    // Instance variables
	    String customerName;
	    int accNo;
	    double accountBalance;
	    String accountStatus;

	    // Method to create account
	    void createAccount(String name, double balance, String status) {
	        customerName = name;
	        accountBalance = balance;
	        accountStatus = status;

	        // Automatically generate account number
	        accNo = accountNumber++;
	    }

	    // Method to display account details
	    void displayAccount() {
	        System.out.println("Customer Name   : " + customerName);
	        System.out.println("Account Number  : " + accNo);
	        System.out.println("Account Balance : " + accountBalance);
	        System.out.println("Account Status  : " + accountStatus);
	        System.out.println("--------------------------------");
	    }

	    public static void main(String[] args) {

	        // Creating 3 account objects
	        Account customer1 = new Account();
	        Account customer2 = new Account();
	        Account customer3 = new Account();

	        // Assigning account details
	        customer1.createAccount("Paparao", 25000, "Active");
	        customer2.createAccount("Ravi", 18000, "Active");
	        customer3.createAccount("Suresh", 12000, "Inactive");

	        // Displaying details
	        System.out.println("===== ATM ACCOUNT DETAILS =====");

	        customer1.displayAccount();
	        customer2.displayAccount();
	        customer3.displayAccount();
	    }
	}

