
public class Main {

	public static void main(String[] args) {

		Human human = new Human("Coder", 24, 78.6);
		Human human1 = new Human("Hacker", 22, 82.3);

		System.out.println(human.name);
		System.out.println(human1.name);
		human.eat();
		human1.drink();

	}
}
