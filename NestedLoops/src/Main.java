import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int rows;
		int col;
		String symbol = "";
		
		System.out.println("Enter # of rows : ");
		rows = scan.nextInt();
		
		System.out.println("Enter # of columns : ");
		col = scan.nextInt();
		
		System.out.println("Enter symbol to use : ");
		symbol = scan.next();
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}

	}

}
