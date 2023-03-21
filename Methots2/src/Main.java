
public class Main {
	
	public static int add(int a, int b, int c) {
		return a + b + c; 
	}
	
	public static int power(int a, int b) {
		
		int c = 1;
		for(int i=1; i<=b; i++) 
			c *= a;
		
		return c;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		System.out.print("Result: " + multiply(power(add(1,2,3),2),3));
	}
}
