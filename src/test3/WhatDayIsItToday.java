package test3;

import java.util.Scanner;

public class WhatDayIsItToday {
	public static void main(String[] args) {
		String[] a= {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year:(e.g,2012)");
		int year = input.nextInt();
		System.out.print("Enter month:(1-12)");
		int month = input.nextInt();
		System.out.print("Enter day:(1-31)");
		int day = input.nextInt();
		if(month <3) month = month += 12;
		int ans = (day+26*(month+1)/10+(year%100)/4+(year%100)+(year/100)/4+(year/100)*5)%7;
		System.out.println("Day of the week is:"+a[ans]);
	}
}
