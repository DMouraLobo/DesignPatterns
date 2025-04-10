package templateMethod;

public class FireFitghter extends Worker {

	@Override
	public void dailyRoutine() {
		System.out.println("Today you will work in Chicago");
		
	}

	@Override
	public void work() {
		System.out.println("Work as a FireFighter");
		
	}

	@Override
	public void relax() {
		System.out.println("Watch a movie");
		
	}



}
