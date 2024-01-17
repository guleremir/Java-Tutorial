import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		String[][] cars = new String[3][3];
		cars[0][0] = "Ford";
		cars[0][1] = "Camaro";
		cars[0][2] = "Mercedes";
		cars[1][0] = "Renault";
		cars[1][1] = "Mazda";
		cars[1][2] = "Bmw";
		cars[2][0] = "Corvette";
		cars[2][1] = "Ferrari";
		cars[2][2] = "Tesla";

		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars.length; j++) {
				System.out.println(cars[i][j]);
			}
			System.out.println();
		}

	}
}
