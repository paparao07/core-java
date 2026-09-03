package com.scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter four integers : ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
	 int largest = a;
	 
	 if (b > largest) {
		 largest = b;
	 }
	 
	 if (c > largest) {
		 largest = c;
	 }
	 if (d > largest) {
		 largest = d;
	 }
	 System.out.println("Largest = " + largest);
	 
	 input.close();
	}
	

}
