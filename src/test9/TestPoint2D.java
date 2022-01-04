package test9;

import java.util.Scanner;
public class TestPoint2D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point1's x-, y-coordinates: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter point2's x-, y-coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		
		System.out.println("The distance between p1 and p2 is " + p1.distance(p2));
		System.out.println("The mid point between p1 and p2 is " + p1.midpoint(p2).toString());
	}
}

class Point2D{
	double x;
	double y;
	
	Point2D(){	
		this.x = 0;
		this.y = 0;
	}
	
	Point2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	double distance(double x, double y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}
	
	double distance(Point2D p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	Point2D midpoint(Point2D p) {
		Point2D midP = new Point2D();
		midP.x = (this.x + p.x)/2;
		midP.y = (this.y + p.y)/2;
		return midP;
	}
	
	public String toString() {
		String str = "(";
		str += x;
		str += ",";
		str += y;
		str += ")";
		return str;
	}
}
