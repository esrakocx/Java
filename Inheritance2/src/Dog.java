
public class Dog extends Animal {
	
	private int teeth;
	
	public Dog(String name, int weight, int height, int legs, int teeth) {
		super(name, weight, height, legs);
		this.teeth = teeth;
	}
	
	@Override
	public void move(int speed) {
		System.out.println("Dog moves with speed of " + speed);
	}
	
	public void run(int speed) {
		System.out.println("Dog is running...");
		super.move(speed); // == move(speed);
		move(speed);
	}
	
	public int getTeeth() {
		return teeth;
	}
	
	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}

}
