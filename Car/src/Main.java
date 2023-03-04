import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*This program calculates the fuel price 
		 by taking from the user how much a vehicle has burned 
		 per kilometer and how many kilometers it has traveled. */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How much your vehicle has burned per kilometer?(Example: 0,32): ");
		float per_km = scanner.nextFloat();
		
		System.out.print("How many kilometers it has traveled?: ");
		float km = scanner.nextFloat();
		
		float price = per_km * km;
		System.out.println("Total cost: " + price);
	}
}
