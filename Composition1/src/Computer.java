public class Computer {
	
	private Monitor monitor;
	private Case case1;
	private Motherboard motherboard;
	
	public Computer(Monitor monitor, Case case1, Motherboard motherboard) {
		this.monitor = monitor;
		this.case1 = case1;
		this.motherboard = motherboard;
	}
	
	public Monitor getMonitor() {
		return monitor;
	}
	
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	public Case getCase() {
		return case1;
	}
	
	public void setCase(Case case1) {
		this.case1 = case1;
	}
	
	public Motherboard getMotherboard() {
		return motherboard;
	}
	
	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}

}
