
public class Developer extends Employee{
	
	private String languages;
	
	public Developer(String name, String lastName, int id, String languages) {
		super(name, lastName, id);
		this.languages = languages;
	}
	
	public void format(String OS) {
		System.out.println(getName() + " is uploading OS : " + OS);
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Languages that developer knows: " + languages);
	}
}
