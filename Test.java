package com.bridgelabz;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float a, b, c, h, area, perimeter;
		System.out.println("Enter length of frist side of triangle ");
		a = sc.nextFloat();
		System.out.println("Enter length of second side of triangle ");
		b = sc.nextFloat();
		System.out.println("Enter length of third side of triangle ");
		c = sc.nextFloat();
		System.out.println("Enter hight ");
		h = sc.nextFloat();
		area = b * h / 2;
		perimeter = a + b + c;
		System.out.println("Area of Triangle  = " + area);
		System.out.println("Perimeter of Triangle " + perimeter);
	}

}
