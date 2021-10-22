package test3;

import java.util.Scanner;

public class IsItInSideTheCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates:");
		int x = input.nextInt();
		int y = input.nextInt();
		if(x*x+y*y < 100) System.out.println("Point ("+x+","+y+") is in the circle");
		else System.out.println("Point ("+x+","+y+") is not in the circle");
	}
}
