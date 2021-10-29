package test3;

import java.util.Scanner;

public class TwoCircle3329 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-,y-coordinates,radius:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		System.out.print("Enter r2's center x-,y-coordinates,radius:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		double Distance = Math.sqrt(Math.pow((x1-x2),2)+Math.pow(y1-y2,2));
		if(Distance <= Math.abs(radius1-radius2)) System.out.println("circle2 is inside circle1");
		else if(Distance <= radius1+radius2) System.out.println("circlr2 overlaps circle1");
		else System.out.println("circlr2 does not overlaps circle1");
		
		}
}
