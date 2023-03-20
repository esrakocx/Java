import java.util.Scanner;

public class Main {
	
	public static void hello() {
		System.out.println("Hello user!");
	}
	
	public static void say_hi(String name) {
		System.out.println("Hello " + name);
	}
	
	public static int factorial(int number) {
		
		int fact = 1;
		
		for(int i=1; i<=number; i++)
			fact *= i;
		
		return fact;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is your name? : ");
		String name = scanner.nextLine();
		
		hello();
		say_hi(name);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		System.out.println(number+ "! = " + factorial(number));
		
	}

}
