
public class Main {
	public static void main(String[] args) {
		
		// char data type: It is used to show characters. It is equal to 2 byte. 2^16 characters can be symbolized.
		// boolean data type: It is used in conditions. It has true and false value.
		
		char a = 'E';
		char b = '?';
		//char c = '23'; error
		char d = 1000;
		char e = 2000;
		char f = '\u0152';
		char g = '\u063C';
		
		System.out.println(d); //Ϩ 
		System.out.println(e); //ߐ
		System.out.println(f); //Œ
		System.out.println(g); //ؼ
		
		boolean h = true;
		boolean i = false;
		System.out.println(h);
		System.out.println(i);
	}
}
