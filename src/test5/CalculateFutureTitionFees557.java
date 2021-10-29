package test5;

public class CalculateFutureTitionFees557 {
	public static void main(String[] args) {
		double fees = 10000;
		double sum = 0;
		for(int i = 1;i < 15;i++) {
			if(i>9) sum += fees;
			fees *= 1.05; 
		}
		System.out.println("Fees : "+sum+" $");
	}
}
