import java.util.Scanner;

public class Main {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int multiply(int a, int b, int c) {
		return a * b * c;
	}
		
	public static double divide(int a, int b) {
		return (double)(a / b);
	}
	
	public static int subtract(int a, int b) {
		 return a - b;
	}
	
	public static void main(String[] args) {
		
		//Usage of overloading
		Scanner scanner = new Scanner(System.in);
		
		String process = "1 - Addition\n" + 
						 "2 - Subtraciton\n" +
						 "3 - Multiplication\n" +
						 "4 - Division\n" + 
						 "5 - Exit";
		System.out.println("**********************");
		System.out.println(process);
		System.out.println("**********************");
		
		while(true) {
			
			System.out.print("\nYour choice: ");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				System.out.print("How many number do you want to add?(2 or 3): ");
				int choice2 = scanner.nextInt();
				
				if(choice2 == 2){
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					
					System.out.print("Result: " + add(a, b));
				}
				else if(choice2 == 3) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					System.out.print("c : ");
					int c = scanner.nextInt();

					System.out.println("Result: " + add(a, b, c));
				}
				else
					System.out.println("Invalid argument!");
			}
			
			else if(choice == 2) {
				System.out.print("a : ");
				int a = scanner.nextInt();
				System.out.print("b : ");
				int b = scanner.nextInt();

				System.out.println("Result: " + subtract(a, b));
			}
			
			else if(choice == 3) {
				System.out.print("How many number do you want to multiply?(2 or 3): ");
				int choice2 = scanner.nextInt();
				
				if(choice2 == 2) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();

					System.out.println("Result: " + multiply(a, b));
				}
				else if(choice2 == 3) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					System.out.print("c : ");
					int c = scanner.nextInt();

					System.out.println("Result: " + multiply(a, b, c));
				}
				else {
					System.out.println("Invalid argument!");
				}
			}
			else if(choice == 4) {
				System.out.print("a : ");
				int a = scanner.nextInt();
				System.out.print("b : ");
				int b = scanner.nextInt();

				System.out.println("Result: " + divide(a, b));
			}
			else if(choice == 5) {
				System.out.println("Exiting...");
				break;
			}
			else
				System.out.println("Invalid input!");
		}
		
	}

}
