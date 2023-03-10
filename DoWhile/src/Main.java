import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		int i = 0;
		do {
			System.out.println(i);
			i++;
			
		}while(i < 10);
		*/
		
		//Find the sum of the digits of a number
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int number = scanner.nextInt();
		int sum = 0;
		
		do {
			sum += number % 10;
			number = number / 10;
		}while(number > 0);
		
		System.out.println("Result = " + sum);
	}

}
