package test5;

import java.util.Scanner;

public class DisplayInstallmentRepaymentSchedule5522 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount *  monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate,numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.println ("The monthly payment is $"+(int) (monthlyPayment * 100) / 100.0);
		System.out.println ("The total payment is $"+(int) (totalPayment * 100) / 100.0);
		System.out.println("Payment#    Interest    Principal    Balance");
		double balance = loanAmount;
		for(int i = 1;i <= numberOfYears*12;i++) {
			double interest = monthlyInterestRate*balance;
			double principal = monthlyPayment - interest ;
			balance -= principal;
			System.out.printf("%d           %.2f       %.2f     %.2f\n",i,interest,principal,balance);
		}
	}
}
