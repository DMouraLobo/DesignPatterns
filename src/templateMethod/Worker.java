package templateMethod;


public abstract class Worker {
	
	//Método para executar/testar o código
	public void execute() {
		dailyRoutine();
		getUp();
		eatBreakfast();
		goToWork();
		work();
		returnToHome();
		relax();
		sleep();
		
	}
	
	//Métodos que terão particularidades de cada classe
	public abstract void dailyRoutine();
	public abstract void relax();
	public abstract void work();	
	
	//Métodos que farão a mesma função em todas as classes
	protected void getUp() {
		System.out.println("It`s time to wake up buddy");
	}
	
	protected void eatBreakfast() {
		System.out.println("Eat scrumbled eggs with orange juice");
	}
	
	protected void goToWork() {
		System.out.println("Drive to work");
	}
	
	protected void returnToHome() {
		System.out.println("Drive back home");
	}
	
	
	protected void sleep () {
		System.out.println("It`s time to sleep my friend");
	}
}

