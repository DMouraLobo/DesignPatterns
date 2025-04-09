package abstractFactory;


public class CompanyCarFactory extends AbstractFactory {
	
	
	@Override
	Car retrieveCar(String requestedGrade) {
		switch (requestedGrade) {
		case "A": 
			return new Tesla(100, "electricity", "grey");
		
		case "B":
			return new Audi(130, "gasoline", "Black");
			
		default:
			System.out.println("The requested car is not available at the moment");
			return null;
		}
			
	}

}
