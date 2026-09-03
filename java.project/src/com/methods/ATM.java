package com.methods;

public class ATM {

	static String bankname = "State Bank of India";

	long accountnumber;
	double balance;

	double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	double withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient Balance");
		}
		return balance;
	}

	double balance() {
		return balance;
	}

	public static void main(String[] args) {

		ATM a1 = new ATM();
		ATM a2 = new ATM();

		a1.accountnumber = 10000001;
		a1.balance = 20000.00;

		System.out.println("----- Account 1 -----");

		double balance1 = a1.deposit(2000);
		System.out.println("After Deposit: " + balance1);

		balance1 = a1.withdraw(1000);
		System.out.println("After Withdrawal: " + balance1);

		a2.accountnumber = 2000002;
		a2.balance = 30000.00;

		System.out.println("----- Account 2 -----");
		double balance2 = a2.deposit(2000);
		System.out.println("After Deposit: " + balance2);

		balance2 = a2.withdraw(1000);
		System.out.println("After Withdrawal: " + balance2);
		
		  System.out.println("\n----- Final Balance -----");

	        System.out.println("Bank Name: " + ATM.bankname);
	        System.out.println("Account Number: " + a1.accountnumber);
	        System.out.println("Balance: " + a1.balance());

	        System.out.println();

	        System.out.println("Bank Name: " + ATM.bankname);
	        System.out.println("Account Number: " + a2.accountnumber);
	        System.out.println("Balance: " + a2.balance());

	}

}
