import java.util.Scanner;

public class Main {
	
	public static int find_gcd(int num1, int num2) {
		
		int gcd = 1;
		for(int i = 1; i <= num1 && i <= num2; i++) {
			if(num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}
		
		return gcd;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1st number: ");
		int num1 = scanner.nextInt();
		System.out.print("2nd number: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Result: " + find_gcd(num1, num2));
		
	}
}
