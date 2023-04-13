
public class Employee { //Super class or Base class
	
	private String name;
	private int salary;
	private String department;
	
	//Constructor
	public Employee(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public void work() {
		System.out.println("Employee is working.");
	}
	
	public void displayInfo() {
		
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Department: " + department);
	}
	
	public void changeDepartment(String new_department) {
		
		System.out.println("Department is changing...");
		this.department = new_department;
		
		System.out.println("New department: " + this.department);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

}
