
public class Main {

	public static void main(String[] args) {

		String[] cars = { "Camaro", "Corvette", "Ford" };
		String[] cars2 = cars;
		cars[0] = "Mustang";

		System.out.println(cars2[0]);

		String[] foods = new String[3];
		foods[0] = "Hamburger";
		foods[1] = "Pizza";
		foods[2] = "Pasta";

		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);;
		}

	}

}
