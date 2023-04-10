import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many prime do you want to create?: ");
		int amount = scanner.nextInt();
		int num = 2;
		
		while(amount > 0) {
			
			if(isPrime(num)) {
				System.out.print(num + " ");
				amount--;
			}
			num++;
		}
	}
	
	public static boolean isPrime(int number) {
		
		if(number <= 1)
			return false;
		
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0)
				return false;
		}
		return true;
	}
}

