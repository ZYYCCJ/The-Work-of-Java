package test9;

public class TotalArea {
	public static void main(String[] args) {
		Circle3[] circleArray;
		
		circleArray = createCircleArray();
		
		printCircleArray(circleArray);
	}
	
	public static Circle3[] createCircleArray() { 
		Circle3[] circleArray = new Circle3[5];
		
		for(int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new Circle3(Math.random() * 100);
		}
		
		return circleArray;
	}
	
	public static void printCircleArray(Circle3[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for(int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
		}
	}
}
