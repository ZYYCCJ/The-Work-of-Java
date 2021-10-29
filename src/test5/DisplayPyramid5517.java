package test5;

import java.util.Scanner;

public class DisplayPyramid5517 {
	public static void main(String[] args) {
		System.out.print("Enter the number of lines:");
		Scanner input = new Scanner(System.in);
		int lines = input.nextInt();
		int num = lines*2+1;
		int j = 1;
		for(int i = 1;i <= lines;i++) {
			for(j = 2*i-1;j < lines*2-1;j++) System.out.print(" ");
			for(j = i;j > 1;j--) System.out.print(j+" ");
			for(j = 1;j < i;j++) System.out.print(j+" ");
			System.out.println(i);
		}
	}
}
