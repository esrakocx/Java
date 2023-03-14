import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		 It's an ATM program.
		 
		  Processes:
		  1- Find out balance
		  2- Withdraw money
		  3- Deposit money
		  4- Exit		 
		 
		*/
		
		Scanner scanner = new Scanner(System.in);
		double balance = 1000;
		int choice, amount;
		
		while(true) {
			System.out.println("1- Find out balance\r\n"
					+ "2- Withdraw money\r\n"
					+ "3- Deposit money\r\n"
					+ "4- Exit	\n");
			System.out.print("Please choose your process: ");
			choice = scanner.nextInt();
			
			if(choice == 1)
				System.out.println("Balance: " + balance + "\n");
			
			else if(choice == 2) {
				System.out.print("Enter your amount: ");
				amount = scanner.nextInt();
				if(balance - amount < 0)
					System.out.println("Unsufficient balance!\n");
				else {
					balance -= amount;
					System.out.println("Successful! Your current balance: " + balance + "\n");
				}
					
			}
			
			else if(choice == 3) {
				System.out.print("Enter your amount: ");
				amount = scanner.nextInt();
				balance += amount;
				System.out.println("Successful! Your current balance: " + balance + "\n");
			}
			
			else if(choice == 4) {
				System.out.println("Exiting...");
				break;
			}
			
			else
				System.out.println("Invalid input!");
		}
	}

}
