package test5;

public class DisplayALeapYear5527 {
	public static void main(String[] args) {
		int tmp = 1;
		int total = 0;
		for(int i = 101;i <= 2100;i++) {
			if((i % 4 ==0 && i % 100 != 0)||(i % 400 == 0)) {
				total ++;
				System.out.printf("%d", i);
				if(tmp % 10 == 0) System.out.printf("\n");
				else System.out.printf(" ");
				tmp = tmp % 10 + 1;
			}
		}
		System.out.printf("\nTotal Amount:%d",total);
	}
}
