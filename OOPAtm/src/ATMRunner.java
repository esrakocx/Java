import java.util.Scanner;

public class ATMRunner {
public void run(Account account) {
		
		Login login = new Login();
		
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Welcome to the Bank!\n");
		String processes = "1- Display balance\n" + 
						   "2- Deposit money\n" + 
				           "3- Withdraw money\n" + 
				           "4- Exit";
		int chance = 3;
		
		while(true) {
			if(login.login(account)) {
				System.out.println("Login successful!");
				break;
			}
			else {
				System.out.println("Wrong password or name!");
				chance -= 1;
				System.out.println("Your remaining chance: " + chance);
			}
			if(chance == 0) {
				System.out.println("Your account is blocked!");
				return;
			}
		}
		
		while(true) {
			System.out.println(processes);
			System.out.print("Your choice: ");
			int choice = scanner.nextInt();
			
			if(choice == 4) {
				System.out.println("Exiting...");
				break;
			}
			else if(choice == 1) 
				System.out.println("Your balance: " + account.displayBalance());	
			
			else if(choice == 2) {
				System.out.print("Amount: ");
				int amount = scanner.nextInt();
				System.out.println("Your new balance: " + account.deposit(amount));
			}
			else if(choice == 3) {
				System.out.print("Amount: ");
				int amount = scanner.nextInt();
				System.out.println("Your new balance: " + account.withdraw(amount));
			}
			else
				System.out.println("Wrong input!");
		}
	}
}
