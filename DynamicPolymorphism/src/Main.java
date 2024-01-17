import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Animal animal;
		Scanner scan = new Scanner(System.in);

		System.out.println("What animal do you want?");
		System.out.println("1-) Dog || 2-) Cat");
		int choice = scan.nextInt();

		if (choice == 1) {
			animal = new Dog();
			animal.speak();
		} else if (choice == 2) {
			animal = new Cat();
			animal.speak();
		} else {
			animal = new Animal();
			animal.speak();
			System.out.println("Wrong choise");
		}

	}

}
