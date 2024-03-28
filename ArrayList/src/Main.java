import java.util.ArrayList;

public class Main {
	
	public static void printAList(ArrayList<String> arrList) {
		for(int i = 0; i < arrList.size(); i++) {
			System.out.println("Element " + (i + 1) + " : " + arrList.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Metallica");
		arrayList.add("Guns'n Roses");
		arrayList.add("Black Sabbath");
		arrayList.add("Iron Maiden");
		
		System.out.println(arrayList.get(0)); //0th index
		System.out.println(arrayList.get(3)); //3rd index
		
		//the length of the ArrayList
		System.out.println(arrayList.size());
		
		arrayList.remove("Metallica");
		//arrayList.remove(0);
		
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		// to learn the place of the array:
		System.out.println(arrayList.indexOf("Black Sabbath"));
		System.out.println(arrayList.lastIndexOf("Iron Maiden")); //to start at the end of the array
		// it is printed -1 if the element does not exist in the arrayList
		
		arrayList.set(2, "Megadeth");
		// It updates the given index as the given element
		
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		printAList(arrayList);
		
	}

}
