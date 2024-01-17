import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter a whole number to divide : ");
			int x = scan.nextInt();

			System.out.println("Enter a whole number to divide by : ");
			int y = scan.nextInt();

			int z = x / y;

			System.out.println("Result is : " + x);
		} catch (Exception e) {
			System.out.println("Wrong answer : " + e.getMessage());
			Main.main(args);
			;

		}

	}

}
