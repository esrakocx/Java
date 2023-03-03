public class Main {
	
	public static void main(String[] args) {
		
		int a = 4; // 1 int = 4 byte = 32 bit
		// min: -2 ^ 31
		// max: 2 ^ 31 - 1
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		byte b = 100; //1 byte = 8 bit
		//System.out.println(Byte.MAX_VALUE); = 127
		//System.out.println(Byte.MIN_VALUE); = -128
		
		short c = 5;
		//System.out.println(Short.MAX_VALUE);  = 32767
		//System.out.println(Short.MIN_VALUE);  = -32768
		
		long d = 10;
		System.out.println(Long.MAX_VALUE); 
		System.out.println(Long.MIN_VALUE);
		
		
	}
}
