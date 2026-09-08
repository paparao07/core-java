package com.constructors;

import java.util.Scanner;

public class HotelBill {

	String roomType;
	int numberOfDays;
	double roomPrice;
	double foodCharges;

	HotelBill() {

		this("Unknown");
	}

	HotelBill(String roomType) {

		this(roomType, 0);
	}

	HotelBill(String roomType, int numberOfDays) {

		this(roomType, numberOfDays, 0);
	}

	HotelBill(String roomType, int numberOfDays, double roomPrice) {

		this(roomType, numberOfDays, roomPrice, 0);
	}

	HotelBill(String roomType, int numberOfDays, double roomPrice, double foodCharges) {

		this.roomType = roomType;
		this.numberOfDays = numberOfDays;
		this.roomPrice = roomPrice;
		this.foodCharges = foodCharges;

	}

	// Calculate room cost
	double calculateRoomCost() {
		return roomPrice * numberOfDays;
	}

	// Calculate final bill
	double calculateFinalBill() {
		return calculateRoomCost() + foodCharges;
	}

	// Display bill
	void displayBill() {
		System.out.println("\n----- HOTEL BILL -----");
		System.out.println("Room Type       : " + roomType);
		System.out.println("Number of Days  : " + numberOfDays);
		System.out.println("Room Price      : ₹" + roomPrice);
		System.out.println("Food Charges    : ₹" + foodCharges);
		System.out.println("Room Cost       : ₹" + calculateRoomCost());
		System.out.println("Final Bill      : ₹" + calculateFinalBill());
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Room Type: ");
		String roomType = sc.nextLine();

		System.out.print("Enter Number of Days: ");
		int numberOfDays = sc.nextInt();

		System.out.print("Enter Room Price: ");
		double roomPrice = sc.nextDouble();

		System.out.print("Enter Food Charges: ");
		double foodCharges = sc.nextDouble();

		HotelBill h = new HotelBill(roomType, numberOfDays, roomPrice, foodCharges);

	}

}
