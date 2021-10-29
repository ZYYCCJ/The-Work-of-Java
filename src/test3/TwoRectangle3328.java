package test3;

import java.util.Scanner;

public class TwoRectangle3328 {	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter r1's center x-,y-coordinates,width,and height:");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	double width1 = input.nextDouble();
	double height1 = input.nextDouble();
	System.out.print("Enter r2's center x-,y-coordinates,width,and height:");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double width2 = input.nextDouble();
	double height2 = input.nextDouble();
	if(Math.abs(x1-x2)<(width1+width2)/2 && Math.abs(y1-y2)<(height1+height2)/2) {
		if((width1>(width2+2*Math.abs(x1-x2)))&&(height1)>(height2+2*Math.abs(y1-y2))) System.out.println("r2 is inside r1");
		else System.out.println("r2 overlaps r1");
		}
	else System.out.println("r2 does not overlaps r1");
	
	}
}