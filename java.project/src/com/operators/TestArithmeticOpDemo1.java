package com.operators;

import java.util.Scanner;

// WAP to do calculator with methods..?
/// 1) Arithmetic Operators
/// + - * / %

public class TestArithmeticOpDemo1 {

	void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number : ");
		float a1 = sc.nextFloat();

		System.out.println("Enter secound number : ");
		double a2 = sc.nextDouble();

		double sum = addition(a1, a2);
		double difference = subtraction(a1, a2);
		double product = multiplication(a1, a2);
		double quotient = division(a1, a2);
		double remainder = modulus(a1, a2);

		System.out.println("Addition ---> sum :" + sum);
		System.out.println("Subtraction ----> Difference :" + difference);
		System.out.println("Multiplication ---> product :" + product);
		System.out.println("Division ----> quotient : " + quotient);
		System.out.println("modulus -----> Remainder  : " + remainder);

	}

	double addition(float a, double b) {
		double sum = a + b;
		return sum;
	}

	double subtraction(float a, double b) {
		double difference = a - b;
		return difference;
	}

	double multiplication(float a, double b) {
		double product = a * b;
		return product;
	}

	double division(float a, double b) {
        double quotient = a / b;
        return quotient;
    }

    double modulus(float a, double b) {
        double remainder = a % b;
        return remainder;
    }
}
