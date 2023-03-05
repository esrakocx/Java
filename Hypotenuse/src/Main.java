import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//It finds the hypotenuse of the right triangle
		
		System.out.print("Please enter the first side of the triangle: ");
		int a = scanner.nextInt();
		System.out.print("Please enter the second side of the triangle: ");
		int b = scanner.nextInt();
		
		double hypotenuse = Math.sqrt(a * a + b * b); 
		
		System.out.println("Hypotenuse of the triangel: " + hypotenuse);
	}

}
