package abstractFactory;

public abstract class Car {

		int horsePower;
		String fuelType;
		String color; 
		
//	Método responsável por definir as caracteristicas do carro
		public Car(int horsePower, String fuelType, String color) {
			this.horsePower = horsePower;
			this.fuelType = fuelType;
			this.color = color;
		}
		
		
		public void cleanCar() {
			System.out.println("the car has been cleaned, and the" + color.toLowerCase() + "color shines");
		}
		public void fuelCar() {
			System.out.println("the "+ fuelType + "is filled" );
		}
		public void mechanicCheck() {
			System.out.println("The engine has been tested and the " + horsePower + "HP are OK" );
		}
		public void startEngine() {
			System.out.println("The engine has been started, and the car is ready to be driven" );	
		}

		public int getHorsePower() {
			return horsePower;
		}


		public String getFuelType() {
			return fuelType;
		}


		public String getColor() {
			return color;
		}


		public void setHorsePower(int horsePower) {
			this.horsePower = horsePower;
		}


		public void setFuelType(String fuelType) {
			this.fuelType = fuelType;
		}


		public void setColor(String color) {
			this.color = color;
		}
}
