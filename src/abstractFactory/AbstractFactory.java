package abstractFactory;

public abstract class AbstractFactory {
	//Método responsável por receber a informação do carro escolhido e prepara-lo
	public Car create(String requestedGrade) {
		Car car = retrieveCar(requestedGrade);
		car= prepareCar(car);
		return car;
	}
	//Método que irá preparar o carro 
	private Car prepareCar(Car car) {
		car.cleanCar();
		car.fuelCar();
		car.mechanicCheck();
		return car;
	}
	
	abstract Car retrieveCar(String requestedGrade);
}

