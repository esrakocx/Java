
public class Exercise {

	private int burpee_number;
	private int pushup_number;
	private int situp_number;
	private int squat_number;
	
	public Exercise(int burpee_number, int pushup_number, int situp_number, int squat_number) {
		this.burpee_number = burpee_number;
		this.pushup_number = pushup_number;
		this.situp_number = situp_number;
		this.squat_number = squat_number;
	}
	
	public int getBurpee_number() {
		return this.burpee_number;
	}
	
	public void setBurpee_number(int burpee_number) {
		this.burpee_number = burpee_number;
	}
	
	public int getPushup_number() {
		return pushup_number;
	}
	
	public void setPushup_number(int pushup_number) {
		this.pushup_number = pushup_number;
	}
	
	public int getSitup_number() {
		return this.situp_number;
	}
	
	public void setSitup_number(int situp_number) {
		this.situp_number = situp_number;
	}
	
	public int getSquat_number() {
		return this.squat_number;
	}
	
	public void setSquat_number(int squat_number) {
		this.squat_number = squat_number;
	}
	
	public void doExercise(String exercise, int number) {
		
		if(exercise.equals("Burpee"))
			do_burpee(number);
		else if(exercise.equals("Pushup"))
			do_pushup(number);
		else if(exercise.equals("Situp"))
			do_situp(number);
		else if(exercise.equals("Squat"))
			do_squat(number);
	}
	
	public void do_burpee(int number) {
		if(burpee_number == 0)
			System.out.println("No more burpees to do!");
		if(burpee_number - number < 0) {
			System.out.println("You have completed your burpee!");
			burpee_number = 0;
			System.out.println("Remaining burpee: " + burpee_number);
		}
		else {
			burpee_number -= number;
			System.out.println("Remaining burpee: " + burpee_number);
		}
	}
	
	public void do_pushup(int number) {
		if(pushup_number == 0)
			System.out.println("No more push-up to do!");
		if(pushup_number - number < 0) {
			System.out.println("You have completed your push-up!");
			pushup_number = 0;
			System.out.println("Remaining push-up: " + pushup_number);
		}
		else {
			pushup_number -= number;
			System.out.println("Remaining push-up: " + pushup_number);
		}
	}
	
	public void do_situp(int number) {
		if(situp_number == 0)
			System.out.println("No more sit-up to do!");
		if(situp_number - number < 0) {
			System.out.println("You have completed your sit-up!");
			situp_number = 0;
			System.out.println("Remaining sit-up: " + situp_number);
		}
		else {
			situp_number -= number;
			System.out.println("Remaining sit-up: " + situp_number);
		}
	}
	
	public void do_squat(int number) {
		if(squat_number == 0)
			System.out.println("No more squat to do!");
		if(squat_number - number < 0) {
			System.out.println("You have completed your squat!");
			squat_number = 0;
			System.out.println("Remaining squat: " + squat_number);
		}
		else {
			squat_number -= number;
			System.out.println("Remaining squat: " + squat_number);
		}
	}
	
	public boolean isOver() {
		return ((burpee_number == 0) && (pushup_number ==0) && (situp_number == 0) && (squat_number == 0));
	}
}
