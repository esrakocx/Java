
public class Test {
	public static void main(String[] args) {

		Resolution resolution = new Resolution(1920, 1080);
		Monitor monitor = new Monitor("VS197DE", "A", "18.5", resolution);
		
		Case comp_case = new Case("Shodow Blade", "Shadow", "Tempered Glass");
		
		Motherboard motherboard = new Motherboard("B250-PRO", "Asus", 10, "Windows 10");
		
		Computer pc = new Computer(monitor, comp_case, motherboard);
		
		pc.getCase().turnOn();
		pc.getMonitor().shutDown();
		pc.getMotherboard().upload_os("Ubuntu 16.0.4");
		
	}
}
