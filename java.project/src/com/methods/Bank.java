package com.methods;

//no return type + with parameter 


import java.util.Scanner;

public class Bank {

	double balance = 10000.00;

	void main(String[] args) {

		System.out.println("welcome to vcube bank");
		showBalance();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deposite amount is :");
		double amount= sc.nextDouble();
		deposite(amount);
		
		System.out.println("Withdraw amount is :");
		double amount1 = sc.nextDouble();
		withdraw(amount1);

	}

	void deposite(double amount) {
		balance = balance + amount;
		showBalance();
	}
	
	void withdraw(double amount) {
		balance = balance- amount;
		showBalance();
	}

	void showBalance() {
		System.out.println("current balance is " + balance);
		System.out.println("thank you!! ");

	}

}

