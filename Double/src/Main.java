
public class Main {

	public static void main(String[] args) {
		
		//Double : 64 bit = 8 byte
		//Float  : 32 bit = 4 byte
		
		//Automatic conversion : int --> float --> double
		
		double a = 5.25;
		double b = 4.0;
		double c = 4d; // 4.0
		double d = 4.23d;
		
		float e = (float)5.0;
		float f = 5f;
		float g = 5.25f;
		
		int h = 22/7;
		float i = 22f/7f;
		double j = 22d/7d;
		
		System.out.println("h: " + h);
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
		//Automatic conversion
		int k = 5;
		float l = k;
		System.out.println("l: " + l);
		
		double m = 3.52;
		float n = (float)m;
		System.out.println("n: " + n);
		
		double num1 = 70.25;
		double num2 = 60d;
		double num3 = 80.2;
		System.out.println("Average: " + (num1 + num2 + num3)/3);
		
		float numb1 = 70.25f;
		float numb2 = 60f;
		float numb3 = 80.2f;
		System.out.println("Average2: " + (numb1 + numb2 + numb3)/3);
		
	}
	
}
