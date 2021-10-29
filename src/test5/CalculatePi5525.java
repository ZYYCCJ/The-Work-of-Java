package test5;

public class CalculatePi5525 {
	public static void main(String[] args) {
		for(int i = 10000;i<=100000;i += 10000) {
			double ans = 0;
			double f = 1;
			for(int j = 1;j <= 2 * i - 1;j += 2) {
				ans += f / j;
				f = -f;
			}
			System.out.printf("%d : %.7f\n",i,ans*4);
		}
	}
}
