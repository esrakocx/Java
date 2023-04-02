
public class Account {
	
	private String accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phone;
	
	public Account() {
		System.out.println("It's our constructor.");
	}
	
	public Account(String accountNumber, double balance, String name, String email, String phone) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("New balance: " + balance);
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("New balance: " + balance);
		}
			
		else
			System.out.println("Insufficient balance!");
	}
	
	//Getter and setter functions of the fields
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
