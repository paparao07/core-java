package com.methods;

import java.util.Scanner;

public class Subtraction {
	
	void sub(int a,int b) {
		
		int result = a - b;
		System.out.println("Subtraction : " + result);
	
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Subtraction s1 = new Subtraction();
		
		System.out.println("enter fitst value :");
		int x = sc.nextInt();
		
		System.out.println("enter secound value :");
		int y = sc.nextInt();
		
		s1.sub(x, y);

	}

}
