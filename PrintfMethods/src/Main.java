
public class Main {

	public static void main(String[] args) {

//		System.out.printf("This is a format string %d", 123);
//		System.out.printf("%d This is a format string", 123);

		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Coder";
		int myInt = 50;
		double myDouble = 1000.3;

		// [conversion-char]
		System.out.printf("%b", myBoolean);
		System.out.printf("%c", myChar);
		System.out.printf("%s", myString);
		System.out.printf("%d", myInt);
		System.out.printf("%f", myDouble);
		
		System.out.println("---");
		
		//[width]
		System.out.printf("Hello %10s", myString);
		
		System.out.println("---");

		//[precision]
		System.out.printf("You have this much money %.1f", myDouble);
		
		System.out.println("---");

		//[flags]
		System.out.printf("You have this much money %+f", myDouble);

		
		
	}

}
