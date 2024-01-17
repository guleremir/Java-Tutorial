
public class Car {

	String make = "Ford";
	String model = "Mustang";
	String color = "Red";
	int year = 2021;

	@Override
	public String toString() {
		String myString = make + " " + model + " " + color + " " + year;
		return myString;

	}
}
