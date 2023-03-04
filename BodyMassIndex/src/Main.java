import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//This program calculates your body mass index.
		//Formula : kg / height(m) * height(m)		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your kg: ");
		float kg = scanner.nextFloat();
		System.out.print("Please enter your height(m, with comma(,)): ");
		float h = scanner.nextFloat();
		
		float index = kg / (h * h);
		System.out.println("Your body mass index: " + index);
		
	}

}
