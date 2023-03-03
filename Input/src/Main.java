import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		int age = scanner.nextInt();
		System.out.println("Your age: " + age);
		
		System.out.println("Please enter your height: ");
		double height = scanner.nextDouble();
		System.out.println("Your height: " + height);
		// You should enter your height with a comma(,)
		
		System.out.println("Please enter your name: ");
		scanner.nextLine(); //dummy
		String name = scanner.nextLine();
		System.out.println("Your name: " + name);
		
		System.out.println("Please enter a number: ");
		// If a user enter a wrong type:
		if(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			System.out.println("Number: " + num);
			
		}
		else 
			System.out.println("Please enter an integer number!");
		
	}	
}
