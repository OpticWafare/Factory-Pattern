class Factory{
	public static final int CAR = 0;
	public static final int MOTORCYCLE = 1;
	
	public Vehicle createVehicle(int i){
		switch(i){
		case CAR:
			return new Car();
		case MOTORCYCLE:
			return new Motorcycle();
		default:
			throw new IllegalArgumentException(
				"Wrong vehicle number!");
		}
	}
}