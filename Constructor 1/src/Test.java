
public class Test {
	
	public static void main(String[] args) {
		
		Account account1 = new Account();
		Account account2 = new Account("12345", 1000.0, "Max", "max@gmail.com", "");
		
		account2.deposit(100);
		account2.withdraw(500);
		account2.withdraw(700);
	}
}
