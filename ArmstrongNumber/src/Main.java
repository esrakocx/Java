import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		 Example: 
		 1634 = 1^4 + 6^4 + 3^4 + 4^4
		 371 = 3^3 + 7^3 + 1^3
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = scanner.nextInt();
		int i=0, sum = 0, digit;
		int temp_num1 = number;
		int temp_num2 = number;
		
		//To find the digit number
		while(number > 0 ) {
			number /= 10;
			i++;
		}
		
		//To find the sum of the digits with power of the digits
		while(temp_num1 > 0) {
			digit = temp_num1 % 10;
			sum += Math.pow(digit, i);
			temp_num1 /= 10;
		}
		
		//If the beginning value of the number is equal to the sum then it is an Armstrong.
		if(sum == temp_num2)
			System.out.println("It is an Armstrong number!");
		else
			System.out.println("It is not an Armstrong number!");
	}
}
