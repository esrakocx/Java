import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Employees Program...");
		String process = "Processes\n"
					   + "1 - Developer Process\n"
					   + "2 - Manager Process\n"
					   + "3 - Exit";
		System.out.println("***************************");
		System.out.println(process);
		System.out.println("***************************");
		
		while(true) {
			System.out.print("Your choice for main program: ");
			String choice = scanner.nextLine();
			
			if(choice.equals("3")) {
				System.out.println("Exiting from main program...");
				break;
			}
			else if(choice.equals("1")) {
				
				Developer developer = new Developer("Mark", "Zuckerberg", 12345, "C, Python, Java");
				
				String developer_process = "Developer Process\n" 
										 + "1 - Format\n"
										 + "2 - Show Info\n"
										 + "3 - Exit";
				
				System.out.println("***************************");
				System.out.println(developer_process);
				System.out.println("***************************");							
				
				while(true) {
					System.out.print("Your choice for developer process: ");
					String choice2 = scanner.nextLine();
					
					if(choice2.equals("3")) {
						System.out.println("Exiting from developer process...");
						break;
					}
					
					else if(choice2.equals("1")) {
						System.out.print("Operating system: ");
						String os = scanner.nextLine();
						developer.format(os);
					}
					
					else if(choice2.equals("2"))
						developer.showInfo();
					
					else
						System.out.println("Invalid choice!");
					
				}
			}
			else if(choice.equals("2")) {
				
				Manager manager = new Manager("Elon", "Musk", 23456, 20);
				
				String manager_process = "Processes\n"
									   + "1 - Make raise\n"
									   + "2 - Show Info\n"
									   + "3 - Exit";
				
				System.out.println("***************************");
				System.out.println(manager_process);
				System.out.println("***************************");	
				
				while(true) {
					System.out.println("Your choice for manager process: ");
					String choice3 = scanner.nextLine();
					
					if(choice3.equals("3")) {
						System.out.println("Exiting from manager process...");
						break;
					}
					
					else if(choice3.equals("1")) {
						System.out.print("Amount of raise: ");
						int amount = scanner.nextInt();
						scanner.nextLine();
						manager.makeRaise(amount);
						
					}
					
					else if(choice3.equals("2"))
						manager.showInfo();
					
					else
						System.out.println("Invalid choice");
				}
				
			}
			else
				System.out.println("Invalid choice!");
		}
	}
}
