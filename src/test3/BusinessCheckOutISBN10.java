package test3;

import java.util.Scanner;

public class BusinessCheckOutISBN10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of An ISBN as integer: ");
		int num = input.nextInt();
		int sum = 0;
		for (int i = 10; i>1  ; i--) {
			sum += (num % 10) * i;
		}
		sum %= 11;
		if(sum == 10) System.out.println(num+"X");
		else System.out.println("The ISBN-10 number is:"+num+sum);
	}
}
