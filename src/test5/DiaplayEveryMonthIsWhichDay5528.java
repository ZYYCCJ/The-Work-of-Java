package test5;

import java.util.Scanner;

public class DiaplayEveryMonthIsWhichDay5528 {
	public static void main(String[] args) {
		String Mouth[] = {" " , "January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};
		String Day[]= {"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year:");
		int year = input.nextInt();
		System.out.print("Enter the first day week:");
		int day = input.nextInt();
		for(int i = 1;i <= 7;i++) {
			System.out.printf("%s 1, %d is %s\n",Mouth[i],year,Day[day]);
			if(i % 2 == 1) day = (day + 31) % 7;
			else if(i == 2) {
				if((i % 4 ==0 && i % 100 != 0)||(i % 400 == 0)) day = (day + 29) % 7;
				else day = (day + 28) % 7;
			}
			else day = (day + 30) % 7;
			if (day == 0) day = 7;
		}
		for(int i = 8;i <= 12;i++) {
			System.out.printf("%s 1, %d is %s\n",Mouth[i],year,Day[day]);
			if(i % 2 == 0) day = (day + 31) % 7;
			else day = (day + 30) % 7;
			if (day == 0) day = 7;
		}
	}
}
