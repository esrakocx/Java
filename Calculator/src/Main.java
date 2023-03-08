import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your operation(+,-,/,*): ");
		char opr = scanner.next().charAt(0);
		
		System.out.print("1st number: ");
		double num1 = scanner.nextDouble();
		System.out.print("2nd number: ");
		double num2 = scanner.nextDouble();
		
		switch(opr) {
			case '+':
				double result = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + result );
				break;
				
			case '-':
				result = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + result );
				break;
				
			case '/':
				result = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + result );
				break;
				
			case '*':
				result = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + result );
				break;
			
			default:
				System.out.println("You may have entered an invalid operation.");
				break;
		}
	}
}
