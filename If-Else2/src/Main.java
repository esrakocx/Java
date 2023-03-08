import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter an operation number: ");
		int opr = scanner.nextInt();
		
		if(opr == 1)
			System.out.println("First operation.");
		else if(opr == 2)
			System.out.println("Second operation.");
		else if(opr == 3)
			System.out.println("Third operation.");
		else if(opr == 4)
			System.out.println("Fourth operation.");
		else
			System.out.println("Invalid operation!");

	}

}
