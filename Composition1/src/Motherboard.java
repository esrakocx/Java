
public class Motherboard {
	
	private String model;
	private String producer;
	private int port;
	private String operating_system;
	
	public Motherboard(String model, String producer, int port, String operating_system) {
		
		this.model = model;
		this.producer = producer;
		this.port = port;
		this.operating_system = operating_system;
	}
	
	public void upload_os(String operating_system) {
		this.operating_system = operating_system;
		System.out.println("The operating system is uploaded...: " + operating_system);
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getProducer() {
		return producer;
	}
	
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	public String getOperating_system() {
		return operating_system;
	}
	
	public void setOperating_system(String operating_system) {
		this.operating_system = operating_system;
	}

}
