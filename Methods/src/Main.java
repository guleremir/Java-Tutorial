
public class Main {

	public static void main(String[] args) {

		hello();
		hello();
		helloName("Code");
		int age = 23;

		helloAndAge("Coder", age);

		int x = 3;
		int y = 4;

		System.out.println(result(x, y));

	}

	static void hello() {
		System.out.println("Hello");
	}

	static void helloName(String name) {
		System.out.println("Hello " + name);
	}

	static void helloAndAge(String name, int age) {
		System.out.println("Hello " + name + " you are " + age + " years old.");
	}

	static int result(int x, int y) {
		return x + y;
	}

}
