package test3;

import java.util.Scanner;

public class GameLottery {
	public static void main(String[] args) {
		int key = (int)(Math.random()*900+100);
		Scanner x = new Scanner(System.in);
		System.out.print("Enter a Three Integers:");
		int num = x.nextInt();
		int tmp = 0;
		int key1 = key / 100;
		int key2 = (key / 10) % 10;
		int key3 = key % 10;
		for(int i=3;i>0;i--) {
			if(num % 10==key1) {
				if(i == 1) tmp+=2;
				else tmp++;
			}
			else if(num % 10==key2) {
				if(i == 2) tmp+=2;
				else tmp++;
			}
			else if(num % 10==key3) {
				if(i == 1) tmp+=3;
				else tmp++;
			}
			num /= num;
		}
		System.out.println("Right number is:" + key);
		switch(tmp) {
		case 0 :
			System.out.println("Not winning the lottery");
			break;
		case 6 :
			System.out.println("you win 10000$!");
			break;
		default :
			System.out.println("you win 1000$!");
		}
	}
}
