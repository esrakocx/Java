import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//DIFFERENT USAGE OF FOR LOOP
		
		/* 
		int i;
		for(i = 0; i < 10; i++)
			System.out.println(i);
		*/
		
		/*
		for(int i = 0; i < 10; i++)
			System.out.println(i);
		*/
		
		/*
		for(int i = 10; i >= 0; i--)
			System.out.println(i);
		*/
		
		/*
		int i = 0;
		for(; i < 10; i++)
			System.out.println(i);
		*/
		
		/*
		int i = 0;
		int j = 10;
		
		for(; i < 10 && j > 0; i++, j--) {
			System.out.print("i = " + i);
			System.out.println(" j = " + j);
		}
		*/
		
		/*
		for(int i = 2; i < 100; i *= 2)
			System.out.println(i);
		*/
		
		//Factorial 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		int fact = 1, i;
		
		for(i = 1; i <= num; i++)
			fact *= i;
		
		System.out.println(num + "! = " + fact);
	}
}
