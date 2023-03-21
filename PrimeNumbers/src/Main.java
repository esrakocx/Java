
public class Main {
	//It prints the prime numbers that from 1 to 1000
	
	public static boolean IsPrime(int number) {
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		for(int number = 2; number <= 1000; number++) {
			if(IsPrime(number))
				System.out.println(number);
		}
	}

}
