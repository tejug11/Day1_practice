package com.bridgelabz;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Test t1 = new Test();

		int choice = 0;
		while (choice != 5) {
			Scanner sc = new Scanner(System.in);

			System.out.println("MENU");
			System.out.println("1.Area of Rectangle");
			System.out.println("2.Area of Circle");
			System.out.println("3.Area of Triangle");
			System.out.println("5.exit");
			System.out.println("Please enter any above option ::");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				t1.Rectangle();
				break;
			case 2:
				t1.Triangle();

				break;
			case 3:
				t1.circle();
				break;
			}

		}
	}

	public void Rectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int a = sc.nextInt();
		System.out.println("Enter the weidth");
		int b = sc.nextInt();

		int p, area;
		p = a * b;
		area = 2 * (a + b);
		System.out.println("Rectangle of area = " + area);
		System.out.println("Rectangle of perimeter " + p);
	}

	public void Triangle() {
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

	public void circle() {
		int r;
		double pi = 3.14, area, perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle ");
		r = sc.nextInt();
		area = pi * r * r;
		perimeter = 2 * pi * r;
		System.out.println("area of circle = " + area);
		System.out.println("Perimeter of circle = " + perimeter);

	}
}
