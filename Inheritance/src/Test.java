
public class Test {
	public static void main(String[] args) {
		
		//IS-A
		
		Manager manager1 = new Manager("Max", 5000, "IT", 10);
		
		//Override method runs firstly.
		manager1.displayInfo();
		manager1.makeRaise(1000);
		
	}

}
