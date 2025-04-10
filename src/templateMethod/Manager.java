package templateMethod;

public class Manager extends Worker{

	@Override
	public void dailyRoutine() {
		System.out.println("Today you will work in your office");
		
	}

	@Override
	public void relax() {
		System.out.println("Play with your son");
		
	}

	@Override
	public void work() {
		System.out.println("Work as a manager");
		
	}


}
