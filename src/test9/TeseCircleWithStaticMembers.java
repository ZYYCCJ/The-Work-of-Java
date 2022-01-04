package test9;

public class TeseCircleWithStaticMembers {
	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " + Circle2.numberOfObjects);
		
		Circle2 c1 = new Circle2();
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + c1.numberOfObjects + ")");
		
		Circle2 c2 = new Circle2();
		System.out.println("\nAfter creating c2");
		System.out.println("c2: radius (" + c2.radius + c2.numberOfObjects + ")");
	}
}
