
public class Main {
	
	public static void main(String[] args) {
		ATMRunner runner = new ATMRunner();
		Account account = new Account("Mark Zuckerberg", "12345", 1000);
		
		runner.run(account);
	}
}
