package test3;

import java.util.Scanner;

public class TriangleJudge {
	public static void main(String[] args) {
		System.out.print("Enter the first length of an edge:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.print("Enter the second length of an edge:");
		int b = input.nextInt();
		System.out.print("Enter the third length of an edge:");
		int c = input.nextInt();
		if( a + b > c && b + c > a && a + c >b ) System.out.println("The perimeter:"+(a+b+c));
		else System.out.println("Error input");
	}
}
