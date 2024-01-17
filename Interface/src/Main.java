
public class Main {

	public static void main(String[] args) {

		Rabbit rabbit = new Rabbit();
		rabbit.flee();

		Hawk hawk = new Hawk();
		hawk.hunt();
		// hawk.flee(); --The method flee() is undefined for the type Hawk

		Fish fish = new Fish();
		fish.flee();
		fish.hunt();

	}
}
