package com.operators;

///2) Assignment Operators
/// =  += -=  *=  /=  %=


public class TestAssignmentOpDemo2 {

	public static void main(String[] args) {
		
		int result = 5;
		
//Type mismatch: cannot convert from double to int		
//		result = result + 4.5;
//		result = (int) (result +4.5);

		result += 4.5;
		System.out.println("result is : "+ result );
		
		
		result -= 3.5;
		System.out.println("result is : "+ result );
		
		result *= 4.3;
		System.out.println("result is : "+ result );
		
		result /= 3.5; // 21/3.5 ---> 6
		System.out.println("result is : "+ result );
		
		result %= 2.5;
		System.out.println("result is : "+ result );
		
	}

}
