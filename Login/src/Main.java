import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//User login screen
		//user name = user01
		//user password = qwerty123
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "user01";
		String password = "qwerty123";
		int chance = 2;
		
		while(true) {
			
			System.out.print("User Name: ");
			String user_name = scanner.nextLine();
			
			System.out.print("Password: ");
			String user_password = scanner.nextLine();
			
			if(user_name.equals(name)) {
				if(user_password.equals(password)) {
					System.out.println("Login successful!");
					break;
				}
				else {
					System.out.println("Wrong password! Try again...");
					chance--;
				}
			}
			else {
				System.out.println("Wrong user name! Try again...");
				chance--;
			}
			
			if(chance < 0) {
				System.out.println("Your account is blocked! Change your password.");
				break;
			}
				
		}
		
	}

}
