import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		int i = 0;
		while(i < 20) {
			if(i == 10)
				break;
			System.out.println("i = " + i);
			i++;
		}
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Enter a number: ");
			int opr = scanner.nextInt();
			
			if(opr == -1) {
				System.out.println("Exiting...");
				break;
			}
			
		}
		*/
		
		/*
		for(int i = 0; i < 10; i++) {
			if(i == 3 || i == 5)
				continue;
			
			System.out.println("i = " + i);
		}
		*/
		
		int i = 0; 
		while(i < 10) {
			
			if(i == 3 || i == 5) {
				i++;
				continue;
			}
			
			System.out.println("i = " + i);
			i++;
		}
	}

}
