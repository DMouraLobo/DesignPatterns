package templateMethod;

public class Postman extends Worker {

	@Override
	public void dailyRoutine() {
		System.out.println("Today you will work in NY");
		
	}

	@Override
	public void work() {
		System.out.println("Work as a postman");
		
	}

	@Override
	public void relax() {
		System.out.println("Play videogames");
		
	}
}
	