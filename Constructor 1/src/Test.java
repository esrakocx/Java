
public class Test {
	
	public static void main(String[] args) {
		
		Account account1 = new Account();
		Account account2 = new Account("12345", 1000.0, "Max", "max@gmail.com", "+95596868");
		Account account3 = new Account("Sarah", "sarah@gmail.com", "+673568543");
		
		account2.deposit(100);
		account2.withdraw(500);
		account2.withdraw(700);
		
		//default value
		System.out.println(account1.getName());
		
		System.out.println(account3.getAccountNumber());
		System.out.println(account3.getEmail());
		
		System.out.println();
		
		account1.displayInfo();
		account2.displayInfo();
		account3.displayInfo();
	}
}
