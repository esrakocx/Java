
public class Main {
	
	public static void make_speak(Object object) {
		//System.out.println(object.speak()); //error
		
		if(object instanceof Animal) {
			Animal animal = (Animal) object;
			System.out.println(animal.speak());
		}
		else if(object instanceof Dog) {
			Dog dog = (Dog) object;
			System.out.println(dog.speak());
		}
		else if(object instanceof Cat) {
			Cat cat = (Cat) object;
			System.out.println(cat.speak());
		}
		else if(object instanceof Horse) {
			Horse horse = (Horse) object;
			System.out.println(horse.speak());
		}
	}

	public static void main(String[] args) {
		
		/*Animal animal = new Animal("Lemon");
		System.out.print(animal.speak());

		Animal cat = new Cat("Boncuk");
		System.out.println(cat.speak());
		
		Animal dog = new Dog("Karabas");
		System.out.println(dog.speak());
		*/
		
		make_speak(new Cat("Tekir"));
		make_speak(new Dog("Karabas"));
		make_speak(new Horse("Lemon"));
		
		Dog dog1 = new Dog("Karabas");
		
		
		// usage of instanceof keyword
		if(dog1 instanceof Dog) { //true
			System.out.println("This object is from Dog class.");
		}
		
		if(dog1 instanceof Animal) { //true (inherited)
			System.out.println("This object is from Dog class.");
		}
		
		// Object class
		Animal animal = new Animal("Lemon");
		Cat cat = new Cat("Boncuk");
		Dog dog = new Dog("Karabas");
		Horse horse = new Horse("John");
		
		make_speak(new Animal("Lemon"));
		make_speak(new Cat("Tekir"));
		make_speak(new Dog("Karabas"));
		make_speak(new Horse("John"));
		
		
	}

}
