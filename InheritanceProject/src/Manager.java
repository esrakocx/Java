
public class Manager extends Employee{
	
	private int people;
	
	public Manager(String name, String lastName, int id, int people) {
		super(name, lastName, id);
		this.people = people;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Number of people the manager is responsible for: " + people);
	}
	
	public void makeRaise(int amount) {
		System.out.println(getName() + " was given a raise of " + amount + " dollars.");
	}

}
