package com.methods;

//no return type + with parameter 

import java.util.Scanner;

public class Addition {

	void add(int a,int b) {
		int result = a + b;

        System.out.println("Addition = " + result);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
         Addition a1 = new Addition();
         
         System.out.println("enter first number :" ); 
         int x = sc.nextInt();
         
         System.out.println("Enter secound number :");
          int y = sc.nextInt();
          
          a1.add(x, y);
          
        		 
	}

}
