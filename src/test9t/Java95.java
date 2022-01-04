package test9t;

import java.util.GregorianCalendar;

public class Java95 {
	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		System.out.println("Year: " + date.get(GregorianCalendar.YEAR) + " Mon: " + date.get(GregorianCalendar.MONTH) + " Day: " + date.get(GregorianCalendar.DAY_OF_MONTH));
		long k = 1234567898765L;
		date.setTimeInMillis(k);
		System.out.println("Year: " + date.get(GregorianCalendar.YEAR) + " Mon: " + date.get(GregorianCalendar.MONTH) + " Day: " + date.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
