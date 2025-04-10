package templateMethod;

public class Lumberjack extends Worker {

	@Override
	public void dailyRoutine() {
		System.out.println("Today you will work in São Paulo");
		
	}

	@Override
	public void relax() {
		System.out.println("Go out for a drink");
		
	}

	@Override
	public void work() {
		System.out.println("Work as a LumberJack");
		
	}


}
