public class Main {

	public static void main(String[] args) {

		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();

		Vehicle[] racers = { car, bicycle, boat };

//		car.go();
//		bicycle.go();
//		boat.go();

		for (int i = 0; i < racers.length; i++) {
			racers[i].go();
		}

	}
}
