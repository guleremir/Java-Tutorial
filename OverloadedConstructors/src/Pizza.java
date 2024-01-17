
public class Pizza {

	String bread;
	String sauce;
	String cheese;
	String topping;

	public Pizza(String bread, String sauce, String cheese, String topping) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
		System.out.println("4 prop constructor");
	}

	public Pizza(String bread, String sauce, String cheese) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		System.out.println("3 prop constructor");

	}

	public Pizza() {
		System.out.println("0 prop constructor");

	}

}
