
public class Test {
	public static void main(String[] args) {
		
		Resolution resolution = new Resolution(1920, 1080);
		Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);
		Case case1 = new Case("Shadow Blade", "Shadow", "Glass");
		Motherboard motherboard = new Motherboard("B250-PRO", "ASUS", 10, "Windows 10");
		Computer pc = new Computer(monitor, case1, motherboard);
		
		pc.getCase().turnOn();
		pc.getMonitor().shutDown();
		pc.getMotherboard().upload_os("Ubuntu 16.04");
	}
}
