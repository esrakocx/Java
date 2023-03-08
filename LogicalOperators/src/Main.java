
public class Main {
	public static void main(String[] args) {
		 
		/*
		 Logical Operators
		 
		 && --> and Operator
		 || --> or Operator
		 !  --> not Operator
	
		 */
		
		System.out.println(3 == 3 && 2 < 3); //true
		System.out.println(3 == 3 && 2 > 3); //false
		System.out.println(3 == 3 && 2 > 3 && "cat" == "cat"); //false
		System.out.println(3 == 3 && 3 > 2 && "dog" == "dog"); //true
		System.out.println(3 == 3 || 2 < 3 || "rabbit" == "rabbit"); //true
		System.out.println(3 != 3 || 2 > 3 || "rabbit" != "rabbit"); //false
		
		System.out.println(!false); //true
		System.out.println(!true); //false
		System.out.println(!(3 > 4)); //true
		System.out.println(!((3 < 4 && "cat" == "cat") || (3.4 > 2.1))); //false
		
	}

}
