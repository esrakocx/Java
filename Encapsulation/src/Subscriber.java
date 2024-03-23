
public class Subscriber {
	public String name;
	public int balance;
	public String city;
	
	public void use_gas(int amount) {
		if((this.balance - amount) < 0) {
			System.out.print("Insufficient amount");
		}
		else {
			this.balance -= amount;
			
			if(this.balance <= 0)
				System.out.print("Your balance is run out... Please go to a subscription center." +
			"Your limit is: 120");
		}
	}
	
	public void learn_balance() {
		System.out.print("Your balance: " + this.balance);
	}

}
