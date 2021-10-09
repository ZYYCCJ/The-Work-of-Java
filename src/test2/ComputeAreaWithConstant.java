package test2;

import java.util.Scanner;

public class ComputeAreaWithConstant {
	public static void main(String[] args) {
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for radius: ");
		double radius = input.nextDouble();
		double area = radius * radius * PI;
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}
