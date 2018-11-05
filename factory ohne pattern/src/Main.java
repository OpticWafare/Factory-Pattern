
public class Main {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated constructor stub
	
	
	Car newCar = new Car("Car", 4);
	
	Motorcycle newMotorcycle = new Motorcycle("Motorcycle", 2);
	
	System.out.println(
			newCar.getName() + ": " + 
			newCar.getCountTire() + 
			" tires");
		System.out.println(newMotorcycle.getName()
			+ ": " + newMotorcycle.getCountTire()
			+ " tires");

	}	
		
}
