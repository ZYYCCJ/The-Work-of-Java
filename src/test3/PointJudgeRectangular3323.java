package test3;

import java.util.Scanner;

public class PointJudgeRectangular3323 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		if(Math.abs(x)<=5 && Math.abs(y)<=2.5) System.out.println("Point ("+x+","+y+") is in the rectangular");
		else System.out.println("Point ("+x+","+y+") is not in the rectangular");
	}
}
