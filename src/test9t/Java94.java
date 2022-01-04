package test9t;

import java.util.Random;

public class Java94 {
	public static void main(String[] args) {
		Random rand = new Random(1000);
		for(int i = 0; i < 50; i++) {
			System.out.println(rand.nextInt(100));
		}
	}
}
