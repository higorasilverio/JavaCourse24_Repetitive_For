package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Enter the number to calculate its square and its cube: ");
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.printf("%d\t%d\t%d\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
		}
		
		scanner.close();
	}

}
