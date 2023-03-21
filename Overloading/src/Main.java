
public class Main {
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void add(String a, String b) {
		System.out.println(a + " " + b);
	}
	
	public static void add(double a, double b, double c) {
		System.out.println("Result: " + (a + b + c));
	}
	
	public static void main(String[] args) {
		System.out.println(add(3, 4, 5));
		add("user", "1");
		add(1.0, 2.0, 3.0);
	}

}
