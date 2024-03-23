
public class Main {

	public static void main(String[] args) {
		
		/*
		Subscriber sub = new Subscriber();
		sub.name = "Esra";
		sub.balance = 200;
		sub.city = "Ankara";
		
		sub.use_gas(200);
		*/
		
		AdvancedSubscriber as = new AdvancedSubscriber("Esra", 200, "Ankara");
		as.learn_balance(); //it will not change, still 120 not 200 because of encapsulation

	}

}
