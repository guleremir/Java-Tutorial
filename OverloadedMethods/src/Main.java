
public class Main {

	public static void main(String[] args) {

		// same name but have different parameters

		int x = add(2, 3);
		int y = add(2, 3, 4);

		System.out.println(x);
		System.out.println(y);
		System.out.println(add(x, y));

	}

	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}

	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}

}
