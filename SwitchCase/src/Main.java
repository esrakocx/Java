import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter an operation: ");
		int opr = scanner.nextInt();
		
		switch(opr) {
			case 1:
				System.out.println("1st operation.");
				break;
			case 2:
				System.out.println("2nd operation.");
				break;
			case 3:
				System.out.println("3rd operation.");
				break;
			case 4:
				System.out.println("4th operation.");
				break;
			default:
				System.out.println("Invalid operation.");
				break;
			
		}
	}
}
