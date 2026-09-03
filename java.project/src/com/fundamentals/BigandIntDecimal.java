package com.fundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

public class BigandIntDecimal {

	public static void main(String[] args) {
		
		// BigInteger values
		BigInteger num1 = new BigInteger("987654321987654321987654321");
		BigInteger num2 = new BigInteger("123456789123456789123456789");
		
		  // Add BigInteger values
        BigInteger bigIntegerResult = num1.add(num2);
        
        // Display values
        System.out.println("BigInteger Number 1 : " + num1);
        System.out.println("BigInteger Number 2 : " + num2);
        System.out.println("BigInteger Addition  : " + bigIntegerResult);

        System.out.println();
        
        
        // BigDecimal values
        BigDecimal price1 = new BigDecimal("125000.75");
        BigDecimal price2 = new BigDecimal("34999.50");

     // Add BigDecimal values
        BigDecimal bigDecimalResult = price1.add(price2);

        System.out.println("BigDecimal Price 1 : " + price1);
        System.out.println("BigDecimal Price 2 : " + price2);
        System.out.println("BigDecimal Addition : " + bigDecimalResult);

	}

}
