public class FactoryPattern {
	public static void main(String[] args){
		Factory f = new Factory();

		Vehicle newCar = 
			f.createVehicle(0);
		
		Vehicle newMotorcycle = 
			f.createVehicle(1);
		
		System.out.println(
			newCar.getName() + ": " + 
			newCar.getCountOfTires() + 
			" tires");
		System.out.println(newMotorcycle.getName()
			+ ": " + newMotorcycle.getCountOfTires()
			+ " tires");
	}
}


