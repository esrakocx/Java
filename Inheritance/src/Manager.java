
public class Manager extends Employee{ //Subclass

	private int people;//Extra property
	public Manager(String name, int salary, String department, int people) {
		/*
		this.name = name;
		this.salary = salary;
		this.department= department;
		*/
		super(name, salary, department);
		this.people = people;
	}
	
	public void makeRaise(int amount) {
		System.out.println(amount + " dollar raised.");
	}
	
	//Method override from super class.
	public void displayInfo() {
		/*	
		System.out.println("Name: " + getName());
		System.out.println("Salary: " + getSalary());
		System.out.println("Department: " + getDepartment());
		*/
		super.displayInfo();
		System.out.println("Amount of people: " + this.people);
	}

}
