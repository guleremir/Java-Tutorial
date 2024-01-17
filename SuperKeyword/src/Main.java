
public class Main {

	public static void main(String[] args) {

		Hero hero1 = new Hero("Batman", 43, "$$$");
		Hero hero2 = new Hero("Superman", 45, "$$$$$$");

		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);

		System.out.println(hero2.toString());
	}

}
