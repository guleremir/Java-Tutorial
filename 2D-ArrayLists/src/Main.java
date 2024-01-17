import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("Pasta");
		bakeryList.add("Bread");
		bakeryList.add("Donuts");

		System.out.println(bakeryList);

		ArrayList<String> produceyList = new ArrayList<String>();
		produceyList.add("Tomatoes");
		produceyList.add("Patatoes");
		produceyList.add("Peppers");

		ArrayList<String> drinkList = new ArrayList<String>();
		drinkList.add("Soda");
		drinkList.add("Coffee");
		drinkList.add("Tea");

		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
		groceryList.add(bakeryList);
		groceryList.add(produceyList);
		groceryList.add(drinkList);

		System.out.println(groceryList.get(0).get(2));

		for (int i = 0; i < groceryList.size(); i++) {
			for (int j = 0; j < groceryList.size(); j++) {
				System.out.print(groceryList.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}

}
