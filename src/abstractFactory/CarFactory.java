package abstractFactory;

public class CarFactory extends AbstractFactory {
	
	@Override
	Car retrieveCar(String requestedGrade) {
		switch (requestedGrade) {
		case "A": 
			return new Wolks(60, "gasoline", "white");
		
		case "B":
			return new Toyota(75, "gasoline", "gray");
			
		default:
			System.out.println("The requested car is not available at the moment");
			return null;
		}
	}}
