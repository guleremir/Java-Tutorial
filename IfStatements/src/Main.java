import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = scan.nextInt();
		
		if(age >= 18) {
			System.out.println("You are an adult");
		}else if (age >= 13 && age<18) {
			System.out.println("You are a teenager");
		} else {
			System.out.println("Your are child");
		}
		scan.close();
	}

}
