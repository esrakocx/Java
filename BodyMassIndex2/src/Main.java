import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your weight: ");
		float weight = scanner.nextFloat();
		
		System.out.print("Please enter your height(Ex:1,70): ");
		float height = scanner.nextFloat();
		
		float bmi = weight / (height * height);
		System.out.println("Your BMI: " + bmi);
		
		if(bmi < 18.5)
			System.out.println("You are thin.");
		else if(bmi >= 18.5 && bmi < 25)
			System.out.println("You are normal.");
		else if(bmi >= 25 && bmi < 30)
			System.out.println("You are fat.");
		else
			System.out.println("Your are obese.");
	}
}
