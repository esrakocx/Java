import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the exercise program!\n");
		String exercises = "Burpee\n" +
						   "Push-up\n" +
						   "Sit-up\n" +
						   "Squat\n";
		System.out.println(exercises);
		
		System.out.println("Create an exercises program.");
		
		System.out.print("Enter burpee number: ");
		int burpee = scanner.nextInt();
		System.out.print("Enter push-up-number: ");
		int pushup = scanner.nextInt();
		System.out.print("Enter sit-up number: ");
		int situp = scanner.nextInt();
		System.out.print("Enter squat number: ");
		int squat = scanner.nextInt();
		
		scanner.nextLine();
		
		Exercise exercise = new Exercise(burpee, pushup, situp, squat);
		
		System.out.println("Your exercise is starting...");
		while(exercise.isOver() == false) {
			System.out.print("Enter an exercise(Burpee, Pushup, Situp, Squat): ");
			String type = scanner.nextLine();
			
			System.out.print("Enter its amount: ");
			int number = scanner.nextInt();
			scanner.nextLine();
			
			exercise.doExercise(type, number);
		}
		
		System.out.println("You have completed your exercise successfully!");
	}
}
