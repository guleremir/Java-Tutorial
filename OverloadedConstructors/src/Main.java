
public class Main {

	public static void main(String[] args) {

		Pizza pizza = new Pizza("Special", "tomato", "mozzeralla", "pepperoni");
		Pizza pizza2 = new Pizza("Beef", "bbq", "mozzeralla" );

		
		System.out.println("Enjoy your pizza : "+ pizza.bread);
		System.out.println("Enjoy your pizza : "+ pizza2.bread);
		
	}
}
