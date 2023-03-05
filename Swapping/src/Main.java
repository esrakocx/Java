import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Swap the value of the two variable.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the 1st variable: ");
		int first = scanner.nextInt();
		
		System.out.println("Please enter the 2nd variable: ");
		int second = scanner.nextInt();
		
		System.out.println("Before swapping:\n1st number: " + first + "\n2nd number: " + second);
		
		int temp = first;
		first = second;
		second = temp;
		
		System.out.println("\nAfter swapping:\n1st number: " + first + "\n2nd number: " + second);
		
	}

}
