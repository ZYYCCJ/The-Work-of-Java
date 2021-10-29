package test5;

public class CalculateE5526 {
	public static void main(String[] args) {
		double ans = 0;
		double sum = 1;
		for(int i = 1;i<=100000;i++) {
			sum *= i;
			ans += 1.0/sum;
			if(i % 10000 == 0) {
				System.out.printf("%d : %.7f\n",i,ans);
			}
		}
	}
}
