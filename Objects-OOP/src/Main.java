
public class Main {

	public static void main(String[] args) {
		
		// object --> phone, desk, computer, coffee
    //classN-objName-className
		Car car1 = new Car();
		Car car2 = new Car();
		car2.color = "Red";
		
		System.out.println(car1.color);
		System.out.println(car1.make);
		System.out.println(car1.year);
		System.out.println(car2.color);

		car1.drive();
		car1.brake();

	}

}
