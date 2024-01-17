
public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("Mercedes", "A180", 2022);
		// car1.make; ---The field Car.make is not visible
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());

		car1.setYear(2024);
		System.out.println("Changed year : " + car1.getYear());
	}

}
