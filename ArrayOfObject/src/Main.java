
public class Main {

	public static void main(String[] args) {

//		int[] numbers = new int[3];
//		char[] characters = new char[4];
//		String[] strings = new String[5];

//		Food[] foods = new Food[4];

		Food food1 = new Food("Apple");
		Food food2 = new Food("Banana");
		Food food3 = new Food("Pizza");
		Food food4 = new Food("Hamburger");

		Food[] foods = { food1, food2, food3, food4 };

		foods[0] = food1;
		foods[1] = food2;
		foods[2] = food3;
		foods[3] = food4;

		System.out.println(foods[0]);

	}
}
