package test5;

import java.util.Scanner;

public class DifferentRate5521 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount:");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years:");
		int numberOfYears = input.nextInt();
		System.out.println("Interest Rate   Monthly Payment   Total Payment:");
		for(double annualInterestRate = 5;annualInterestRate<=8;annualInterestRate+=1.0/8) {
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayment = loanAmount *  monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate,numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;
			System.out.printf("%.3f"+"%%          "+"%.2f            "+"%.2f\n",annualInterestRate,monthlyPayment,totalPayment);
		}
	}
}
