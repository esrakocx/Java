import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/*
		Wrapper Class:
		
		boolean --------> Boolean
		char    --------> Character
		byte    --------> Byte
		short   --------> Short
		int     --------> Integer
		long    --------> Long
		float   --------> Float
		double  --------> Double
		 */
		
		// ArrayList<int> arrayList = new ArrayList<int>(); error, because int is a primitive data type
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			// arrayList.add(Integer.valueOf(i*4)); // Autoboxing
			arrayList.add(i*4);
		}
		
		for(int i = 0; i < arrayList.size(); i++) {
			//arrayList.add(arrayList.get(i).intValue()); // Unboxing
			System.out.println(arrayList.get(i));
		}
	}

}
