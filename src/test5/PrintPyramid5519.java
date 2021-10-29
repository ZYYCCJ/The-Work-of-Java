package test5;

public class PrintPyramid5519 {
	public static void main(String[] args) {
		int j;
		int tmp;
		for(int i = 0;i < 8;i++) {
			for(j = 0;j < 4*(7-i)-2;j++) System.out.print(" ");
			for(j = 0;j <= i;j++) {
				tmp = (int)(Math.pow(2, j));
				if(tmp > 100 ) System.out.print(" ");
				else if(tmp > 10) System.out.print("  ");
				else if(i == 7 && j == 0) System.out.print(" ");
				else System.out.print("   ");
				System.out.print(tmp);
			}
			for(j = i-1;j >= 0;j--) {
				tmp = (int)(Math.pow(2, j));
				if(tmp > 100) System.out.print(" ");
				else if(tmp > 10) System.out.print("  ");
				else System.out.print("   ");
				System.out.print(tmp);
			}
			System.out.println();
		}
	}
}
