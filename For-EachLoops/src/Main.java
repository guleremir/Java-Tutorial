import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		String[] animals = { "Cat", "Dog", "Rat", "Bird" };
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Mercedes");
		cars.add("Renault");
		cars.add("Mazda");
		cars.add("Honda");
		
		for (String an : animals) {
			System.out.println(an);
		}
		
		System.out.println("----");
		
		for(String car : cars) {
			System.out.println(car);
		}

	}

}
