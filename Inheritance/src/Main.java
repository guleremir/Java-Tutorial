
public class Main {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.go();

		Bicycle bicycle1 = new Bicycle();
		bicycle1.stop();

		System.out.println(car1.speed);
		System.out.println(bicycle1.speed);

		System.out.println(car1.doors);
		System.out.println(bicycle1.pedals);

	}

}
