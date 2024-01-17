
public class Main {

	public static void main(String[] args) {

		// static - access modifier
		System.out.println(Friend.numberOfFriends);

		Friend friend1 = new Friend("Jack");
		Friend friend2 = new Friend("Jhon");
		Friend friend3 = new Friend("Patrick");

		System.out.println(Friend.numberOfFriends);
		Friend.dispalyFriends();

		double number = Math.round(12.3);
		System.out.println(number);

	}

}
