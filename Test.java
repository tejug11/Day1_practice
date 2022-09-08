package com.bridgelabz;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

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

}
