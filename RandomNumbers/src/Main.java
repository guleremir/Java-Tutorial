import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		Random rnd = new Random();
		
		int x = rnd.nextInt(0,10);
		double y = rnd.nextDouble(0,100);
		boolean z = rnd.nextBoolean();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
	}

}
