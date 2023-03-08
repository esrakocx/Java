import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1st number: ");
		int num1 = scanner.nextInt();
		System.out.print("2nd number: ");
		int num2 = scanner.nextInt();
		System.out.print("3rd number: ");
		int num3 = scanner.nextInt();
		
		if(num1 > num2 && num1 > num3)
			System.out.println("Max one: " + num1);
		else if(num2 > num1 && num2 > num3)
			System.out.println("Max one: " + num2);
		else
			System.out.println("Max one: " + num3);
	}

}
