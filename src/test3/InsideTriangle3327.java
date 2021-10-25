package test3;

import java.util.Scanner;

public class InsideTriangle3327 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		if(x>0 && y>0 && x/2+y < 100) System.out.println("Point ("+x+","+y+") is in the triangle");
		else System.out.println("Point ("+x+","+y+") is not in the triangle");
	}
}
