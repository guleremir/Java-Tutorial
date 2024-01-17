import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double x = 3.14;
		double y = -10;

		double result = Math.max(x, y);
		// double result = Math.min(x, y);
		// double result = Math.abs( y);
		// double result = Math.sqrt(y);
		// double result = Math.round(y);
		// double result = Math.ceil(x);
		// double result = Math.floor(y);
		System.out.println(result);

		double k;
		double l;
		double m;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter side x : ");
		x = scan.nextDouble();
		System.out.println("Enter side y : ");
		y = scan.nextDouble();

		m = Math.sqrt((x * x) + (y * y));
		
		System.out.println("The hypotenuse is : " + m);
		scan.close();

	}

}
