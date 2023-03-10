
public class Main {
	public static void main(String[] args) {
		
		/* 
		   + --> addition
		   - --> subtraction  
		   / --> division
		   * --> multiplication
		   % --> remainder	
		 
		 */ 
		
		System.out.println(3 + 4.4);
		System.out.println(3 - 5f);
		System.out.println(10 / 4);
		System.out.println(10d / 4);
		System.out.println(10 / 4.0);
		System.out.println(3 * 4.5);
		System.out.println(10 % 4);
		
		int a = 4;
		a = a + 2; // a += 2;
		System.out.println(a);
		
		int b = 6;
		b = b * 3; // b *= 3; 
		System.out.println(b);
		
		int c = 5;
		c -= 1; // c--;
		c += 1; // c++;
		System.out.println(c);
		
		//System.out.println(++c);  Output = 6
		System.out.println(c++); // Output = 5
		
		System.out.println(3f / 4 + 4 * 5);
	}
}
