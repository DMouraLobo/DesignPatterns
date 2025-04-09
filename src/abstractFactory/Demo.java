package abstractFactory;

import javax.swing.JOptionPane;

public class Demo {

	public static void main(String[] args) {
		//Instânciando o cliente e requirindo as informações sobre o opção de carro e tipo de contrato
		Customer customerOne = new Customer(getCarType(), getContract());

		AbstractFactory abstractFactory = getFactory(customerOne);
		
		Car car = abstractFactory.create(customerOne.getRequestGrade());
		car.startEngine();

	}
	//Método responsável para pedir ao cliente o tipo de carro desejado
	private static String getCarType() {
		String type = JOptionPane.showInputDialog("Choose between the cars type: A or B");
		return type;
		}
		
	//Método responsável por averiguar se o cliente possui um company contract
	private static Boolean getContract() {
		String info = JOptionPane.showInputDialog("Do you have a company contract?");
		if ("Yes".equalsIgnoreCase(info)) {
		return true;
		} else {
			return false;
		}
	}
	//Método que decide qual carro irá ser entregue 
	private static AbstractFactory getFactory(Customer customerOne) {
		if (customerOne.hasCompanyContract()) {
			return new CompanyCarFactory();
		} else {
			return new CarFactory();
		}
	}

}
