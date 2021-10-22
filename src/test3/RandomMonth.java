package test3;

public class RandomMonth {
	public static void main(String[] args) {
		String Mouth[] = {" " , "January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};
		int x=(int)(11*Math.random())+1;
		System.out.print(x);
		System.out.println("->"+Mouth[x]);
	}
}
