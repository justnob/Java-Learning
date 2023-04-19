package NegativeExit;

import java.util.Scanner;

public class psitiveNumberRunner {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int number = -1;

			do {
				if(number != -1) {
					System.out.println("Cube is: " + (number*number*number));
				}
				System.out.print("Please enter the number: ");
				 number = scanner.nextInt();		

			} while (number >= 0);
		}
		System.out.println("Thank you! Have Fun !");

	}

}
