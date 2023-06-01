
public class Employee {
	
	private String name;
	private String lastName;
	private int id;
	
	public Employee(String name, String lastName, int id){
		this.name = name;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String setLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Last name: " + lastName);
		System.out.println("ID: " + id);
	}

}
