
public class Main {
	public static void main(String[] args) {
		
		Account account1 = new Account("Mark", "mark@gmail.com", "1264459");
		Account account2 = account1;
		
		if(account1 == account2)
			System.out.println("They are the same references."); //true one.
		else
			System.out.println("They are not the same references.");
		
		Account account3 = new Account();
		
		if(account1 == account3)
			System.out.println("They are the same references.");
		else
			System.out.println("They are not the same references."); //true one.
		
	}

}
