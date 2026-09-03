package com.fundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

class Dog{
	
}

public class  TestDataTypesDemo1{
	
	String s = "java is simple";
	String s1 = new String("paparao");//string object
	
	
	String s5 = new String();
	
	BigInteger bi1 = new BigInteger("987654321987654321987654321987654321");
	BigInteger bi2= new BigInteger("123456789123456789123456789123456789");
	
	BigDecimal bd;
	
	Integer i;
	Short sh;
	Character c;
	
	
	Dog d;

	public static void main(String[] args) {
System.out.println("main method started ");

TestDataTypesDemo1 t = new TestDataTypesDemo1();

System.out.println("String value :" + t.s);
System.out.println("String value :" + t.s1);


System.out.println(t.bi1.add(t.bi2));
System.out.println(t.bi1.multiply(t.bi2));

System.out.println("BigDecimal value :" +t.bd);
System.out.println( "Integer value :"+t.i);
System.out.println("short value :" + t.sh);
System.out.println(" character value :" +t.c);
System.out.println("dog value :" +t.d);

System.out.println("main method ended ");

	}

}
