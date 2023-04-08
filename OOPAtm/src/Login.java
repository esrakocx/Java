import java.util.Scanner;

public class Login {
	
	public boolean login(Account account) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Password: ");
		String password = scanner.nextLine();
		
		if(account.getName().equals(name) && account.getPassword().equals(password)) 
			return true;
		
		else 
			return false;
		
	}
}
