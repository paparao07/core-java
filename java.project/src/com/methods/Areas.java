package com.methods;

/// with return type + with parameter
/// find area of triangle : 0.5 * base * height 
/// find area of rectangle : length * breadth 
/// find area of square : side * side find area of circle : PI * r * r

import java.util.Scanner;

public class Areas {

	void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter side :");
		double side = sc.nextDouble();
		double sq = areaofSq(side);
		System.out.println("area of square :" + sq);

		System.out.println("enter base :");
		double b = sc.nextDouble();
		System.out.println("enter height :");
		double h = sc.nextDouble();
		double tri = areaofTriangle(b, h);
		System.out.println("Area of triangle :" + tri);

		System.out.println("enter length :");
		double length = sc.nextDouble();
		System.out.println("enter breadth");
		double breadth = sc.nextDouble();
		double rect = areaofRec(length, breadth);
		System.out.println("Area of rectangle :" + rect);

	}

	double areaofTriangle(double base, double height) {
		double tri = 0.5 * base * height;
		return tri;
	}

	double areaofRec(double length, double breadth) {
		double rect = length * breadth;
		return rect;
	}

	double areaofSq(double side) {
		double sq = side * side;
		return sq;
	}
}
