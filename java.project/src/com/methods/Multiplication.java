package com.methods;

//no return type + with parameter 

import java.util.Scanner;

public class Multiplication {
	
	void mul(int a, int b) {
		int result = a*b;
		System.out.println("Multiplication :"+ result);
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Multiplication m1 = new Multiplication();
		
		System.out.println("Enter first number :");
		int first = sc.nextInt(); 
		
       System.out.println("Enter secound number :");
       int second = sc.nextInt();
       
       m1.mul(first, second);
	}

}
