package com.methods;

import java.util.Scanner;

public class ZoomCar {

	String getCompanyName(String CompanyName) {
		return CompanyName;
	}

	double getRentalRateDaily(double RentalRateDaily) {
		return RentalRateDaily;
	}

	double getBaseRentalCost(double RentalRateDaily, int numberofDays) {
		return RentalRateDaily * numberofDays;
	}

	double getInsuranceFee(double Insurancefee) {
		return Insurancefee;
	}

	double calculateTotalCost(double baseCost, double insuranceFee) {
		return baseCost + insuranceFee;
	}

	String getWelcomeMessage(String message) {
		return message;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ZoomCar z = new ZoomCar();

		System.out.println("Enter company name:");
		String CompanyName = sc.next();

		double dailyrate = 1500;

		System.out.println("Enter number of days:");
		int numberofDays = sc.nextInt();

		double insuranceFee = 500;

		String company = z.getCompanyName(CompanyName);
		double RentalRateDaily = z.getRentalRateDaily(dailyrate);
		double baseCost = z.getBaseRentalCost(RentalRateDaily, numberofDays);
		double insurance = z.getInsuranceFee(insuranceFee);
		double totalCost = z.calculateTotalCost(baseCost, insurance);
		String welcome = z.getWelcomeMessage("Welcome to ZoomCar Rentals!");

		System.out.println("\n----- ZOOMCAR RENTAL DETAILS -----");
		System.out.println(welcome);
		System.out.println("Company Name : " + company);
		System.out.println("Rental Days : " + numberofDays);
		System.out.println("Daily Rate : ₹" + dailyrate);
		System.out.println("Base Cost : ₹" + baseCost);
		System.out.println("Insurance Fee : ₹" + insurance);
		System.out.println("Total Cost : ₹" + totalCost);

		sc.close();
	}

}
