package test9t;

import java.util.Scanner;

public class Java911 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c,d,e,f;
		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		System.out.print("Enter c: ");
		c = input.nextInt();
		System.out.print("Enter d: ");
		d = input.nextInt();
		System.out.print("Enter e: ");
		e = input.nextInt();
		System.out.print("Enter f: ");
		f = input.nextInt();
		LinearEquation tmp = new LinearEquation(a, b, c, d, e, f);
		if(!tmp.isSolvable()) System.out.println("The equation has no solution");
	}
}
class LinearEquation{
	private int a,b,c,d,e,f;
	LinearEquation(int a, int b, int c, int d, int e,int f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	int getA() {
		return this.a;
	}
	int getB() {
		return this.b;
	}
	int getC() {
		return this.c;
	}
	int getD() {
		return this.d;
	}
	int getE() {
		return this.e;
	}
	int getF() {
		return this.f;
	}
	
	boolean isSolvable() {
		return !(this.a * this.d - this.b * this.c == 0);
	}
	float getX() {
		return (this.e * this.d - this.b * this.f)/(this.a * this.d - this.b * this.c);
	}
	float getY() {
		return (this.a * this.f - this.e * this.c)/(this.a * this.d - this.b * this.c);
	}
}