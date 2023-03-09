import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		*/
		/*
		int i = 10;
		while(i < 100) {
			System.out.println(i);
			i += 3;
		}
		*/
		
		//Factorial
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		
		int fact = 1;
		while(num > 0) {
			fact *= num;
			num--;
		}
		
		System.out.println("Result = " + fact);
	}
}