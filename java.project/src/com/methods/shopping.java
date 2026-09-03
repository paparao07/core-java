package com.methods;

import java.util.Scanner;

/// with return type + with parameter

public class shopping {

	 void main(String[] args) {

		System.out.println(" Shopping bill started");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter price1 of product : ");
		double price1 = sc.nextDouble();
		
		System.out.println("enter price2 product :");
		double price2 =sc.nextDouble();
		
		System.out.println("enter price3 product :");
		double price3 = sc.nextDouble();
		
		double total = calculateTotal(price1,price2,price3);
		System.out.println("Total amount :" + total);
		

        System.out.println("Enter discount percentage:");
        double discountPercent = sc.nextDouble();

        double discount = calculateDiscount(total, discountPercent);

        System.out.println("Discount Amount = " + discount);

        double finalAmount = calculateFinalAmount(total, discount);

        System.out.println("Final Amount = " + finalAmount);

        sc.close();
    }
		

	
	  double calculateTotal(double price1, double price2, double price3) {

	        double total = price1 + price2 + price3;

	        return total;
	    }

	    double calculateDiscount(double total, double discountPercent) {

	        double discount = (total * discountPercent) / 100;

	        return discount;
	    }

	    double calculateFinalAmount(double total, double discount) {

	        double finalAmount = total - discount;

	        return finalAmount;
	    }
	
}
