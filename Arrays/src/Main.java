import java.util.Scanner;

public class Main {
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Element " + (i + 1) + ": " + arr[i]);
		}
	}
	
	public static double findAvrg(double[] array) {
		
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

	public static void main(String[] args) {
		
		//int a;
		int[] a = new int[10];
		double[] b;
		
		//a[5] = 1;
		int[] c = {30, 40, 50, 60, 70};
		System.out.println(c[0]);
		
		for(int i = 0; i < 10; i++) {
			a[i] = i* 4 + 2;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		int[] d = new int[7];
		
		for(int j = 0; j < 7; j++) {
			d[j] = scanner.nextInt();
		}
		for(int j = 0; j < 7; j++) {
			System.out.println(d[j]);
		}
		
		System.out.println("The length of the array: " + c.length);
		
		printArray(c);
		
		double[] e = {1.2, 23.4, 5.6, 4.5, 2.9};
		System.out.println(findAvrg(e));

	}

}
