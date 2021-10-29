package test5;

import java.util.Scanner;

public class DiapalyCalendar5529 {
	public static void main(String[] args) {
		String Mouth[] = {" " , "January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};
		String Day[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String weizhi[] = {"","       ","              ","                     ","                            ","                                   ","                                          ",""};
		Scanner input = new Scanner(System.in);
		int tmp;
		System.out.print("Enter the year:");
		int year = input.nextInt();
		System.out.print("Enter the first day week:");
		int day = input.nextInt();
		tmp = day;
		for(int i = 1;i <= 7;i++) {
			System.out.printf("\n             %s 1, %d \n____________________________________________\nSun    Mon    Tue    Wed    Thu    Fri    Sat\n%s",Mouth[i],year,weizhi[tmp]);
			if(i % 2 == 1) day =  31;
			else if(i == 2) {
				if((i % 4 ==0 && i % 100 != 0)||(i % 400 == 0)) day = 29;
				else day = 28;
			}
			else day = 30;
			for(int j = 1;j <= day;j++) {
				if(tmp == 0) tmp = 7;
				if(j<10) System.out.printf("%d      ",j);
				else System.out.printf("%d     ",j);
				tmp = (tmp + 1) % 7;
				if(tmp == 0) System.out.printf("\n");
			}
		}
		for(int i = 8;i <= 12;i++) {
			System.out.printf("\n             %s 1, %d \n____________________________________________\nSun    Mon    Tue    Wed    Thu    Fri    Sat\n%s",Mouth[i],year,weizhi[tmp]);
			if(i % 2 == 1) day =  31;
			else day = 30;
			for(int j = 1;j <= day;j++) {
				if(tmp == 0) tmp = 7;
				if(j<10) System.out.printf("%d      ",j);
				else System.out.printf("%d     ",j);
				tmp = (tmp + 1) % 7;
				if(tmp == 0) System.out.printf("\n");
			}
		}
	}
}
