
public class Main {

	public static void main(String[] args) {
		
		String a = "Esra";
		String b = new String("Esra");
		
		System.out.println("The size of letters: " + b.length());
		
		// b[0]; false
		System.out.println("0th index: " + b.charAt(0));
		System.out.println("The last element: " + b.charAt(b.length() - 1));
		
		for(int i = 0; i < b.length(); i++) {
			System.out.println(b.charAt(i));
		}
		
		System.out.println(b.startsWith("Es")); // true
		System.out.println(b.endsWith("ar")); //false
		
		System.out.println(b.indexOf('s')); //1
		System.out.println(b.lastIndexOf('a')); //3
		
		System.out.println(b.toUpperCase());
		System.out.println(b.toLowerCase());
		
		String c = "1923";
		int d = Integer.parseInt(c);
		System.out.println(d - 42);
		
		int e = 1930;
		String f = String.valueOf(e);
		System.out.println(f);
		
		String a1 = "Esra";
		//String a2 = "Esra"; equals with a1
		String a2 = new String(); // it is in a different place
		String a3 = "esra";
		String a4 = "esra";
		
		if(a1 == a2)
			System.out.println("Equals");
		else
			System.out.println("Not eqauls");
		
		
		if(a1 == a3)
			System.out.println("Equals");
		else
			System.out.println("Not eqauls");
		
		
		if(a3.equals(a4))
			System.out.println("Equals");
		else
			System.out.println("Not eqauls");
	}

}
