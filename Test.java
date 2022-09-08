package com.bridgelabz;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

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
