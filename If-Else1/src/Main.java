import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		int age = scanner.nextInt();
		
		if(age < 18)
				System.out.println("You cannot enter the club!");
		else
			System.out.println("You can enter the club!");
		
		System.out.print("Please enter a number: ");
		int number = scanner.nextInt();
		
		if(number < 0)
			System.out.println("Your number is negative!");
		else
			System.out.println("Your number is zero or positive!");
	}
}
