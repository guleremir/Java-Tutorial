import java.util.Random;

public class DiceRoller {
	// Random rnd = new Random();
	//	int number = 0;
	DiceRoller() {
		Random random = new Random();
		int number = 0;
		roll(random, number);
	}

	void roll(Random random, int number) {
		number = random.nextInt(1, 7);
		System.out.println(number);
	}
	
//	void roll() {
//		number = random.nextInt(1, 7);
//		System.out.println(number);
//	}

}
