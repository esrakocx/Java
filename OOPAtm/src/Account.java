
public class Account {
	
	private String name;
	private String password;
	private int balance;
	
	public Account(String name, String password, int balance) {
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int displayBalance() {
		return this.balance;
	}
	
	public int deposit(int amount) {
		balance += amount;
		
		return balance;
	}
	
	public int withdraw(int amount) {
		if(balance - amount > 0)
			balance -= amount;
		else 
			System.out.println("Insufficient balance!");
		
		return balance;
	}
}
