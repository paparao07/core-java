package com.scanner;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer : ");
        int number = input.nextInt();
        int number1 = input.nextInt();
        
        
        if (number % 5 == 0) {
        	System.out.println("Divisible by 5 ");
        } else {
        	    System.out.println("Not divisible by 5 ");
        	 
        }
   
        
        if (number1 % 6 == 0) {
        	System.out.println("Divisible by 6 ");
        } else {
        	    System.out.println("Not divisible by 6 ");
        	 
        }
   
       input.close(); 
       input.close();
        
       
     
	}

}
