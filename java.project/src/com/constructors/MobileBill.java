package com.constructors;

import java.util.Scanner;

class MobileBill {

    String mobileModel;
    int quantity;
    double price;
    double deliveryCharge;

    // Constructor 1
    MobileBill() {
        this("Unknown");
    }

    // Constructor 2
    MobileBill(String mobileModel) {
        this(mobileModel, 0);
    }

    // Constructor 3
    MobileBill(String mobileModel, int quantity) {
        this(mobileModel, quantity, 0);
    }

    // Constructor 4
    MobileBill(String mobileModel, int quantity, double price) {
        this(mobileModel, quantity, price, 0);
    }

    // Constructor 5
    MobileBill(String mobileModel, int quantity, double price,
               double deliveryCharge) {

        this.mobileModel = mobileModel;
        this.quantity = quantity;
        this.price = price;
        this.deliveryCharge = deliveryCharge;
    }

    // Calculate mobile cost
    double calculateMobileCost() {
        return price * quantity;
    }

    // Calculate final bill
    double calculateFinalBill() {
        return calculateMobileCost() + deliveryCharge;
    }

    // Display bill
    void displayBill() {
        System.out.println("\n----- MOBILE BILL -----");
        System.out.println("Mobile Model   : " + mobileModel);
        System.out.println("Quantity       : " + quantity);
        System.out.println("Price          : ₹" + price);
        System.out.println("Mobile Cost    : ₹" + calculateMobileCost());
        System.out.println("Delivery Charge: ₹" + deliveryCharge);
        System.out.println("Final Bill     : ₹" + calculateFinalBill());
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Delivery Charge: ");
        double deliveryCharge = sc.nextDouble();

        // Calling parameterized constructor
        MobileBill bill = new MobileBill(
                model, quantity, price, deliveryCharge
        );

        bill.displayBill();

        sc.close();
    }
}
